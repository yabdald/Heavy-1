package com.example.heavy;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.graphics.Color;
import android.os.Bundle;
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
        Intent intent = new Intent(this, add_user.class);
        startActivity(intent);
    }
}