package com.example.myfoodzapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.myfoodzapplication.R;

public class MainActivity extends AppCompatActivity {
private static int SP_TIME_OUT=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable(){
        public void run(){
            Intent intent=new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        }
        },SP_TIME_OUT);
    }
}