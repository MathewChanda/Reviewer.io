package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String email = intent.getStringExtra(MainActivity.EXTRA_EMAIL);
        String password = intent.getStringExtra(MainActivity.EXTRA_PASSWORD);

        // Capture the layout's TextView and set the string as its text
        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        textView1.setText(email);
        textView2.setText(password);
    }
}