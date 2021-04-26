package com.example.foodhub.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NavUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import com.example.foodhub.CardDialogBox;
import com.example.foodhub.CustomDialogBox;
import com.example.foodhub.R;
import com.example.foodhub.SessionData;
import com.example.foodhub.adapters.CartAdapter;

public class CartActivity extends AppCompatActivity {
    private RecyclerView recycler_view;
    private Button btn_place_order;
    private Toolbar toolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        initViews();
        initViewsWithData();
    }

    private void initViews() {
        toolBar = findViewById(R.id.toolbar);
        recycler_view = findViewById(R.id.recycler_view);
        btn_place_order = findViewById(R.id.btn_place_order);
    }

    private void initViewsWithData() {
        setSupportActionBar(toolBar);
        getSupportActionBar().setTitle("Your Cart");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initAdapter();
        btn_place_order.setOnClickListener(view -> {
            if (SessionData.I.localData.currentUser.getAddress() == null || SessionData.I.localData.currentUser.getAddress().isEmpty()) {
                CustomDialogBox customDialogBox = new CustomDialogBox(this);
                customDialogBox.show();
            } else {
                CardDialogBox cardDialogBox = new CardDialogBox(this);
                cardDialogBox.show();

            }
        });
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

    private void initAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recycler_view.setLayoutManager(linearLayoutManager);
        CartAdapter cartAdapter = new CartAdapter(SessionData.I.localData.cartList);
        recycler_view.setAdapter(cartAdapter);
    }
}