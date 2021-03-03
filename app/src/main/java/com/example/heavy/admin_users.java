package com.example.heavy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class admin_users extends AppCompatActivity {

    View admin_delete_user, admin_add_user, admin_view_user, admin_edit_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_users);

        admin_delete_user = findViewById(R.id.admin_delete_user);
        admin_add_user = findViewById(R.id.admin_add_user);
        admin_view_user = findViewById(R.id.admin_view_user);
        admin_edit_user = findViewById(R.id.admin_edit_user);

    }

    public void onClick(View view)
    {
        Intent intent;

        switch (view.getId()) {
            case R.id. admin_delete_user:
                intent = new Intent(this, admin_delete_user.class);
                startActivity(intent);
                break;

            case R.id.admin_add_user:
                intent = new Intent(this, admin_add_user.class);
                startActivity(intent);
                break;

            case R.id.admin_view_user:
                intent = new Intent(this, admin_view_users.class);
                startActivity(intent);
                break;

            case R.id.admin_edit_user:
                intent = new Intent(this, admin_edit_user.class);
                startActivity(intent);
                break;

        }
    }

}