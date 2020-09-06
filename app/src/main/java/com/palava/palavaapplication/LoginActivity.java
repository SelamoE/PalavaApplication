package com.palava.palavaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView name, password,loginRememberMe;
    Button loginButton, signupButton;
    TextView forgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name = findViewById(R.id.loginName);
        password = findViewById(R.id.loginPassword);
        loginRememberMe = (Button)findViewById(R.id.loginRememberMe);
        loginButton = (Button)findViewById(R.id.loginButton);
        signupButton = (Button) findViewById(R.id.loginSingupButton);
        forgotPassword = (TextView) findViewById(R.id.loginForgotPassword);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });


    }
}