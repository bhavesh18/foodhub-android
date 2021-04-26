package com.example.foodhub;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class CardDialogBox extends Dialog {
    private final Activity activity;
    private Button btnPay;
    private EditText etCvv, etCardNumber, etNameOnCard, etExpiry;
    private RadioButton rbCard, rbCashOnDelivery;

    public CardDialogBox(Activity activity) {
        super(activity);
        this.activity = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.card_dialog);
        btnPay = findViewById(R.id.btn_pay);
        etNameOnCard = findViewById(R.id.et_name_on_card);
        etCardNumber = findViewById(R.id.et_card_number);
        etExpiry = findViewById(R.id.et_expiry);
        etCvv = findViewById(R.id.et_cvv);
        rbCashOnDelivery = findViewById(R.id.rb_cash_on_delivery);
        rbCard = findViewById(R.id.rb_card);
        rbCashOnDelivery.setChecked(true);
        rbCashOnDelivery.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                visibility(false);
            }
        });
        rbCard.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                visibility(true);
            }
        });

        btnPay.setOnClickListener(view -> {
            if (rbCard.isChecked()) {
                if (!isValid()) return;
            }
            SessionData.I.localData.currentUser.orderHistory.addAll(SessionData.I.localData.cartList);
            for (int i = 0; i < SessionData.I.localData.userList.size(); i++) {
                if (SessionData.I.localData.userList.get(i).getEmail().equals(SessionData.I.localData.currentUser.getEmail())) {
                    SessionData.I.localData.userList.get(i).orderHistory.addAll(SessionData.I.localData.currentUser.orderHistory);
                }
            }
            SessionData.I.saveLocalData();
            SessionData.I.localData.cartList.clear();
            SessionData.I.saveLocalData();
            Log.d("TAGSIZE", String.valueOf(SessionData.I.localData.currentUser.getOrderHistory().size()));
            Toast.makeText(activity, "Order placed Successfully", Toast.LENGTH_SHORT).show();
            dismiss();
            activity.finish();
        });

    }

    private void visibility(boolean isVisible) {
        if (isVisible) {
            etCvv.setVisibility(View.VISIBLE);
            etCardNumber.setVisibility(View.VISIBLE);
            etNameOnCard.setVisibility(View.VISIBLE);
            etExpiry.setVisibility(View.VISIBLE);
        } else {
            etCvv.setVisibility(View.GONE);
            etCardNumber.setVisibility(View.GONE);
            etNameOnCard.setVisibility(View.GONE);
            etExpiry.setVisibility(View.GONE);
        }
    }

    private boolean isValid() {
        boolean isValid = true;
        if (etNameOnCard.getText().toString().trim().isEmpty()) {
            etNameOnCard.setError("Please fill this field");
            isValid = false;
        }
        if (etCardNumber.getText().toString().trim().isEmpty()) {
            etCardNumber.setError("Please fill this field");
            isValid = false;
        }
        if (etExpiry.getText().toString().trim().isEmpty()) {
            etExpiry.setError("Please fill this field");
            isValid = false;
        }

        if (etCvv.getText().toString().trim().isEmpty()) {
            etCvv.setError("Please fill this field");
            isValid = false;
        }
        return isValid;
    }
}
