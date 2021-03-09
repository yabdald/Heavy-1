package com.example.heavy;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class AddDriver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_driver);

    }

    //Add Button
    public void addBtn (View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);




        builder1.setMessage("Do you want to add this Driver ?");

        builder1.setPositiveButton("YES", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {

                builder.setMessage("The Driver Has Been Added ").show();

                dialog.dismiss();
            }
        });

        builder1.setNegativeButton("NO", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {


                builder1.setMessage("The process").show();
                dialog.dismiss();
            }
        });

        AlertDialog alert = builder1.create();
        alert.show();

    }
}