package com.example.ankilock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button question;
    private Button answer1;
    private Button answer2;
    private String answer = "direct the course of; manage or control";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer==answer1.getText()){
                    answer1.setBackgroundColor(answer1.getContext().getResources().getColor(R.color.white));
                    answer2.setBackgroundColor(answer2.getContext().getResources().getColor(R.color.black));
                }
                else{
                    answer2.setBackgroundColor(answer2.getContext().getResources().getColor(R.color.white));
                    answer1.setBackgroundColor(answer1.getContext().getResources().getColor(R.color.black));
                }
            }
        });



    }

    private void setupUIViews(){
        question =(Button) findViewById(R.id.btnquestion);
        answer1 = (Button) findViewById(R.id.btnans1);
        answer2 = (Button) findViewById(R.id.btnans2);
    }
}