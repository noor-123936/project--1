package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class QuestionBank extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_bank);

        Button MButton = findViewById(R.id.mathButton);
        Button SButton = findViewById(R.id.scienceButton);
        Button HButton = findViewById(R.id.historyButton);
        MButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMath();
            }
        });

        SButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScience();
            }
        });
        HButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHistory();
            }
        });
    }

    public void openMath() {
        // Implement the logic to open the Student Portal here
        Intent intent = new Intent(this, MathQuestionsActivity.class);
        startActivity(intent);
    }

    public void openScience() {
        // Implement the logic to open the Admin Portal here
        Intent intent = new Intent(this,  ScenceQuestionActivity.class);
        startActivity(intent);
    }
    public void openHistory() {
        // Implement the logic to open the Admin Portal here
        Intent intent = new Intent(this,  HistoryQuestionActivity.class);
        startActivity(intent);
    }
}