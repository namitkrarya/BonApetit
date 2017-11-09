package com.example.lenovo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.lenovo.login.Login;
import com.example.lenovo.loginregister.MainActivity;
import com.example.lenovo.loginregister.R;

import java.util.Random;


public class lohit extends AppCompatActivity implements View.OnClickListener{
    Button back, order;
    CheckBox item1,item2,item3,item4,item5,item6,item7,item8,item9,item10;
    String s;
    int flag = 0;
    boolean checked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lohit);


        back = (Button)findViewById(R.id.back);
        order = (Button)findViewById(R.id.order);
        item1 = (CheckBox)findViewById(R.id.checkbox_aloo);
        item2 = (CheckBox)findViewById(R.id.checkbox_maggi);
        item3 = (CheckBox)findViewById(R.id.checkbox_fried_maggi);
        item4 = (CheckBox)findViewById(R.id.checkbox_aloo_sandwich);
        item5 = (CheckBox)findViewById(R.id.checkbox_fried_rice);
        item6 = (CheckBox)findViewById(R.id.checkbox_veg_chowmien);
        item7 = (CheckBox)findViewById(R.id.checkbox_bread_omlette);
        item8 = (CheckBox)findViewById(R.id.checkbox_stuff);
        item9 = (CheckBox)findViewById(R.id.checkbox_veg_roll);
        item10 = (CheckBox)findViewById(R.id.checkbox_chicken_momos);
        s = item1.getText().toString();
        if(Login.it1==1) {
            item1.setText(s + " (Not Available)");

        }
        s = item2.getText().toString();
        if(Login.it2==1) {
            item2.setText(s + " (Not Available)");

        }
        s = item3.getText().toString();
        if(Login.it3==1) {
            item3.setText(s + " (Not Available)");

        }
        s = item4.getText().toString();
        if(Login.it4==1) {
            item4.setText(s + " (Not Available)");

        }
        s = item5.getText().toString();
        if(Login.it5==1) {
            item5.setText(s + " (Not Available)");

        }
        s = item6.getText().toString();
        if(Login.it6==1) {
            item6.setText(s + " (Not Available)");

        }
        s = item7.getText().toString();
        if(Login.it7==1) {
            item7.setText(s + " (Not Available)");

        }
        s = item8.getText().toString();
        if(Login.it8==1) {
            item8.setText(s + " (Not Available)");

        }
        s = item9.getText().toString();
        if(Login.it9==1) {
            item9.setText(s + " (Not Available)");

        }
        s = item10.getText().toString();
        if(Login.it10==1) {
            item10.setText(s + " (Not Available)");

        }
        back.setOnClickListener(this);
        order.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.back:
                finish();
                break;
            case R.id.order:
                if(Login.it1==1) {
                    item1.setChecked(false);
                }
                checked = ((CheckBox) item1).isChecked();
                if(checked) {
                    flag = 1;
                    if(!Login.neworders.equals("")) {
                        Login.neworders = Login.neworders + ", Aloo Paratha";

                    }
                    else{
                        Login.neworders = Login.neworders + "Aloo Paratha";
                    }
                }
                if(Login.it2==1) {
                    item2.setChecked(false);
                }
                checked = ((CheckBox) item2).isChecked();
                if(checked) {
                    flag = 1;
                    if(!Login.neworders.equals("")) {
                        Login.neworders = Login.neworders + ", Maggi";
                    }
                    else{
                        Login.neworders = Login.neworders + "Maggi";
                    }
                }
                if(Login.it3==1) {
                    item3.setChecked(false);
                }
                checked = ((CheckBox) item3).isChecked();
                if(checked) {
                    flag = 1;
                    if(!Login.neworders.equals("")) {
                        Login.neworders = Login.neworders + ", Fried Maggi";
                    }
                    else{
                        Login.neworders = Login.neworders + "Fried Maggi";
                    }
                }
                if(Login.it4==1) {
                    item4.setChecked(false);
                }
                checked = ((CheckBox) item4).isChecked();
                if(checked) {
                    flag = 1;
                    if(!Login.neworders.equals("")) {
                        Login.neworders = Login.neworders + ", Aloo Sandwich";
                    }
                    else{
                        Login.neworders = Login.neworders + "Aloo Sandwich";
                    }
                }
                if(Login.it5==1) {
                    item5.setChecked(false);
                }
                checked = ((CheckBox) item5).isChecked();
                if(checked) {
                    flag = 1;
                    if(!Login.neworders.equals("")) {
                        Login.neworders = Login.neworders + ", Fried Rice";
                    }
                    else{
                        Login.neworders = Login.neworders + "Fried Rice";
                    }
                }
                if(Login.it6==1) {
                    item6.setChecked(false);
                }
                checked = ((CheckBox) item6).isChecked();
                if(checked) {
                    flag = 1;
                    if(!Login.neworders.equals("")) {
                        Login.neworders = Login.neworders + ", Veg Chowmein";
                    }
                    else{
                        Login.neworders = Login.neworders + "Veg Chowmein";
                    }
                }
                if(Login.it7==1) {
                    item7.setChecked(false);
                }
                checked = ((CheckBox) item7).isChecked();
                if(checked) {
                    flag = 1;
                    if(!Login.neworders.equals("")) {
                        Login.neworders = Login.neworders + ", Bread Omlette";
                    }
                    else{
                        Login.neworders = Login.neworders + "Bread Omlette";
                    }
                }
                if(Login.it8==1) {
                    item8.setChecked(false);
                }
                checked = ((CheckBox) item8).isChecked();
                if(checked) {
                    flag = 1;
                    if(!Login.neworders.equals("")) {
                        Login.neworders = Login.neworders + ", Stuff Paratha";
                    }
                    else{
                        Login.neworders = Login.neworders + "Stuff Paratha";
                    }
                }
                if(Login.it9==1) {
                    item9.setChecked(false);
                }
                checked = ((CheckBox) item9).isChecked();
                if(checked) {
                    flag = 1;
                    if(!Login.neworders.equals("")) {
                        Login.neworders = Login.neworders + ", Veg Roll";
                    }
                    else{
                        Login.neworders = Login.neworders + "Veg Roll";
                    }
                }
                if(Login.it10==1) {
                    item10.setChecked(false);
                }
                checked = ((CheckBox) item10).isChecked();
                if(checked) {
                    flag = 1;
                    if(!Login.neworders.equals("")) {
                        Login.neworders = Login.neworders + ", Chicken Momos";
                    }
                    else{
                        Login.neworders = Login.neworders + "Chicken Momos";
                    }
                }
                if(flag==1) {
                    Toast.makeText(getApplication(), "Your Order is Placed", Toast.LENGTH_LONG).show();
                    Random rand = new Random();
                    Login.code = rand.nextInt(10000);
                }
                else{
                    Toast.makeText(getApplication(), "Nothing Ordered", Toast.LENGTH_LONG).show();
                }

                finish();
                break;
        }
    }
}
