package com.example.lenovo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.lenovo.login.Login;
import com.example.lenovo.loginregister.R;

public class EditMenu extends AppCompatActivity implements View.OnClickListener{
    CheckBox item1;
    CheckBox item2;
    CheckBox item3;
    CheckBox item4;
    CheckBox item5;
    CheckBox item6;
    CheckBox item7;
    CheckBox item8;
    CheckBox item9;
    CheckBox item10;
    Button avail;
    boolean checked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_menu);
        item1 = (CheckBox)findViewById(R.id.edit_aloo1);
        item2 = (CheckBox)findViewById(R.id.edit_aloo_sandwich1);
        item3 = (CheckBox)findViewById(R.id.edit_maggi1);
        item4 = (CheckBox)findViewById(R.id.edit_fried_maggi1);
        item5 = (CheckBox)findViewById(R.id.edit_fried_rice1);
        item6 = (CheckBox)findViewById(R.id.edit_veg_chowmien);
        item7 = (CheckBox)findViewById(R.id.edit_bread_omlette);
        item8 = (CheckBox)findViewById(R.id.edit_stuff);
        item9 = (CheckBox)findViewById(R.id.edit_veg_roll);
        item10 = (CheckBox)findViewById(R.id.edit_chicken_momos);
        avail = (Button)findViewById(R.id.avail);


        avail.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.avail:
                checked = ((CheckBox) item1).isChecked();
                Login.it1=1;
                if(checked) {
                    Login.it1 = 0;
                }
                checked = ((CheckBox) item2).isChecked();
                Login.it2=1;
                if(checked) {
                    Login.it2 = 0;
                }
                checked = ((CheckBox) item3).isChecked();
                Login.it3=1;
                if(checked) {
                    Login.it3 = 0;
                }
                checked = ((CheckBox) item4).isChecked();
                Login.it4=1;
                if(checked) {
                    Login.it4 = 0;
                }
                checked = ((CheckBox) item5).isChecked();
                Login.it5=1;
                if(checked) {
                    Login.it5 = 0;
                }
                checked = ((CheckBox) item6).isChecked();
                Login.it6=1;
                if(checked) {
                    Login.it6 = 0;
                }
                checked = ((CheckBox) item7).isChecked();
                Login.it7=1;
                if(checked) {
                    Login.it7 = 0;
                }
                checked = ((CheckBox) item8).isChecked();
                Login.it8=1;
                if(checked) {
                    Login.it8 = 0;
                }
                checked = ((CheckBox) item9).isChecked();
                Login.it9=1;
                if(checked) {
                    Login.it9 = 0;
                }
                checked = ((CheckBox) item10).isChecked();
                Login.it10=1;
                if(checked) {
                    Login.it10 = 0;
                }
                Toast.makeText(getApplication(), "Edited!", Toast.LENGTH_LONG).show();
                finish();
        }
    }
}
