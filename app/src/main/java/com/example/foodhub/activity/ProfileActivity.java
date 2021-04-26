package com.example.foodhub.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NavUtils;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.foodhub.R;
import com.example.foodhub.SessionData;

public class ProfileActivity extends AppCompatActivity {
    private Button btnUpdate, btnLogout;
    private EditText etPassword, etPhone, etEmail, etName;
    private Toolbar toolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        initViews();
        initViewsWithData();
    }

    private void initViews() {
        toolBar = findViewById(R.id.toolbar);
        btnUpdate = findViewById(R.id.btn_update);
        btnLogout = findViewById(R.id.btn_logout);
        etPassword = findViewById(R.id.et_password);
        etPhone = findViewById(R.id.et_phone);
        etEmail = findViewById(R.id.et_email);
        etName = findViewById(R.id.et_name);
    }

    private void initViewsWithData() {
        setSupportActionBar(toolBar);
        getSupportActionBar().setTitle("Profile");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        etEmail.setEnabled(false);
        etName.setText(SessionData.I.localData.currentUser.getName());
        etEmail.setText(SessionData.I.localData.currentUser.getEmail());
        etPhone.setText(SessionData.I.localData.currentUser.getPhone());
        etPassword.setText(SessionData.I.localData.currentUser.getPassword());
        btnUpdate.setOnClickListener(view -> {
            if (!isValid()) return;
            for (int i = 0; i < SessionData.I.localData.userList.size(); i++) {
                if (SessionData.I.localData.userList.get(i).getEmail().equals(SessionData.I.localData.currentUser.getEmail())) {
                    SessionData.I.localData.userList.get(i).setName(etName.getText().toString().trim());
                    SessionData.I.localData.userList.get(i).setPhone(etPhone.getText().toString().trim());
                    SessionData.I.localData.userList.get(i).setPassword(etPassword.getText().toString().trim());
                    SessionData.I.saveLocalData();
                    Toast.makeText(this, "Updated Successfully", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        btnLogout.setOnClickListener(view -> {
            SessionData.I.setLogin(false);
            SessionData.I.goTo(this, LoginActivity.class);
            finish();
        });
    }

    private boolean isValid() {
        boolean isValid = true;
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
        return isValid;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}