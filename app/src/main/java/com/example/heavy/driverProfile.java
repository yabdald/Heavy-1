package com.example.heavy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class driverProfile extends AppCompatActivity implements View.OnClickListener{


    ImageView Home,captainProtalBtn;
    Button update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_profile);

        Home =(ImageView) findViewById(R.id.homeIcon);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(driverProfile.this, driverHomePage.class);
                driverProfile.this.startActivity(intent);
            }
        });

        captainProtalBtn=(ImageView)findViewById(R.id.captainPortalIcone);
        captainProtalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(driverProfile.this, captainPortal.class);
                driverProfile.this.startActivity(intent);

            }
        });


        update = (Button) findViewById(R.id.driverUpdateInfoBtn);
        update.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == update){
            Context context = getApplicationContext();
            CharSequence text = "Successfully Updated";
            int duration = Toast.LENGTH_SHORT;


    }
}}