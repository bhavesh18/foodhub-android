package com.example.foodhub.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.foodhub.R;
import com.example.foodhub.SessionData;

public class LoginActivity extends AppCompatActivity {
    private TextView tvSignUp, tvForgotPassword;
    private Button btnLogin;
    private EditText etPassword, etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        SessionData.I.init(this);
        if (SessionData.I.isLogin()) {
            SessionData.I.goTo(this, MainActivity.class);
            finish();
        }
        initViews();
        initViewsWithData();
    }

    private void initViews() {
        tvSignUp = findViewById(R.id.tv_sign_up);
        tvForgotPassword = findViewById(R.id.tv_forgot_password);
        btnLogin = findViewById(R.id.btn_login);
        etPassword = findViewById(R.id.et_password);
        etEmail = findViewById(R.id.et_email);
    }

    private void initViewsWithData() {
        btnLogin.setOnClickListener(view -> {
            if (!isValid()) return;
            if (SessionData.I.localData.userList.size() != 0) {
                for (int i = 0; i < SessionData.I.localData.userList.size(); i++) {

                    if (etEmail.getText().toString().trim().equalsIgnoreCase(SessionData.I.localData.userList.get(i).getEmail())
                            && etPassword.getText().toString().trim().equals(SessionData.I.localData.userList.get(i).getPassword())) {
                        SessionData.I.localData.currentUser = SessionData.I.localData.userList.get(i);
                        SessionData.I.setLogin(true);
                        SessionData.I.saveLocalData();
                        SessionData.I.goTo(this, MainActivity.class);
                        finish();
                        break;
                    } else {
                        Toast.makeText(this, "Check your credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            } else {
                Toast.makeText(this, "There is no user registered", Toast.LENGTH_SHORT).show();
            }

        });

        tvSignUp.setOnClickListener(view -> {
            SessionData.I.goTo(this, SignUpActivity.class);
        });

        tvForgotPassword.setOnClickListener(view -> {
            if (etEmail.getText().toString().trim().isEmpty()) {
                Toast.makeText(this, "Please write your email", Toast.LENGTH_SHORT).show();
            } else {
                for (int i = 0; i < SessionData.I.localData.userList.size(); i++) {
                    if (etEmail.getText().toString().trim().equalsIgnoreCase(SessionData.I.localData.userList.get(i).getEmail())) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("Your password is:");
                        builder.setMessage(SessionData.I.localData.userList.get(i).getPassword());
                        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                builder.create().dismiss();
                            }
                        });
                        builder.create().show();
                    } else {
                        Toast.makeText(this, "There is no such User", Toast.LENGTH_SHORT).show();
                    }
                }
            }
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
        return isValid;
    }
}