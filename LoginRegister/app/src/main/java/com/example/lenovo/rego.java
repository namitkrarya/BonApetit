package com.example.lenovo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.loginregister.R;

public class rego extends AppCompatActivity implements View.OnClickListener {

    Button btRegistero;
    EditText etAgeo, etUsernameo, etPasswordo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rego);
        btRegistero = (Button)findViewById(R.id.bRegistero);
        etAgeo = (EditText)findViewById(R.id.etAgeo);
        etPasswordo = (EditText)findViewById(R.id.etPasswordo);
        etUsernameo = (EditText)findViewById(R.id.etUsernameo);

        btRegistero.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bRegistero){
            ownerlogin.userreg = etUsernameo.getText().toString();
            ownerlogin.passreg = etPasswordo.getText().toString();
            Toast.makeText(getApplication(), "Registered!", Toast.LENGTH_LONG).show();
            finish();
        }
    }
}
