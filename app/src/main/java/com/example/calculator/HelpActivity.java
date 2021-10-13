package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HelpActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        TextView tx_sorting = findViewById(R.id.tx_sorting);
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
            intent.setClass(HelpActivity.this,UnitActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_cal) {
            Intent intent = new Intent();
            intent.setClass(HelpActivity.this,MainActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_sca) {
            Intent intent = new Intent();
            intent.setClass(HelpActivity.this,ScaleActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_help) {
            Intent intent = new Intent();
            intent.setClass(HelpActivity.this,HelpActivity.class);
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
