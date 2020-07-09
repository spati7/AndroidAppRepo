package com.example.myfoodzapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;

import com.example.myfoodzapplication.R;

public class HomeActivity extends AppCompatActivity {
Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b1=findViewById(R.id.btnStart);
        b2=findViewById(R.id.btnGuest);
        b3=findViewById(R.id.btnLogin);
        String text = "Already a Tiffinia Member? LOGIN";
        SpannableStringBuilder ssb = new SpannableStringBuilder(text);
        ForegroundColorSpan clrLogin = new ForegroundColorSpan(Color.RED);
        ssb.setSpan(clrLogin, 27, 32, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        b3.setText(ssb);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeActivity.this, LoginFirstActivity.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeActivity.this,LoginFirstActivity.class);
                startActivity(i);
            }
        });
    }
}