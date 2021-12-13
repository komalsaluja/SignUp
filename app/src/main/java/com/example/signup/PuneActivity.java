package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PuneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pune);
    }

    public void thegreenhouse(View view) {
        Intent intent=new Intent(PuneActivity.this,MapsActivityPune1.class);
        startActivity(intent);
    }

    public void deccanspice(View view) {
        Intent intent=new Intent(PuneActivity.this,MapsActivityPune2.class);
        startActivity(intent);
    }

    public void brasserie(View view) {
        Intent intent=new Intent(PuneActivity.this,MapsActivityPune3.class);
        startActivity(intent);
    }
    public void logout(View view)
    {
        SessionManagement sessionManagement = new SessionManagement(PuneActivity.this);
        sessionManagement.removeSession();
        moveToMainActivity();
    }
    private void moveToMainActivity() {
        Intent intent = new Intent(PuneActivity.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}