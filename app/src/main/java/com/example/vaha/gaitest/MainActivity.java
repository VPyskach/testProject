package com.example.vaha.gaitest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static com.example.vaha.gaitest.R.id.start;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button start;
    public  static boolean newStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.startone);
        start.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.startone:
                TestActivity.test_result = 0;
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }


}
