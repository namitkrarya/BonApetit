package com.example.lenovo.loginregister;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.login.Login;
import com.example.lenovo.lohit;
import com.example.lenovo.orderready;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bLogout, myorders;
    TextView etName, etHostel, etUsername;
    Button lohit1;
    String order1="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (TextView) findViewById(R.id.etName);
        etUsername = (TextView) findViewById(R.id.etUsername);
        etHostel = (TextView) findViewById(R.id.etAge);
        if(Login.flag==1){
            etName.setText(Login.nameregister);
            etUsername.setText(Login.userregister);
            etHostel.setText(Login.hostelregister);
        }
        lohit1 = (Button)findViewById(R.id.lohit);
        bLogout = (Button)findViewById(R.id.bLogout);
        myorders = (Button)findViewById(R.id.myorders);



        bLogout.setOnClickListener(this);
        lohit1.setOnClickListener(this);
        myorders.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bLogout:
                finish();
                break;
            case R.id.lohit:
                startActivity(new Intent(this, lohit.class));
                break;
            case R.id.myorders:
                startActivity(new Intent(this, orderready.class));
                break;
        }
    }
}
