package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.HorizontalScrollView;

public class home extends AppCompatActivity {
    HorizontalScrollView horizontalScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        horizontalScrollView = findViewById(R.id.horizontalScrollView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        horizontalScrollView.setLayoutManager(linearLayoutManager);
    }
}