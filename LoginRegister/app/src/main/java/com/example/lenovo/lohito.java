package com.example.lenovo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lenovo.login.Login;
import com.example.lenovo.loginregister.MainActivity;
import com.example.lenovo.loginregister.R;

import static com.example.lenovo.login.Login.code;
import static com.example.lenovo.login.Login.neworders;


public class lohito extends AppCompatActivity implements View.OnClickListener{
    Button ready;
    Button logout;
    Button edit;
    TextView textView;
    TextView code1;
    String s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lohito);
        ready =(Button)findViewById(R.id.ready);
        code1 = (TextView)findViewById(R.id.ownercode);
        logout = (Button)findViewById(R.id.logouto);
        textView = (TextView)findViewById(R.id.textView);
        edit = (Button)findViewById(R.id.edit);
        if(Login.flag==1) {
            textView.setText(Login.userregister + ": " + Login.neworders);
        }
        else{
            textView.setText("user: " + Login.neworders);
        }
        if(Login.neworders.equals("")){
            textView.setText("No Orders");
        }
        ready.setOnClickListener(this);
        logout.setOnClickListener(this);
        edit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.ready:
                Login.prompt = "ready";
                s = "Unique Customer ID : " + Login.code;
                code1.setText(s);
            break;
            case R.id.logouto:
                finish();
                break;
            case R.id.edit:
                startActivity(new Intent(this, EditMenu.class));
                break;
        }
    }
}
