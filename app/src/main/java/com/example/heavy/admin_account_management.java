package com.example.heavy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class admin_account_management extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_account_management);

        getSupportActionBar().setTitle("Account management");
    }
}