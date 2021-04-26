package com.example.foodhub.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NavUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.example.foodhub.HelpDialogBox;
import com.example.foodhub.R;
import com.example.foodhub.SessionData;
import com.example.foodhub.adapters.OrderAdapter;

public class OrderHistory extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Toolbar toolBar;
    private ImageView ivHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_history);
        initViews();
        initViewsWithData();

    }

    private void initViews() {
        toolBar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.recycler_view);
        ivHelp = findViewById(R.id.iv_help);
    }

    private void initViewsWithData() {
        setSupportActionBar(toolBar);
        getSupportActionBar().setTitle("Order History");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ivHelp.setOnClickListener(view -> {
            HelpDialogBox helpDialogBox = new HelpDialogBox(this);
            helpDialogBox.show();
        });
        initAdapter();
    }

    private void initAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        OrderAdapter orderAdapter = new OrderAdapter(SessionData.I.localData.currentUser.getOrderHistory());
        recyclerView.setAdapter(orderAdapter);
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