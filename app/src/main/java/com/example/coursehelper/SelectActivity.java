package com.example.coursehelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SelectActivity extends AppCompatActivity {
    /** Constant for department */
    public static final String EXTRA_DEPT = "com.example.myfirstapp.DEPT";
    /** Constant for course */
    public static final String EXTRA_COURSE = "com.example.myfirstapp.COURSE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String email = intent.getStringExtra(MainActivity.EXTRA_EMAIL);
        String password = intent.getStringExtra(MainActivity.EXTRA_PASSWORD);

        Spinner spinner = (Spinner) findViewById(R.id.spinnerDept);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.depts_array, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    /** Called when the user taps the Next button */
    public void next(View view) {
        Intent intent = new Intent(this, QuestionCardActivity.class);

        Spinner textDept = (Spinner) findViewById(R.id.spinnerDept);
        Spinner textCourse = (Spinner) findViewById(R.id.spinnerCourseNum);

        String dept = (String) textDept.getItemAtPosition(1);
        String course = (String) textCourse.getItemAtPosition(1);

        intent.putExtra(EXTRA_DEPT, dept);
        intent.putExtra(EXTRA_COURSE, course);

        startActivity(intent);
    }
}