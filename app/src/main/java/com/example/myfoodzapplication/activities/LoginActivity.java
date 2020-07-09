package com.example.myfoodzapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myfoodzapplication.R;
import com.example.myfoodzapplication.api.RetrofitClient;
import com.example.myfoodzapplication.model.LoginResponse;
import com.example.myfoodzapplication.model.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity{
    Button btnproceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etMobNo=(EditText)findViewById(R.id.etMob);
        final EditText etPassword=(EditText)findViewById(R.id.etPwd);

        btnproceed=findViewById(R.id.btnProceed);

            btnproceed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    User user=new User(etMobNo.getText().toString(),etPassword.getText().toString());
                    Call<LoginResponse> call = RetrofitClient.getInstance().getApi().userLogin(user);
                    call.enqueue(new Callback<LoginResponse>() {
                        @Override
                        public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                            LoginResponse loginResponse = response.body();
                            if (loginResponse.getStatus()==true) {

                                Toast.makeText(LoginActivity.this,"Login successful", Toast.LENGTH_LONG).show();

                            } else if(loginResponse.getStatus()==false){
                                Toast.makeText(LoginActivity.this,"Login not successful", Toast.LENGTH_LONG).show();
                            }
                        }

                        @Override
                        public void onFailure(Call<LoginResponse> call, Throwable t) {
                            Toast.makeText(LoginActivity.this,"Connection was not successful", Toast.LENGTH_LONG).show();
                        }
                    });
                }

            });

    }

}