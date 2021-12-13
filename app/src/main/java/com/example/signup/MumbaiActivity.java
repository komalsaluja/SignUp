package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MumbaiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai);
    }

    public void yauatcha(View view) {
        Intent intent=new Intent(MumbaiActivity.this,MapsActivityMumbai1.class);
        startActivity(intent);
    }
    public void sevenkitchens(View view) {
        Intent intent=new Intent(MumbaiActivity.this,MapsActivityMumbai2.class);
        startActivity(intent);
    }
    public void dumpukht(View view) {
        Intent intent=new Intent(MumbaiActivity.this,MapsActivityMumbai3.class);
        startActivity(intent);
    }

    public void logout(View view)
    {
        SessionManagement sessionManagement = new SessionManagement(MumbaiActivity.this);
        sessionManagement.removeSession();
        moveToMainActivity();
    }
    private void moveToMainActivity() {
        Intent intent = new Intent(MumbaiActivity.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}