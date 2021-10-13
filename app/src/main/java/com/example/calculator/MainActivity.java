package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;  //引用按钮组件
import android.widget.EditText;  //引用文本编辑框组件
import android.text.TextUtils;  //TextUtils类用于处理字符串

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt_num0,bt_num1,bt_num2,bt_num3,bt_num4,bt_num5,bt_num6,bt_num7,
            bt_num8,bt_num9,bt_delete,bt_div,bt_mult,bt_minus,bt_plus,bt_equal,bt_sin,bt_cos,bt_tan,bt_cot,bt_dot,bt_clear,
            bt_Rbracket,bt_Lbracket;
    private EditText et_calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewAndListener();
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
            intent.setClass(MainActivity.this,UnitActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_cal) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,MainActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_sca) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,ScaleActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_help) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,HelpActivity.class);
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
    private void initViewAndListener() {
        bt_num0 = (Button)findViewById(R.id.bt_num0);
        bt_num0.setOnClickListener(this);

        bt_num1 = (Button)findViewById(R.id.bt_num1);
        bt_num1.setOnClickListener(this);


        bt_num2 =(Button) findViewById(R.id.bt_num2);
        bt_num2.setOnClickListener(this);

        bt_num3 = (Button)findViewById(R.id.bt_num3);
        bt_num3.setOnClickListener(this);

        bt_num4 = (Button)findViewById(R.id.bt_num4);
        bt_num4.setOnClickListener(this);

        bt_num5 = (Button)findViewById(R.id.bt_num5);
        bt_num5.setOnClickListener(this);

        bt_num6 = (Button)findViewById(R.id.bt_num6);
        bt_num6.setOnClickListener(this);

        bt_num7 = (Button)findViewById(R.id.bt_num7);
        bt_num7.setOnClickListener(this);

        bt_num8 = (Button)findViewById(R.id.bt_num8);
        bt_num8.setOnClickListener(this);

        bt_num9 = (Button)findViewById(R.id.bt_num9);
        bt_num9.setOnClickListener(this);

        bt_delete = (Button)findViewById(R.id.bt_delete);
        bt_delete.setOnClickListener(this);

        bt_div = (Button)findViewById(R.id.bt_div);
        bt_div.setOnClickListener(this);

        bt_mult = (Button)findViewById(R.id.bt_mult);
        bt_mult.setOnClickListener(this);

        bt_minus = (Button)findViewById(R.id.bt_minus);
        bt_minus.setOnClickListener(this);


        bt_plus = (Button)findViewById(R.id.bt_plus);
        bt_plus.setOnClickListener(this);

        bt_equal = (Button)findViewById(R.id.bt_equal);
        bt_equal.setOnClickListener(this);

        bt_sin = (Button)findViewById(R.id.bt_sin);
        bt_sin.setOnClickListener(this);

        bt_cos = (Button)findViewById(R.id.bt_cos);
        bt_cos.setOnClickListener(this);

        bt_tan = (Button)findViewById(R.id.bt_tan);
        bt_tan.setOnClickListener(this);

        bt_cot = (Button)findViewById(R.id.bt_cot);
        bt_cot.setOnClickListener(this);

        et_calc = (EditText)findViewById(R.id.et_calc);

        bt_dot = (Button)findViewById(R.id.bt_dot);
        bt_dot.setOnClickListener(this);

        bt_clear = (Button)findViewById(R.id.bt_clear);
        bt_clear.setOnClickListener(this);

        bt_Lbracket = (Button)findViewById(R.id.bt_Lbracket);
        bt_Lbracket.setOnClickListener(this);

        bt_Rbracket = (Button)findViewById(R.id.bt_Rbracket);
        bt_Rbracket.setOnClickListener(this);

    }

    //onClick()方法，触发OnClickListener接口
    public void onClick(View v) {
        String currentText = et_calc.getText().toString();
        if (currentText.equals("0")) {
            et_calc.setText("");
            et_calc.setSelection(et_calc.getText().toString().length());
        }

        //分别获取按钮的内容至文本编辑框
        switch (v.getId()) {
            case R.id.bt_num0:
                et_calc.setText(et_calc.getText() + "0");
                et_calc.setSelection(et_calc.getText().toString().length());
                break;
            case R.id.bt_num1:
                et_calc.setText(et_calc.getText() + "1");
                et_calc.setSelection(et_calc.getText().toString().length());
                break;
            case R.id.bt_num2:
                et_calc.setText(et_calc.getText() + "2");
                et_calc.setSelection(et_calc.getText().toString().length());
                break;
            case R.id.bt_num3:
                et_calc.setText(et_calc.getText() + "3");
                et_calc.setSelection(et_calc.getText().toString().length());
                break;
            case R.id.bt_num4:
                et_calc.setText(et_calc.getText() + "4");
                et_calc.setSelection(et_calc.getText().toString().length());
                break;
            case R.id.bt_num5:
                et_calc.setText(et_calc.getText() + "5");
                et_calc.setSelection(et_calc.getText().toString().length());
                break;
            case R.id.bt_num6:
                et_calc.setText(et_calc.getText() + "6");
                et_calc.setSelection(et_calc.getText().toString().length());
                break;
            case R.id.bt_num7:
                et_calc.setText(et_calc.getText() + "7");
                et_calc.setSelection(et_calc.getText().toString().length());
                break;
            case R.id.bt_num8:
                et_calc.setText(et_calc.getText() + "8");
                et_calc.setSelection(et_calc.getText().toString().length());
                break;
            case R.id.bt_num9:
                et_calc.setText(et_calc.getText() + "9");
                et_calc.setSelection(et_calc.getText().toString().length());
                break;
            case R.id.bt_dot:
                et_calc.setText(et_calc.getText() + ".");
                et_calc.setSelection(et_calc.getText().toString().length());
                break;
            case R.id.bt_Rbracket:
                et_calc.setText(et_calc.getText() + ")");
                et_calc.setSelection(et_calc.getText().toString().length());
                break;
            case R.id.bt_Lbracket:
                et_calc.setText(et_calc.getText() + "(");
                et_calc.setSelection(et_calc.getText().toString().length());
                break;
            //归零按钮，将当前操作数直接清零
            case R.id.bt_clear:
                et_calc.setText("");
                et_calc.setSelection(et_calc.getText().toString().length());
                break;
            //清除按钮，若当前文本编辑框内容为空，点击一次则删除一个字符串
            case R.id.bt_delete:
                if (TextUtils.isEmpty(et_calc.getText())) {
                    return;
                }
                et_calc.setText(currentText.substring(0, currentText.length() - 1).length() > 0 ? currentText.substring(0, currentText.length() - 1) : "0");
                et_calc.setSelection(et_calc.getText().toString().length());
                break;
            case R.id.bt_div:
                if (TextUtils.isEmpty(et_calc.getText())) {
                    return;
                }
                et_calc.setText(et_calc.getText() + "÷");
                et_calc.setSelection(et_calc.getText().toString().length());
                break;
            case R.id.bt_mult:
                if (TextUtils.isEmpty(et_calc.getText())) {
                    return;
                }
                et_calc.setText(et_calc.getText() + "*");
                et_calc.setSelection(et_calc.getText().toString().length());
                break;
            case R.id.bt_minus:
                if (TextUtils.isEmpty(et_calc.getText())) {
                    return;
                }
                et_calc.setText(et_calc.getText() + "-");
                et_calc.setSelection(et_calc.getText().toString().length());
                break;
            case R.id.bt_plus:
                if (TextUtils.isEmpty(et_calc.getText())) {
                    return;
                }
                et_calc.setText(et_calc.getText() + "+");
                et_calc.setSelection(et_calc.getText().toString().length());
                break;
            case R.id.bt_equal:
                if(TextUtils.isEmpty(et_calc.getText()))
                {
                    return;
                }
                et_calc.setText(Calculate.getNum(String.valueOf(et_calc.getText())));
                break;
            case R.id.bt_sin:
                et_calc.setText(String.valueOf(getSin(String.valueOf(et_calc.getText()))));
                break;
            case R.id.bt_cos:
                et_calc.setText(String.valueOf(getCos(String.valueOf(et_calc.getText()))));
                break;
            case R.id.bt_tan:
                et_calc.setText(String.valueOf(getTan(String.valueOf(et_calc.getText()))));
                break;
            case R.id.bt_cot:
                et_calc.setText(String.valueOf(getCot(String.valueOf(et_calc.getText()))));
                break;
        }
    }
        public String getSin(String sin){
            return String.valueOf(Math.sin(Math.toRadians(Double.parseDouble(sin))));
        }

    public String getCos(String cos){
        return String.valueOf(Math.cos(Math.toRadians(Double.parseDouble(cos))));
    }
    public String getTan(String tan){
        return String.valueOf(Math.tan(Math.toRadians(Double.parseDouble(tan))));
    }
    public String getCot(String cot){
        return String.valueOf(1.0/(Math.tan(Math.toRadians(Double.parseDouble(cot)))));
    }
}

