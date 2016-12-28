package com.example.vaha.gaitest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener{

    TextView result;
    Button newstart;
    Button end;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = (TextView) findViewById(R.id.result);
        newstart = (Button) findViewById(R.id.newstart);
        end = (Button) findViewById(R.id.end);

        newstart.setOnClickListener(this);
        result.setText(TestActivity.test_result + " з 5");


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.newstart:
                Intent intent = new Intent(ResultActivity.this, TestActivity.class);
                startActivity(intent);
                break;
            case R.id.end:
                finish();
                break;
            default: break;
    }}
}
