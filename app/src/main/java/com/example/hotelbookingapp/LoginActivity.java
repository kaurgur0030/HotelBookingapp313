package com.example.hotelbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {





        public class Main2Activity extends AppCompatActivity {
            TextView t11;
            Button b3, b4, b5;
            ConstraintLayout l1;
            String name, password, email, savedemail;
            SharedPreferences sp;
            SharedPreferences.Editor editor;
            EditText ed1, ed2;
            Intent i;
            View v;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_login);

                ed1 = findViewById(R.id.editText2);
                ed2 = findViewById(R.id.editText3);
                b3 = findViewById(R.id.button11);
                b4 = findViewById(R.id.button3);
                b5 = findViewById(R.id.button5);




                sp = getSharedPreferences(Signupactivity.MyPREFERENCES, MODE_PRIVATE);


                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        name = ed1.getText().toString();
                        password = ed1.getText().toString();

                        email = ed2.getText().toString();
                        editor = sp.edit();
                        editor.putString("key1", name);

                        editor.putString("key3", email);
                        editor.apply();



                    }
                });

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        i = new Intent(LoginActivity.this, Signupactivity.class);
                        startActivity(i);

                    }



                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        i = new Intent(LoginActivity.this, ReviewActivity .class);
                        startActivity(i);

                    }



                });
            }
        }
    }