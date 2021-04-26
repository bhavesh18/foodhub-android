package com.example.foodhub.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.foodhub.R;
import com.example.foodhub.SessionData;
import com.example.foodhub.model.UserData;

import java.nio.file.attribute.UserDefinedFileAttributeView;

public class SignUpActivity extends AppCompatActivity {
    private EditText etConfirmPassword, etPassword, etPhone, etEmail, etName;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        initViews();
        initViewsWithData();

    }

    private void initViews() {
        etConfirmPassword = findViewById(R.id.et_confirm_password);
        etPassword = findViewById(R.id.et_password);
        etPhone = findViewById(R.id.et_phone);
        etEmail = findViewById(R.id.et_email);
        etName = findViewById(R.id.et_name);
        btnSignUp = findViewById(R.id.btn_sign_up);
    }

    private void initViewsWithData() {
        btnSignUp.setOnClickListener(view -> {
            if (!isValid()) return;
            UserData userData = new UserData();
            userData.setEmail(etEmail.getText().toString().trim());
            userData.setName(etName.getText().toString().trim());
            userData.setPassword(etPassword.getText().toString().trim());
            userData.setPhone(etPhone.getText().toString().trim());
            SessionData.I.localData.userList.add(userData);
            SessionData.I.saveLocalData();
            finish();
        });
    }

    private boolean isValid() {
        boolean isValid = true;
        if (etEmail.getText().toString().trim().isEmpty()) {
            etEmail.setError("Please fill this field");
            isValid = false;
        }
        if (etPassword.getText().toString().trim().isEmpty()) {
            etPassword.setError("Please fill this field");
            isValid = false;
        }
        if (etPhone.getText().toString().trim().isEmpty()) {
            etPhone.setError("Please fill this field");
            isValid = false;
        }
        if (etPhone.getText().toString().trim().length() > 10 || etPhone.getText().toString().trim().length() < 10) {
            etPhone.setError("Please write 10 digit phone number");
            isValid = false;
        }
        if (etName.getText().toString().trim().isEmpty()) {
            etPassword.setError("Please fill this field");
            isValid = false;
        }
        if (etConfirmPassword.getText().toString().trim().isEmpty()) {
            etPassword.setError("Please fill this field");
            isValid = false;
        }
        if (!etPassword.getText().toString().trim().equals(etConfirmPassword.getText().toString().trim())) {
            Toast.makeText(this, "Password is not matching", Toast.LENGTH_SHORT).show();
            isValid = false;
        }
        return isValid;
    }

}