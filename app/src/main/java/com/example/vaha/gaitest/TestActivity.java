package com.example.vaha.gaitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity implements View.OnClickListener{

    String test_questin[] = new String[]{
            "Згідно з Правилами до мотоциклів прирівнюються моторолери, мотоколяски та механічні транспортні засоби, дозволена маса яких не перевищує:",
            "Яка максимальна кількість місць для сидіння (з місцем водія включно) може бути в легковому автомобілі згідно з Правилами?",
            "Водій, який створив небезпеку або перешкоду для руху, зобов’язаний попередити про них:",
            "До вантажного автомобіля належить автомобіль, який за своєю конструкцією та обладнанням призначений для перевезення:",
            "З якого віку дозволяється самостійно управляти легковими автомобілями"
    };
    String test_answer[] = new String[]{
            "300 кг", "400 кг", "500 кг",
            "П'ять", "Вісім", "Дев'ять",
            "Орган міліції", "Учасників дороги", "Обидвох",
            "Вантажу", "Пасажирів", "Пасажирів та їхнього вантажу",
            "16 років", "18 років", "19 років"

    };
    String true_answer[] = new String[]{
            "400 кг",
            "Дев'ять",
            "Обидвох",
            "Вантажу",
            "18 років"

    };

    TextView question;
    Button answer1;
    Button answer2;
    Button answer3;
    public  static byte test_result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        question = (TextView) findViewById(R.id.question) ;
        answer1.setOnClickListener(this);
        answer2.setOnClickListener(this);
        answer3.setOnClickListener(this);
        question.setText(test_questin[0]);
        answer1.setText(test_answer[0]);
        answer2.setText(test_answer[1]);
        answer3.setText(test_answer[2]);
        test_result = 0;
    }

    int i =0;

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.answer1:
                if(test_answer[i*3].equals(true_answer[i])) test_result++;
                i++;
                if(i<=4){
                    question.setText(test_questin[i]);
                    answer1.setText(test_answer[i*3]);
                    answer2.setText(test_answer[i*3+1]);
                    answer3.setText(test_answer[i*3+2]);
                } else {
                    Intent intent = new Intent(TestActivity.this, ResultActivity.class);
                    startActivity(intent);
                }
                break;
            case R.id.answer2:
                if(test_answer[i*3+1].equals(true_answer[i])) test_result++;
                i++;
                if(i<=4){
                    question.setText(test_questin[i]);
                    answer1.setText(test_answer[i*3]);
                    answer2.setText(test_answer[i*3+1]);
                    answer3.setText(test_answer[i*3+2]);
                } else {
                    Intent intent = new Intent(TestActivity.this, ResultActivity.class);
                    startActivity(intent);
                }
                break;
            case R.id.answer3:
                if(test_answer[i*3+2].equals(true_answer[i])) test_result++;
                i++;
                if(i<=4){
                    question.setText(test_questin[i]);
                    answer1.setText(test_answer[i*3]);
                    answer2.setText(test_answer[i*3+1]);
                    answer3.setText(test_answer[i*3+2]);
                } else {
                    Intent intent = new Intent(TestActivity.this, ResultActivity.class);
                    startActivity(intent);
                }
                break;
            default:
                break;
        }
    }
}
