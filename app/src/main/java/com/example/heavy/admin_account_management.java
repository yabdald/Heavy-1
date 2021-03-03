package com.example.heavy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class admin_account_management extends AppCompatActivity {

    View admin_accountManagement_user, admin_accountManagement_company;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_account_management);

        getSupportActionBar().setTitle("Account management");

        admin_accountManagement_user = findViewById(R.id.admin_accountManagement_user);
        admin_accountManagement_company = findViewById(R.id.admin_accountManagement_company);
    }

    public void onClick(View view)
    {
        Intent intent;

        switch (view.getId()) {
            case R.id. admin_accountManagement_user:
                intent = new Intent(this, admin_users.class);
                startActivity(intent);
                break;

            case R.id.admin_accountManagement_company:
                intent = new Intent(this, admin_company.class);
                startActivity(intent);
                break;

        }
    }
}