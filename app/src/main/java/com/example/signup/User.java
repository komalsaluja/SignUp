package com.example.signup;

public class User
{
    String username;
    String pswd;
    public User(String username,String pswd)
    {
        this.username = username;
        this.pswd = pswd;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }
}
