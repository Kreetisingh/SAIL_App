package com.example.hp.sailproductapp.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class Frontscreen extends AppCompatActivity {
    TextView textView2;




    public void gobutton(View view){

        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainone);
        textView2=(TextView)findViewById(R.id.textView2);
        WebView webView=(WebView)findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadData("<html> <head> </head> <body> <p> <span style=\"color:green\">  <marquee> WELCOME TO THE PRODUCT OF STEEL AUTHORITY OF INDIA LIMITED ! </marquee> </span> </p></body></html>","text/html","UTF-8");









    }
}
