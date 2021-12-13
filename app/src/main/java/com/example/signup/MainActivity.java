package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton sgn,lgn;
    ImageButton pune,ngp,mumbai,goa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sgn=(ImageButton) findViewById(R.id.signup1);
        lgn=(ImageButton) findViewById(R.id.login1);
        pune=(ImageButton)findViewById(R.id.punebtn);
        mumbai=(ImageButton)findViewById(R.id.mumbtn);
        ngp=(ImageButton)findViewById(R.id.ngpbtn);
        goa=(ImageButton)findViewById(R.id.goabtn);

        sgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSignUp=new Intent(getApplicationContext(),SignUpActivity.class);
                startActivity(intentSignUp);
            }
        });

        lgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLogin=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intentLogin);
            }
        });

        pune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLogin=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intentLogin);
            }
        });

        mumbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLogin=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intentLogin);
            }
        });

        ngp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLogin=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intentLogin);
            }
        });

        goa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLogin=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intentLogin);
            }
        });


    }
}