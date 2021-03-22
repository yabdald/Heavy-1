package com.example.heavy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class loginActivity extends AppCompatActivity {
    private EditText email,password;
    private TextView forgetPasss;
    private Button loginBtn;
    private FirebaseAuth auth;
    boolean valid = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        forgetPasss = findViewById(R.id.forgotPassword);
        email = findViewById(R.id.emailInput);
        password = findViewById(R.id.passwordInput);

        checkField(email);
        checkField(password);
        auth = FirebaseAuth.getInstance();

//reset Password
        forgetPasss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String txt_email= email.getText().toString();
                String txt_pass= password.getText().toString();


                if (TextUtils.isEmpty(txt_email)) {
                    Toast.makeText(loginActivity.this, "Enter Email !", Toast.LENGTH_SHORT).show();
                } else {
                    auth.sendPasswordResetEmail(txt_email).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(loginActivity.this, "Reset link sent to your email", Toast.LENGTH_SHORT).show();

                        }


                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(loginActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();


                        }
                    });

                }



            }
        });







        loginBtn = findViewById(R.id.login);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String txt_email= email.getText().toString();
                String txt_pass= password.getText().toString();
                loginUser(txt_email,txt_pass);



                }
        });



    }

    private void resetPassword(String email , String password) {


    }


    private void loginUser(String email, String pass) {
            auth.signInWithEmailAndPassword(email, pass).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {

                //checking empty

              /*  if(pass.isEmpty()&& email.isEmpty()){
                    Toast.makeText(loginActivity.this, "Enter Email and password !", Toast.LENGTH_SHORT).show();
                }

                if(email.isEmpty()){
                    Toast.makeText(loginActivity.this, "Email is required !", Toast.LENGTH_SHORT).show();
                }

                 if(pass.isEmpty()){
                    Toast.makeText(loginActivity.this, "Password is required  !", Toast.LENGTH_SHORT).show();
                }


*/

                //admin log in
                if (email.equals("admin1@domain.com") && pass.equals("123456")){
                    Toast.makeText(loginActivity.this, "Successfully loged in !", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(loginActivity.this, admin_dashboard.class));
                finish();
            }
                //driver login
             else   if (email.equals("driver1@domain.com") && pass.equals("123456")) {

                    Toast.makeText(loginActivity.this, "Successfully loged in !", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(loginActivity.this, driverHomePage.class));
                    finish();
                }



                // invalid login
              else {
                    Toast.makeText(getApplicationContext(),"Invalid Enteries",Toast.LENGTH_SHORT).show();

                }





            }



        }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();

                }
            });


    }

    public boolean checkField(EditText textFeild) {

        if (textFeild.getText().toString().isEmpty()) {
            textFeild.setError("not filled");
            valid = false;

        } else {
            valid = true;  }

        return valid;
    }





}