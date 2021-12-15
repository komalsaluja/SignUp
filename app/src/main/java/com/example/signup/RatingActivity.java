package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class RatingActivity extends AppCompatActivity {

    Button btn;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);


        btn = findViewById(R.id.button);
        ratingBar = findViewById(R.id.idratingBar);

    }

    public void onBtnClick(View v) {

        float ratingvalue = ratingBar.getRating();
        Toast.makeText(this, "Your rating is: " +ratingvalue+" \nThank you:) ", Toast.LENGTH_LONG).show();

    }

}