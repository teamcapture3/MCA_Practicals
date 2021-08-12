package com.ninad.fileoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    EditText TextWrite,TextRead;
    Button create,write,read,delete;
    File ExternalFile;
    String filename = "",filepath = "",filecontent = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        TextWrite=findViewById(R.id.editTextEnterContent);
        TextRead=findViewById(R.id.editTextReadContent);
        create=findViewById(R.id.button_create);
        write=findViewById(R.id.button_write);
        read=findViewById(R.id.button_read);
        delete=findViewById(R.id.button_delete);

        filename = "File.txt";
        filepath = "MyFileDir";
        ExternalFile = new File(getExternalFilesDir(filepath),filename);

        if(!isExternalStorageAvailableForRW()) {
            write.setEnabled(false);
            read.setEnabled(false);
            create.setEnabled(false);
            delete.setEnabled(false);
        }

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ExternalFile.createNewFile();
                    Toast.makeText(MainActivity.this, "File created successfully!", Toast.LENGTH_LONG).show();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filecontent = TextWrite.getText().toString().trim();
                if(!filecontent.equals("")) {
                    FileOutputStream fos = null;
                    try {
                        if (ExternalFile.exists()) {
                            fos = new FileOutputStream(ExternalFile);
                            fos.write(filecontent.getBytes());
                            Toast.makeText(MainActivity.this,"Data saved!",Toast.LENGTH_LONG).show();
                        }
                        else {
                            Toast.makeText(MainActivity.this,"File does not exists",Toast.LENGTH_LONG).show();
                        }
                    }
                    catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                    catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    TextWrite.setText("");
                }
                else {
                    Toast.makeText(MainActivity.this,"Field cannot be empty!",Toast.LENGTH_LONG).show();
                }
            }
        });

        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FileReader fr = null;
                StringBuilder sb = new StringBuilder();
                try {
                    if (ExternalFile.exists()) {
                        fr= new FileReader(ExternalFile);
                        BufferedReader br = new BufferedReader(fr);
                        String line = br.readLine();
                        while(line!=null) {
                            sb.append(line).append('\n');
                            line=br.readLine();
                        }
                    }
                    else {
                        Toast.makeText(MainActivity.this,"File does not exists!",Toast.LENGTH_LONG).show();
                    }
                }
                catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
                finally {
                    if (ExternalFile.exists()){
                        String filecontents = "This file contents\n\n"+sb.toString();
                        TextRead.setText(filecontents);}
                }
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ExternalFile.exists()) {
                    ExternalFile.delete();
                    Toast.makeText(MainActivity.this, "File deleted successfully!", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "File does not exist!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private boolean isExternalStorageAvailableForRW() {
        String extStorageState = Environment.getExternalStorageState();
        if(extStorageState.equals(Environment.MEDIA_MOUNTED)) {
            return true;
        }
        return false;
    }
}
