package com.example.lenovo.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.loginregister.MainActivity;
import com.example.lenovo.ownerlogin;
import com.example.lenovo.register;
import com.example.lenovo.loginregister.R;

public class Login extends AppCompatActivity implements View.OnClickListener{
    public static int it1 = 0, it2 = 0, it3 = 0, it4 = 0, it5 = 0;
    public static int it6 = 0, it7 = 0, it8 = 0, it9 = 0, it10 = 0;
    public static int code=0, flag=0;

    public static String neworders = "";
    public static String prompt = "";
    public static String userregister = "";
    public static String hostelregister = "";
    public static String nameregister = "";
    public static String passwordregister = "";
    Button bLogin;
    EditText etUsername;
    EditText etPassword;
    Button registerlink, owner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText)findViewById(R.id.etUsername);
        etPassword = (EditText)findViewById(R.id.etPassword);
        owner = (Button)findViewById(R.id.owner);
        bLogin = (Button)findViewById(R.id.bLogin);
        registerlink = (Button)findViewById(R.id.tvRegisterLink);
        bLogin.setOnClickListener(this);
        owner.setOnClickListener(this);
        registerlink.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bLogin:
                    String check;
                    String check1;
                    check = etUsername.getText().toString();
                    check1 = etPassword.getText().toString();
                    if(check.equals("user")) {
                        if(check1.equals("user")) {
                            flag=0;
                            startActivity(new Intent(this, MainActivity.class));
                        }
                        else{
                            Toast.makeText(getApplication(), "Invalid Password", Toast.LENGTH_LONG).show();
                        }
                    }
                    else if(check.equals(Login.userregister)) {
                        if(check1.equals(Login.passwordregister)) {
                            flag = 1;
                            startActivity(new Intent(this, MainActivity.class));
                        }
                        else{
                            Toast.makeText(getApplication(), "Invalid Password", Toast.LENGTH_LONG).show();
                        }
                    }
                    else{
                        Toast.makeText(getApplication(), "Invalid Username", Toast.LENGTH_LONG).show();
                    }
               break;
            case R.id.tvRegisterLink:
                    startActivity(new Intent(this, register.class));
               break;
            case R.id.owner:
                    startActivity(new Intent(this, ownerlogin.class));
                break;
        }
    }
}
