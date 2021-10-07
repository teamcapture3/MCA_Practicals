package com.ninad.asynctaskapi;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@SuppressWarnings("All")
public class MainActivity extends AppCompatActivity {

    String apiUrl = "https://asynctaskapi.herokuapp.com/";
    String company, model, date, price, image;
    TextView TextViewCompany, TextViewModel, TextViewDate, TextViewPrice;
    ProgressDialog progressDialog;
    Button ButtonData;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        TextViewCompany = (TextView) findViewById(R.id.TextViewCompany);
        TextViewModel = (TextView) findViewById(R.id.TextViewModel);
        TextViewDate = (TextView) findViewById(R.id.TextViewDate);
        TextViewPrice = (TextView) findViewById(R.id.TextViewPrice);
        imageView = (ImageView) findViewById(R.id.imageView);
        ButtonData = (Button) findViewById(R.id.ButtonData);
        ButtonData.setOnClickListener(view -> {
            MyAsyncTasks myAsyncTasks = new MyAsyncTasks();
            myAsyncTasks.execute();
        });
    }

    public class MyAsyncTasks extends AsyncTask <String,String,String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.setMessage("Please Wait");
            progressDialog.setCancelable(false);
            progressDialog.show();
        }

        @Override
        protected String doInBackground(String... params) {
            String current = "";
            try {
                URL url;
                HttpURLConnection urlConnection = null;
                try {
                    url = new URL(apiUrl);
                    urlConnection = (HttpURLConnection) url.openConnection();
                    InputStream in = urlConnection.getInputStream();
                    InputStreamReader isw = new InputStreamReader(in);
                    int data = isw.read();
                    while (data != -1) {
                        current += (char) data;
                        data = isw.read();
                        System.out.print(current);
                    }
                    return current;
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (urlConnection != null) {
                        urlConnection.disconnect();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return "Exception: " + e.getMessage();
            }
            return current;
        }

        @Override
        protected void onPostExecute(String s) {
            Log.d("data", s.toString());
            progressDialog.dismiss();
            try {
                JSONArray jsonArray;
                jsonArray = new JSONArray(s);
                JSONObject oneObject = jsonArray.getJSONObject(0);
                company = oneObject.getString("company");
                model = oneObject.getString("model");
                date = oneObject.getString("date");
                price = oneObject.getString("price");
                image = oneObject.getString("image");
                TextViewCompany.setText("Company: "+company);
                TextViewModel.setText("Model: "+model);
                TextViewDate.setText("Date: "+date);
                TextViewPrice.setText("Price: "+price);
                Picasso.with(getApplicationContext()).load(image).into(imageView);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}