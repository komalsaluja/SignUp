package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    TextView username,password;
    Button loginbutton;
    DBHelper DB;
    TextView forgotpwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username=(TextView) findViewById(R.id.username);
        password=(TextView) findViewById(R.id.password);
        loginbutton=(Button) findViewById(R.id.loginbtn);
        DB = new DBHelper(this);
        Intent intentLogin=getIntent();

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String user = username.getText().toString();
                String pass = password.getText().toString();

                if (user.equals("") || pass.equals(""))
                    Toast.makeText(LoginActivity.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else {
                    Boolean checkuserpass = DB.checkusernamepassword(user, pass);
                    if (checkuserpass == true) {
                        Toast.makeText(LoginActivity.this, "Sign in successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), HomePageActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(LoginActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            }
                });
    }


    @Override
    protected void onStart() {
        super.onStart();

        checkSession();

    }

    private void checkSession() {
        SessionManagement sessionManagement = new SessionManagement(LoginActivity.this);
        String unm = sessionManagement.getSession();

        if(unm!="")
        {
            moveToHomePageActivity();
        }
        else
        {
            //do nothing
        }
    }

    public void login(View view)
    {
        User user=new User(username.toString(),password.toString());
        SessionManagement sessionManagement=new SessionManagement(LoginActivity.this);
        sessionManagement.saveSession(user);
        
        moveToHomePageActivity();
    }

    private void moveToHomePageActivity() {
        Intent intent = new Intent(LoginActivity.this,HomePageActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }

    public void newUsermethod(View view) {
        Intent intent=new Intent(LoginActivity.this,SignUpActivity.class);
        startActivity(intent);
    }
}