package com.example.foodhub;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class CustomDialogBox extends Dialog {

    public Activity activity;

    public Button btnAdd;
    public EditText etAddress;

    public CustomDialogBox(Activity activity) {
        super(activity);
        this.activity = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.cart_dialog);
        btnAdd = findViewById(R.id.btn_add);
        etAddress = findViewById(R.id.et_address);
        btnAdd.setOnClickListener(view -> {
            if (!etAddress.getText().toString().trim().isEmpty()) {
                SessionData.I.localData.currentUser.setAddress(etAddress.getText().toString().trim());
                for (int i = 0; i < SessionData.I.localData.userList.size(); i++) {
                    if (SessionData.I.localData.userList.get(i).getEmail().equals(SessionData.I.localData.currentUser.getEmail())) {
                        SessionData.I.localData.userList.get(i).setAddress(etAddress.getText().toString().trim());
                    }
                }
            } else {
                etAddress.setError("Please fill this field");
                return;
            }
            SessionData.I.saveLocalData();
            dismiss();
        });

    }
}
