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

public class ScaleActivity extends AppCompatActivity {
    private EditText et_two;
    private EditText et_eight;
    private EditText et_ten;
    private EditText et_sixteen;
    private Button btn_transition;
    private Button btn_clear;
    private TextView tx_sorting;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);
        et_two= findViewById(R.id.et_two);
        et_eight= findViewById(R.id.et_eight);
        et_ten= findViewById(R.id.et_ten);
        et_sixteen= findViewById(R.id.et_sixteen);
        btn_transition = findViewById(R.id.btn_transition);
        btn_clear = findViewById(R.id.btn_clear);
        tx_sorting = findViewById(R.id.tx_sorting);

        btn_transition.setOnClickListener(view -> {
            try{
                if (!et_two.getText().toString().equals("") && et_sixteen.getText().toString().equals("") &&et_eight.getText().toString().equals("")&&et_ten.getText().toString().equals("")){
                    String ten =  Integer.valueOf(et_two.getText().toString(),2).toString();
                    String sixteen = Integer.toHexString(Integer.parseInt(ten));
                    String eight = Integer.toOctalString(Integer.parseInt(ten));
                    et_ten.setText(ten);
                    et_eight.setText(eight);
                    et_sixteen.setText(sixteen);
                }
                else if (et_two.getText().toString().equals("")&&et_sixteen.getText().toString().equals("")&&!et_eight.getText().toString().equals("")&&et_ten.getText().toString().equals("")){
                    String ten =  Integer.valueOf(et_eight.getText().toString(),8).toString();
                    String sixteen = Integer.toHexString(Integer.parseInt(ten));
                    String two = Integer.toBinaryString(Integer.parseInt(ten));
                    et_ten.setText(ten);
                    et_two.setText(two);
                    et_sixteen.setText(sixteen);
                }
                else if (et_two.getText().toString().equals("")&&et_sixteen.getText().toString().equals("")&&et_eight.getText().toString().equals("")&&!et_ten.getText().toString().equals("")){
                    String ten = et_ten.getText().toString();
                    String sixteen = Integer.toHexString(Integer.parseInt(ten));
                    String two = Integer.toBinaryString(Integer.parseInt(ten));
                    String eight = Integer.toOctalString(Integer.parseInt(ten));
                    et_eight.setText(eight);
                    et_two.setText(two);
                    et_sixteen.setText(sixteen);
                }
                else if (et_two.getText().toString().equals("")&&!et_sixteen.getText().toString().equals("")&&et_eight.getText().toString().equals("")&&et_ten.getText().toString().equals("")){
                    String ten =  Integer.valueOf(et_sixteen.getText().toString(),16).toString();
                    String eight = Integer.toOctalString(Integer.parseInt(ten));
                    String two = Integer.toBinaryString(Integer.parseInt(ten));
                    et_ten.setText(ten);
                    et_two.setText(two);
                    et_eight.setText(eight);
                }
                else {
                    Toast.makeText(this,"您的输入有误", Toast.LENGTH_LONG).show();
                    et_eight.setText("");
                    et_two.setText("");
                    et_ten.setText("");
                    et_sixteen.setText("");
                }
            }
            catch (Exception e){
                Toast.makeText(this,"您的输入有误", Toast.LENGTH_LONG).show();
                et_eight.setText("");
                et_two.setText("");
                et_ten.setText("");
                et_sixteen.setText("");
            }
        });
        btn_clear.setOnClickListener(view -> {
            et_eight.setText("");
            et_two.setText("");
            et_ten.setText("");
            et_sixteen.setText("");
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
            intent.setClass(ScaleActivity.this,UnitActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_cal) {
            Intent intent = new Intent();
            intent.setClass(ScaleActivity.this,MainActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_sca) {
            Intent intent = new Intent();
            intent.setClass(ScaleActivity.this,ScaleActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_help) {
            Intent intent = new Intent();
            intent.setClass(ScaleActivity.this,HelpActivity.class);
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
