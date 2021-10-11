package com.ninad.datasqlite;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText name, contact, dob;
    Button insert, update, delete, view;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextName);
        contact = findViewById(R.id.editTextContact);
        dob = findViewById(R.id.editTextDOB);
        insert = findViewById(R.id.buttonAdd);
        update = findViewById(R.id.buttonUpdate);
        delete = findViewById(R.id.buttonDelete);
        view = findViewById(R.id.buttonView);
        DB = new DBHelper(this);
        insert.setOnClickListener(view -> {
            String nameTXT = name.getText().toString();
            String contactTXT = contact.getText().toString();
            String dobTXT = dob.getText().toString();
            if(nameTXT.equals("") || contactTXT.equals("") || dobTXT.equals("")) {
                Toast.makeText(getApplicationContext(),"Fields cannot be blank", Toast.LENGTH_LONG).show();
            }
            else {
                Boolean checkinsertdata = DB.insertuserdata(nameTXT, contactTXT, dobTXT);
                if(checkinsertdata==true) {
                    Toast.makeText(MainActivity.this, "Entry Added", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Already Exists", Toast.LENGTH_SHORT).show();
            }
        });
        update.setOnClickListener(view -> {
            String nameTXT = name.getText().toString();
            String contactTXT = contact.getText().toString();
            String dobTXT = dob.getText().toString();
            Boolean checkupdatedata = DB.updateuserdata(nameTXT, contactTXT, dobTXT);
            if(checkupdatedata==true) {
                    Toast.makeText(MainActivity.this, "Entry Updated", Toast.LENGTH_LONG).show();
            }
            else
                Toast.makeText(MainActivity.this, "No Record Found", Toast.LENGTH_SHORT).show();
        });
        delete.setOnClickListener(view -> {
            String nameTXT = name.getText().toString();
            Boolean checkudeletedata = DB.deletedata(nameTXT);
            if(checkudeletedata==true) {
                Toast.makeText(MainActivity.this, "Entry Deleted", Toast.LENGTH_LONG).show();
            }
            else
                Toast.makeText(MainActivity.this, "No Record Found", Toast.LENGTH_SHORT).show();
        });
        view.setOnClickListener(view -> {
            Cursor res = DB.getdata();
            name.setText("");contact.setText("");dob.setText("");
            if(res.getCount()==0) {
                Toast.makeText(MainActivity.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
                return;
            }
            StringBuilder buffer = new StringBuilder();
            while(res.moveToNext()) {
                buffer.append("Name : ").append(res.getString(0)).append("\n");
                buffer.append("Contact : ").append(res.getString(1)).append("\n");
                buffer.append("Date of Birth : ").append(res.getString(2)).append("\n\n");
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setCancelable(true);
            builder.setTitle("Contacts");
            builder.setMessage(buffer.toString());
            builder.show();
        });
    }
}
