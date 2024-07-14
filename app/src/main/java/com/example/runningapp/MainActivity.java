package com.example.runningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToLoginPage(View view){
        setContentView(R.layout.activity_login);
    }

    public void goToSingupPage(View view){
        setContentView(R.layout.activity_signup);
    }

}