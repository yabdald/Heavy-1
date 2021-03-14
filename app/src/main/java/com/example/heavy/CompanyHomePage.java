package com.example.heavy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class CompanyHomePage extends AppCompatActivity {
private LinearLayout button;
private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company_home_page);


        button =(LinearLayout) findViewById(R.id.LayoutTrucks);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                     openTrucks();
             }
         });


        button =(LinearLayout) findViewById(R.id.LayoutMangeDriver);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openManageDriver();
            }
        });

        button =(LinearLayout) findViewById(R.id.LayoutAddDriver);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenAddDriver();
            }
        });



    }



    public void openTrucks() {
        Intent intent = new Intent (this , Trucks.class);
        startActivity(intent);



    }

    public void openManageDriver() {
        Intent intent = new Intent (this , Manage_Drivers_page.class);
        startActivity(intent);



    }
    public void OpenAddDriver() {
        Intent intent = new Intent (this , AddDriver.class);
        startActivity(intent);



    }



    }
