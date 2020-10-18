package com.example.coursehelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
       // Intent intent = getIntent();
        //String email = intent.getStringExtra(MainActivity.EXTRA_EMAIL);
        //String password = intent.getStringExtra(MainActivity.EXTRA_PASSWORD);

        Spinner spinner = (Spinner) findViewById(R.id.spinnerDept);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.depts_array, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}