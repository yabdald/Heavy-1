package com.example.heavy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main extends AppCompatActivity {

    Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        loginbtn = (Button) findViewById(R.id.loginbtn);


        getSupportActionBar().setTitle("Login");
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, admin_add_user.class);
        startActivity(intent);
    }
}