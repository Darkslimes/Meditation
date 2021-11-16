package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Onboarding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
    }
    public void OnClick(View view){
        Intent i = new Intent(getApplicationContext(), Login.class);
        startActivity(i);
        finish();
    }
    public void reg(View view){
        Intent i = new Intent(getApplicationContext(), Registration.class);
        startActivity(i);
        finish();
    }
}