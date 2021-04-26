package com.example.foodhub.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.foodhub.Constants;
import com.example.foodhub.R;
import com.example.foodhub.SessionData;
import com.example.foodhub.adapters.RestaurantAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private TextView tvCartNotification, tvPrimaryHeader;
    private ImageView ivCart, ivProfile, ivOrderHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initViewsWithData();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recycler_view);
        tvCartNotification = findViewById(R.id.tv_cart_notification);
        tvPrimaryHeader = findViewById(R.id.tv_primary_header);
        ivCart = findViewById(R.id.iv_cart);
        ivProfile = findViewById(R.id.iv_profile);
        ivOrderHistory = findViewById(R.id.iv_order_history);
    }

    @Override
    protected void onResume() {
        super.onResume();
        tvPrimaryHeader.setText("Hi " + SessionData.I.localData.currentUser.getName() + ",");
        if (SessionData.I.localData.cartList.size() > 0) {
            tvCartNotification.setVisibility(View.VISIBLE);
            tvCartNotification.setText(String.valueOf(SessionData.I.localData.cartList.size()));
        } else {
            tvCartNotification.setVisibility(View.GONE);
        }
    }

    private void initViewsWithData() {
        initAdapter();
        ivProfile.setOnClickListener(view -> {
            SessionData.I.goTo(this, ProfileActivity.class);
        });
        ivCart.setOnClickListener(view -> {
            SessionData.I.goTo(this, CartActivity.class);
        });
        ivOrderHistory.setOnClickListener(view -> {
            SessionData.I.goTo(this, OrderHistory.class);
        });
    }

    private void initAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(Constants.getRestaurantList(this), this);
        recyclerView.setAdapter(restaurantAdapter);
    }

}