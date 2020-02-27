package com.example.hotelbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

        public class Signupactivity extends AppCompatActivity {
            EditText ed1,ed2,ed3;
            Button b1,b2;
            ConstraintLayout l1;
            String name,password,email;
            SharedPreferences sp;
            SharedPreferences.Editor editor;
            TextView t1;
            public static final String MyPREFERENCES="Aman";
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_signupactivity);

                ed1=findViewById(R.id.editText);
                ed2=findViewById(R.id.editText2);
                ed3=findViewById(R.id.editText3);
                b1=findViewById(R.id.button11);
                b2= findViewById(R.id.button);

                sp= getSharedPreferences(MyPREFERENCES,MODE_PRIVATE);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        name=ed1.getText().toString();
                        password=ed2.getText().toString();
                        email=ed3.getText().toString();
                        editor=sp.edit();
                        editor.putString("key1",name);
                        editor.putString("key2",password);
                        editor.putString("key3",email);
                        editor.apply();

                        ed2.setText(sp.getString("key2",""));
                        ed3.setText(sp.getString("key3",""));

                    }
                });

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i1=new Intent(Signupactivity.this,LoginActivity.class);
                        startActivity(i1);
                    }
                });
            }
        }

