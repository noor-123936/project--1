/*

package com.example.myapplication;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class StudentDashboard extends AppCompatActivity {

    private EditText nameEditText, registrationNoEditText, emailEditText, passwordEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_dashboard);

        nameEditText = findViewById(R.id.editTextTextPersonName);
        registrationNoEditText = findViewById(R.id.editTextTextPersonName2);
        emailEditText = findViewById(R.id.editTextTextPersonName3);
        passwordEditText = findViewById(R.id.editTextTextEmailAddress);
        submitButton = findViewById(R.id.button);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String registrationNo = registrationNoEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
            }
        });
    }
}package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class StudentDashboard extends AppCompatActivity {

    private EditText nameEditText, registrationNoEditText, emailEditText, passwordEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_dashboard);
        Button submitButton = findViewById(R.id.button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSubmit();
            }
        });

      /*  nameEditText = findViewById(R.id.editTextTextPersonName);
        registrationNoEditText = findViewById(R.id.editTextTextPersonName2);
        emailEditText = findViewById(R.id.editTextTextPersonName3);
        passwordEditText = findViewById(R.id.editTextTextEmailAddress);
        submitButton = findViewById(R.id.button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String registrationNo = registrationNoEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Create an intent to start the QuestionBank activity
                Intent intent = new Intent(StudentDashboard.this, QuestionBank.class);
                /*intent.putExtra("name", name);
                intent.putExtra("registrationNo", registrationNo);
                intent.putExtra("email", email);
                intent.putExtra("password", password);
                startActivity(intent);
            }
        });


    }


    public void onSubmit() {
        // Implement the logic to open the Student Portal here
        Intent intent = new Intent(this, QuestionBank.class);
        startActivity(intent);
    }
}

*/
package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class StudentDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_dashboard);

        Button submitButton = findViewById(R.id.button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSubmit();
            }
        });
    }

    public void onSubmit() {
        // Implement the logic to open the Student Portal here
        Intent intent = new Intent(this,  QuestionBank.class);
        startActivity(intent);
    }
}