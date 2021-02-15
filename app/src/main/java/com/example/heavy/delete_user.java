package com.example.heavy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class delete_user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_user);

        getSupportActionBar().setTitle("Delete user");
    }
}