package com.example.heavy;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;




public class EditDriver extends AppCompatActivity {
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_driver);


    }


    //update Button
    public void UpdateBtn(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);



        builder.setMessage("Do you want to UpDate this driver information ?");

        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {



                builder1.setMessage("The Driver Have been Updated ").show();



                dialog.dismiss();
            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                builder1.setMessage("The process has been Canceled  ").show();

                dialog.dismiss();
            }
        });

        AlertDialog alert = builder.create();
        alert.show();

    }
    // Suspend Button
    public void suspendBtn(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);



        builder.setMessage("Do you want to Suspend this driver ?");

        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {



                builder1.setMessage("The Driver Have been Suspended ").show();



                dialog.dismiss();
            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                builder1.setMessage("The process has been Canceled  ").show();

                dialog.dismiss();
            }
        });

        AlertDialog alert = builder.create();
        alert.show();
    }
    // Delete Button
    public void DeleteBtn (View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);



        builder.setMessage("Do you want to Delete this Driver ?");

        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {



                builder1.setMessage("The Driver Have been Deleted ").show();



                dialog.dismiss();
            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                builder1.setMessage("The process has been Canceled  ").show();

                dialog.dismiss();
            }
        });

        AlertDialog alert = builder.create();
        alert.show();

    }


}