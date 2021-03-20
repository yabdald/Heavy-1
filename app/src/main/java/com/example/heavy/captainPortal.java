package com.example.heavy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class captainPortal extends AppCompatActivity implements View.OnClickListener{
    Button payBack;
    ImageView Home,profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captain_portal);

        payBack=(Button) findViewById(R.id.payBack);
        payBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(captainPortal.this, cardPayment.class);
                    captainPortal.this.startActivity(intent);




            }
        });



        Home =(ImageView) findViewById(R.id.homeIcon);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                    Intent intent = new Intent(captainPortal.this, driverHomePage.class);
                    captainPortal.this.startActivity(intent);




            }
        });

       profile =(ImageView) findViewById(R.id.profileIcone);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                    Intent intent = new Intent(captainPortal.this, driverProfile.class);
                    captainPortal.this.startActivity(intent);




            }
        });



    }

    @Override
    public void onClick(View view) {









    }
}