package com.example.foodhub;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class HelpDialogBox extends Dialog {
    private final Activity activity;
    private Button btn_ok;
    private TextView tv_email, tv_phone;

    public HelpDialogBox(Activity activity) {
        super(activity);
        this.activity = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.help_dialog);

        btn_ok = findViewById(R.id.btn_ok);
        tv_phone = findViewById(R.id.tv_phone);
        tv_email = findViewById(R.id.tv_email);

        tv_phone.setOnClickListener(view -> {
            String number = "6313855444";
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:" + number));//change the number
            activity.startActivity(callIntent);
        });
        tv_email.setOnClickListener(view -> {
            Intent email = new Intent(Intent.ACTION_SEND);
            email.putExtra(Intent.EXTRA_EMAIL, new String[]{activity.getResources().getString(R.string.food_hub_com)});

//need this to prompts email client only
            email.setType("message/rfc822");

            activity.startActivity(Intent.createChooser(email, "Choose an Email client :"));
        });


        btn_ok.setOnClickListener(view -> {
            dismiss();
        });

    }

}
