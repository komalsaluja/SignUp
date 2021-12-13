package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NagpurActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nagpur);
    }

    public void haldiram(View view) {
        Intent intent=new Intent(NagpurActivity.this,MapsActivityNagpur1.class);
        startActivity(intent);
    }
    public void barbequeNation(View view)
    {
        Intent intent=new Intent(NagpurActivity.this,MapsActivityNagpur2.class);
        startActivity(intent);
    }
    public void logout(View view)
    {
        SessionManagement sessionManagement = new SessionManagement(NagpurActivity.this);
        sessionManagement.removeSession();
        moveToMainActivity();
    }
    private void moveToMainActivity() {
        Intent intent = new Intent(NagpurActivity.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}