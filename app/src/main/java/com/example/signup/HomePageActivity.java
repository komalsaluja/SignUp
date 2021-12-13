package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);



    }

    public void logout(View view)
    {
        SessionManagement sessionManagement = new SessionManagement(HomePageActivity.this);
        sessionManagement.removeSession();
        moveToMainActivity();
    }

    private void moveToMainActivity() {
        Intent intent = new Intent(HomePageActivity.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void hotelMum(View view)
    {
        Intent intent=new Intent(HomePageActivity.this,MumbaiActivity.class);
        startActivity(intent);

    }

    public void hotelGoa(View view) {
        Intent intent=new Intent(HomePageActivity.this,GoaActivity.class);
        startActivity(intent);
    }
    public void hotelNgp(View view) {
        Intent intent=new Intent(HomePageActivity.this,NagpurActivity.class);
        startActivity(intent);
    }
    public void hotelPune(View view) {
        Intent intent=new Intent(HomePageActivity.this,PuneActivity.class);
        startActivity(intent);
    }

    //disabling back key
    @Override
    public void onBackPressed()
    {
    }
}