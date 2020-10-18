package com.example.coursehelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        Intent intent = getIntent();
        String question = intent.getStringExtra(AskQuestionActivity.EXTRA_QUESTION);

        TextView textQuestionNew = findViewById(R.id.textQuestionNew);

        textQuestionNew.setText(question);
    }
}