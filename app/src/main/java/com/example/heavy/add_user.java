package com.example.heavy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class add_user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        getSupportActionBar().setTitle("Add user");
    }
}