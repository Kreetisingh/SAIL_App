package com.example.hp.sailproductapp.feature;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Durgapurmain_Activity extends AppCompatActivity {

    String JSON_STRING;
    String dataa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }

    public void getJSON(View view) {

        new BackgroundTask().execute();


    }

    class BackgroundTask extends AsyncTask<Void, Void, String> {
        String json_url;


        @Override
        protected void onPreExecute() {
            json_url = "https://api.myjson.com/bins/11nm0a";


            super.onPreExecute();
        }

        @Override
        protected String doInBackground(Void... voids) {
            try {
                String result = "";
                URL url = new URL(json_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

                StringBuilder stringBuilder = new StringBuilder();
                while ((JSON_STRING = bufferedReader.readLine()) != null) {
                    stringBuilder.append(JSON_STRING + "\n");
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return stringBuilder.toString().trim();


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


            return null;


        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(result);
            dataa = result;


        }

    }
    public void parseJSON(View view){
        if(dataa==null){
            Toast.makeText(getApplicationContext(),"first get json",Toast.LENGTH_SHORT).show();
        }
        else{
            Intent intent=new Intent(this,Displaydsp.class);
            intent.putExtra("json_data",dataa);
            startActivity(intent);
        }




    }
}
