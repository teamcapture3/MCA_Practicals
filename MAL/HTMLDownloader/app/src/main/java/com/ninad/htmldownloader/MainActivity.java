package com.ninad.htmldownloader;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    EditText editTextURL;
    Button btnDownload;
    TextView textView;
    String str_url;
    File myExternalFile;
    private final String filename = "WebFile.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myExternalFile = new File(Environment.getExternalStorageDirectory(),filename);
        editTextURL = findViewById(R.id.editTextURL);
        btnDownload = findViewById(R.id.button_html);
        textView = findViewById(R.id.textView);
        btnDownload.setOnClickListener(v -> {
            str_url = editTextURL.getText().toString().trim();
            try{
                new GetJSONTask().execute(str_url);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        });
    }

    private class GetJSONTask extends AsyncTask<String, Void, String>
    {
        private ProgressDialog pd;

        protected void onPreExecute()
        {
            super.onPreExecute();
            pd=ProgressDialog.show(MainActivity.this,"","loading",true,false);
        }

        protected String doInBackground(String... urls)
        {
            try
            {
                return Utility.downloadDataFromUrl(urls[0]);
            }
            catch (IOException e)
            {
                return "Unable to retrieve data. Invalid URL.";
            }
        }

        @SuppressLint("SetTextI18n")
        protected void onPostExecute(String result)
        {
            pd.dismiss();
            try
            {
                FileOutputStream fos = new FileOutputStream(myExternalFile);
                fos.write(result.getBytes());
                fos.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            textView.setText("Saved to"+Environment.getExternalStorageDirectory()+"/"+filename);
        }
    }
}
