package com.example.heavy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main extends AppCompatActivity {

    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        loginBtn = (Button) findViewById(R.id.loginBtn);


        getSupportActionBar().setTitle("Login");
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, admin_dashboard.class);
        startActivity(intent);
    }
}