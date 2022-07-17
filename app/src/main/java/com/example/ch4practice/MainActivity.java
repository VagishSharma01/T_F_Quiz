package com.example.ch4practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public String[] questions = {"A jellyfish is 95% water?","The egg of a Hummingbird is the smallest in the world","All tigers have yellow eyes","The Fish cannot blink","The tomb of Akbar is in Agra","Beijing is the capital of China","Polar Bears lives in the Arctic"};
    public boolean[] answers = {true,true,true,true,true,true,true};
    TextView question;
    Button yes;
    Button no;
    public int score=0;
    public int index =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question = findViewById(R.id.question);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (index <= questions.length - 1) {
                    if (answers[index] == true) {
                        score++;

                    }
                    index++;
                    if (index <= questions.length - 1) {
                        question.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "Your Score is : " + score, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<=questions.length-1){
                    if(answers[index]==false){
                        score++;

                    }
                    index++;
                    if(index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your Score is : "+score, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

}