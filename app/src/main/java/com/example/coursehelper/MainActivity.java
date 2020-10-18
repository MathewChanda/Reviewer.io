package com.example.coursehelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    /** Constant for email */
    public static final String EXTRA_EMAIL = "com.example.coursehelper.EMAIL";
    /** Constant for password */
    public static final String EXTRA_PASSWORD = "com.example.coursehelper.PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void login(View view) {
        Intent intent = new Intent(this, SelectActivity.class);

        EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);

        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();

        intent.putExtra(EXTRA_EMAIL, email);
        intent.putExtra(EXTRA_PASSWORD, password);

        startActivity(intent);
    }
}