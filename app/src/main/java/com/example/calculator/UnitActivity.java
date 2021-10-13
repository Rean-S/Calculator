package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UnitActivity extends AppCompatActivity {
    private EditText et_mm;
    private EditText et_cm;
    private EditText et_m;
    private EditText et_km;
    private Button btn_transition;
    private Button btn_clear;
    private TextView tx_sorting;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit);
        et_mm= findViewById(R.id.et_mm);
        et_cm= findViewById(R.id.et_cm);
        et_m= findViewById(R.id.et_m);
        et_km= findViewById(R.id.et_km);
        btn_transition = findViewById(R.id.btn_transition);
        btn_clear = findViewById(R.id.btn_clear);
        tx_sorting = findViewById(R.id.tx_sorting);

        btn_transition.setOnClickListener(view -> {
            try{
                if (!et_mm.getText().toString().equals("") && et_km.getText().toString().equals("") &&et_cm.getText().toString().equals("")&&et_m.getText().toString().equals("")){
                    double m =  Double.parseDouble(et_mm.getText().toString())/1000;
                    double km = Double.parseDouble(et_mm.getText().toString())/1000000;
                    double cm = Double.parseDouble(et_mm.getText().toString())/10;
                    et_m.setText(String.valueOf(m));
                    et_cm.setText(String.valueOf(cm));
                    et_km.setText(String.valueOf(km));
                }
                else if (et_mm.getText().toString().equals("")&&et_km.getText().toString().equals("")&&!et_cm.getText().toString().equals("")&&et_m.getText().toString().equals("")){
                    double m =  Double.parseDouble(et_cm.getText().toString())/100;
                    double km = Double.parseDouble(et_cm.getText().toString())/100000;
                    double mm = Double.parseDouble(et_cm.getText().toString())*10;
                    et_m.setText(String.valueOf(m));
                    et_mm.setText(String.valueOf(mm));
                    et_km.setText(String.valueOf(km));
                }
                else if (et_mm.getText().toString().equals("")&&et_km.getText().toString().equals("")&&et_cm.getText().toString().equals("")&&!et_m.getText().toString().equals("")){
                    double km = Double.parseDouble(et_m.getText().toString())/1000;
                    double mm = Double.parseDouble(et_m.getText().toString())*1000;
                    double cm = Double.parseDouble(et_m.getText().toString())*100;
                    et_cm.setText(String.valueOf(cm));
                    et_mm.setText(String.valueOf(mm));
                    et_km.setText(String.valueOf(km));
                }
                else if (et_mm.getText().toString().equals("")&&!et_km.getText().toString().equals("")&&et_cm.getText().toString().equals("")&&et_m.getText().toString().equals("")){
                    double m =  Double.parseDouble(et_km.getText().toString())*1000;
                    double cm = Double.parseDouble(et_km.getText().toString())*100000;
                    double mm = Double.parseDouble(et_km.getText().toString())*1000000;
                    et_m.setText(String.valueOf(m));
                    et_mm.setText(String.valueOf(mm));
                    et_cm.setText(String.valueOf(cm));
                }
                else {
                    Toast.makeText(this,"您的输入有误", Toast.LENGTH_LONG).show();
                    et_cm.setText("");
                    et_mm.setText("");
                    et_m.setText("");
                    et_km.setText("");
                }
            }
            catch (Exception e){
                Toast.makeText(this,"您的输入有误", Toast.LENGTH_LONG).show();
                et_cm.setText("");
                et_mm.setText("");
                et_m.setText("");
                et_km.setText("");
            }
        });
        btn_clear.setOnClickListener(view -> {
            et_cm.setText("");
            et_mm.setText("");
            et_m.setText("");
            et_km.setText("");
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_uni) {
            Intent intent = new Intent();
            intent.setClass(UnitActivity.this,UnitActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_cal) {
            Intent intent = new Intent();
            intent.setClass(UnitActivity.this,MainActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_sca) {
            Intent intent = new Intent();
            intent.setClass(UnitActivity.this,ScaleActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_help) {
            Intent intent = new Intent();
            intent.setClass(UnitActivity.this,HelpActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_exit) {
            finishAffinity();
            System.exit(0);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
