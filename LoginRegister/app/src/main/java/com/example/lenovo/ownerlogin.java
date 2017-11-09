package com.example.lenovo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.login.Login;
import com.example.lenovo.loginregister.MainActivity;
import com.example.lenovo.loginregister.R;

public class ownerlogin extends AppCompatActivity implements View.OnClickListener{
    EditText etUsername;
    EditText etPassword;
    Button login1;
    public static String userreg = "";
    public static String passreg = "";
    TextView rego;
    Button Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ownerlogin);
        rego = (TextView)findViewById(R.id.rego);
        etUsername = (EditText)findViewById(R.id.usernameo);
        etPassword = (EditText)findViewById(R.id.passwordo);
        Back = (Button)findViewById(R.id.Back);
        login1 = (Button)findViewById(R.id.logino);
        Back.setOnClickListener(this);
        login1.setOnClickListener(this);
        rego.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.Back:
                finish();
                break;
            case R.id.logino:
                String check;
                String check1;
                check = etUsername.getText().toString();
                check1 = etPassword.getText().toString();
                if(check.equals("lohit")||check.equals(userreg)) {
                    if(check1.equals("lohit")||check1.equals(passreg)) {
                        startActivity(new Intent(this, lohito.class));
                    }
                    else{
                        Toast.makeText(getApplication(), "Invalid Password", Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(getApplication(), "Invalid Username", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.rego:
                startActivity(new Intent(this, rego.class));
                break;
        }
    }
}
