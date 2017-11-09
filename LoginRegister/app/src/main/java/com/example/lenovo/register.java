package com.example.lenovo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lenovo.login.Login;
import com.example.lenovo.loginregister.R;



public class register extends AppCompatActivity implements View.OnClickListener{

    Button btRegister;
    EditText etName, etAge, etUsername, etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = (EditText)findViewById(R.id.etName);
        etAge = (EditText)findViewById(R.id.etAge);
        etUsername = (EditText)findViewById(R.id.etUsername);
        etPassword = (EditText)findViewById(R.id.etPassword);
        btRegister = (Button)findViewById(R.id.bRegister);

        btRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bRegister:
                Login.hostelregister = etAge.getText().toString();
                Login.nameregister = etName.getText().toString();
                Login.userregister = etUsername.getText().toString();
                Login.passwordregister = etPassword.getText().toString();
                Toast.makeText(getApplication(), "Registered!", Toast.LENGTH_LONG).show();
                finish();
                break;
        }
    }
}
