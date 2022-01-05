package com.milople.emailvalidatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.milople.email_validator.EmailValidate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText email = findViewById(R.id.edit_text);
        Button validate = findViewById(R.id.button);
        validate.setOnClickListener(v -> {
            if (EmailValidate.getInstance().isValid(String.valueOf(email.getText())))
                Toast.makeText(MainActivity.this, getString(R.string.valid), Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(MainActivity.this, getString(R.string.invalid), Toast.LENGTH_SHORT).show();
        });
    }
}