package com.example.heavy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class admin_dashboard extends AppCompatActivity {

    private View admin_accountManagement, admin_complaints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        getSupportActionBar().setTitle("Dashboard");

        admin_accountManagement = findViewById(R.id.admin_accountManagement);
        admin_complaints = findViewById(R.id.admin_complaints);
    }

    public void onClick(View view)
    {
        Intent intent;

        switch (view.getId()) {
            case R.id.admin_accountManagement:
                intent = new Intent(this, admin_account_management.class);
                startActivity(intent);
                break;

            case R.id.admin_complaints:
                intent = new Intent(this, admin_complaints.class);
                startActivity(intent);
                break;

        }
    }


}