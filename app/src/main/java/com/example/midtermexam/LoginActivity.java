package com.example.midtermexam;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class LoginActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.inputEmail); // Assuming inputEmail is the username field
        passwordEditText = findViewById(R.id.inputPassword); // Assuming inputPassword is the password field
        loginButton = findViewById(R.id.btnlogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement your login logic here
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (isValidLogin(username, password)) {
                    // Successful login, navigate to MainActivity
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    finish(); // Close the login activity to prevent going back to it
                } else {
                    // Handle unsuccessful login (show an error message, for example)
                    // You can add your own error handling here
                }
            }
        });

        // Handle the "SignUp" TextView click to go to the registration activity
        TextView btnSignUp = findViewById(R.id.textViewSignUp);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
    }

    // Replace this with your actual login validation logic
    private boolean isValidLogin(String username, String password) {
        boolean loginSuccessful = true;

        if (loginSuccessful) {
            // If login is successful, proceed to MainActivity
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }
        // Implement your validation logic here
        // For this example, we just check if both fields are not empty
        return !username.isEmpty() && !password.isEmpty();
    }
}
