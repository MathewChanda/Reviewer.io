package com.example.coursehelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AskQuestionActivity extends AppCompatActivity {
    /** Constant for question */
    public static final String EXTRA_QUESTION = "com.example.coursehelper.QUESTION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_question);
    }

    /** Called when the user taps the Post button */
    public void askQuestion(View view) {
        Intent intent = new Intent(this, AnswerActivity.class);

        EditText editTextMulti = (EditText) findViewById(R.id.editTextTextMultiLine);
        String question = editTextMulti.getText().toString();

        intent.putExtra(EXTRA_QUESTION, question);

        startActivity(intent);
    }
}