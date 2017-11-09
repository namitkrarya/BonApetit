package com.example.lenovo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.login.Login;
import com.example.lenovo.loginregister.MainActivity;
import com.example.lenovo.loginregister.R;

import static com.example.lenovo.login.Login.neworders;

public class orderready extends AppCompatActivity implements View.OnClickListener{
   TextView aloo, code;
    String s, check;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderready);
        aloo = (TextView)findViewById(R.id.aloo);
        back = (Button)findViewById(R.id.backorder);
        code = (TextView)findViewById(R.id.code);
        check = Login.prompt;
        aloo.setText(neworders);
        s = aloo.getText().toString();
        if(s.equals("")){
            aloo.setText("No Orders");
        }
        else if(check.equals("ready") && !s.equals("")) {
            aloo.setText(s + " (Ready)");
            Toast.makeText(getApplication(), "Order is Ready!", Toast.LENGTH_LONG).show();
            Login.neworders = "";
            Login.prompt = "";
            code.setText("Your Code :" + Login.code);
        }


        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch ((v.getId())){
            case R.id.backorder:
                finish();
                break;
        }
    }
}
