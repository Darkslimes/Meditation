package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

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