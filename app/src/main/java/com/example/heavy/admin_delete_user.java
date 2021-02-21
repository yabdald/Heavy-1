package com.example.heavy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class admin_delete_user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_delete_user);

        getSupportActionBar().setTitle("Delete user");
    }
}