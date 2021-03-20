package com.example.heavy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

public class driverHomePage extends AppCompatActivity implements View.OnClickListener{
Button go, offlineBtn ;
ImageView backHome,captinPortalIV,driverProfileIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_home_page);

        go = (Button) findViewById(R.id.goOnline);
        offlineBtn = (Button) findViewById(R.id.goOffline);


        driverProfileIV = (ImageView) findViewById(R.id.profileIcone);
        driverProfileIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(driverHomePage.this, driverProfile.class);
                driverHomePage.this.startActivity(intent);

            }
        });



        captinPortalIV = (ImageView) findViewById(R.id.captainPortalIcone);
       captinPortalIV.setOnClickListener(this);






    }


    @Override
    public void onClick(View view) {
        if(view ==captinPortalIV) {

            Intent i = new Intent(driverHomePage.this, captainPortal.class);
            driverHomePage.this.startActivity(i);
        }
        if(view == go){
            Context context = getApplicationContext();
            CharSequence text = "You Are Online";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

        if(view == offlineBtn){
            Context context = getApplicationContext();
            CharSequence text = "You Are Offline";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }





        }


    }



