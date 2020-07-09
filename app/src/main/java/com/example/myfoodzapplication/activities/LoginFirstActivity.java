package com.example.myfoodzapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myfoodzapplication.R;

public class LoginFirstActivity extends AppCompatActivity {
    TextView tc;
    Button btMob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_first);
        tc=(TextView) findViewById(R.id.txtViewTC);
        tc.setMovementMethod(LinkMovementMethod.getInstance());
        btMob=(Button)findViewById(R.id.btnMob);
        btMob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logIn=new Intent(LoginFirstActivity.this, LoginActivity.class);
                startActivity(logIn);
            }
        });
    }
}