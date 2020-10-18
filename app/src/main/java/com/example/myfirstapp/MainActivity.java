package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    /** Constant for email */
    public static final String EXTRA_EMAIL = "com.example.myfirstapp.EMAIL";
    /** Constant for password */
    public static final String EXTRA_PASSWORD = "com.example.myfirstapp.PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void login(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);

        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();

        intent.putExtra(EXTRA_EMAIL, email);
        intent.putExtra(EXTRA_PASSWORD, password);

        startActivity(intent);
    }
}