package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Login extends AppCompatActivity {
    String url = "http://demo-wsr2.herokuapp.com/";
    String charset = "UTF-8";
    String param1 = "value1";
    String param2 = "value2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void reg(View view){
        Intent i = new Intent(getApplicationContext(), Registration.class);
        startActivity(i);
        finish();
    }
    public void SignIn(View view){
        Intent i = new Intent(getApplicationContext(), home.class);
        startActivity(i);
        finish();
    }

}