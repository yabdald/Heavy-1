package com.example.heavy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class admin_company extends AppCompatActivity {

    View admin_delete_company, admin_add_company, admin_view_company, admin_edit_company;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_company);

        admin_delete_company = findViewById(R.id.admin_delete_company);
        admin_add_company = findViewById(R.id.admin_add_Company);
        admin_view_company = findViewById(R.id.admin_view_Company);
        admin_edit_company = findViewById(R.id.admin_edit_Company);
    }

    public void onClick(View view)
    {
        Intent intent;

        switch (view.getId()) {
            case R.id. admin_delete_company:
                intent = new Intent(this, admin_delete_company.class);
                startActivity(intent);
                break;

            case R.id.admin_add_Company:
                intent = new Intent(this, admin_add_company.class);
                startActivity(intent);
                break;

            case R.id.admin_view_Company:
                intent = new Intent(this, admin_view_company.class);
                startActivity(intent);
                break;

            case R.id.admin_edit_Company:
                intent = new Intent(this, admin_edit_company.class);
                startActivity(intent);
                break;

        }
    }
}