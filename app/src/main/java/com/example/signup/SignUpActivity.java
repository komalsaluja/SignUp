package com.example.signup;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    EditText name,email,password,phone;
    Button insert;

    DBHelper DB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = findViewById(R.id.input_name);
        password = findViewById(R.id.input_password);
        email = findViewById(R.id.input_email);
        phone=findViewById(R.id.input_phoneno);

        insert = findViewById(R.id.registerbtn);

        DB = new DBHelper(this);

        Intent intentSignUp=getIntent();

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameTXT = name.getText().toString();
                String emailTXT = email.getText().toString();
                String passwordTXT = password.getText().toString();
                String phoneTXT = phone.getText().toString();

                Boolean checkinsertdata = DB.insertuserdata(nameTXT, emailTXT, passwordTXT,phoneTXT);
                if (checkinsertdata == true) {
                    Toast.makeText(SignUpActivity.this, "New Entry Inserted", Toast.LENGTH_LONG).show();
                } else
                    Toast.makeText(SignUpActivity.this, "New Entry not Inserted", Toast.LENGTH_LONG).show();

            }
        });

    }

    public void oldUsermethod(View view) {

        Intent intent=new Intent(SignUpActivity.this,LoginActivity.class);
        startActivity(intent);
    }
}