package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GoaActivity extends AppCompatActivity {

    Button cafeGoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goa);

    }

    public void morisco(View view) {
        Intent intent = new Intent(GoaActivity.this,MapsActivityGoa1.class);
        startActivity(intent);
    }
    public void logout(View view)
    {
        SessionManagement sessionManagement = new SessionManagement(GoaActivity.this);
        sessionManagement.removeSession();
        moveToMainActivity();
    }
    private void moveToMainActivity() {
        Intent intent = new Intent(GoaActivity.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}