package com.example.midtermexam;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    public EditText inputUsername;
    public EditText inputEmail;
    public EditText inputPassword;
    public EditText inputConfirmPassword;
    public Button btnRegister;
    public TextView alreadyHaveAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        inputUsername = findViewById(R.id.inputUsername);
        inputEmail = findViewById(R.id.inputEmail);
        inputPassword = findViewById(R.id.inputPassword);
        inputConfirmPassword = findViewById(R.id.inputConformPassword);
        btnRegister = findViewById(R.id.btnRegister);
        alreadyHaveAccount = findViewById(R.id.alreadyHaveAccount);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Place your registration logic here

                // After registration, proceed to the login form
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });

        alreadyHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Proceed to the login form
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });
    }
}
