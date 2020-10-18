package com.example.coursehelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QuestionCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_card);
    }

    /** Called when the user taps the New Question button */
    public void askQuestion(View view) {
        Intent intent = new Intent(this, AskQuestionActivity.class);

        startActivity(intent);
    }
}