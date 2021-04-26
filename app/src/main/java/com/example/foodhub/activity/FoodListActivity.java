package com.example.foodhub.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NavUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.foodhub.Constants;
import com.example.foodhub.R;
import com.example.foodhub.adapters.FoodAdapter;
import com.example.foodhub.model.FoodData;

import java.util.ArrayList;

public class FoodListActivity extends AppCompatActivity {

    private ArrayList<FoodData> foodList = new ArrayList<>();
    private RecyclerView recyclerView;
    private FoodAdapter foodAdapter;
    private Toolbar toolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        initViews();
        initViewsWithData();
    }

    private void initViews() {
        toolBar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.recycler_view);
    }

    private void initViewsWithData() {
        Bundle bundle = getIntent().getExtras();
        String restaurantName = bundle.getString("restaurantName");
        setSupportActionBar(toolBar);
        getSupportActionBar().setTitle(restaurantName);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initAdapter();
        setList(restaurantName);
    }

    private void setList(String restaurantName) {
        switch (restaurantName) {
            case "Tim Horton":
                foodList.clear();
                foodList.addAll(Constants.timHorton(this));
                break;
            case "La Piazza":
                foodList.clear();
                foodList.addAll(Constants.piazza(this));
                break;
            case "Red Zen Courtyard":
                foodList.clear();
                foodList.addAll(Constants.ZenCourtYard(this));
                break;
            case "The bill chill cakery":
                foodList.clear();
                foodList.addAll(Constants.cakery(this));
                break;
            case "Baton Rouge":
                foodList.clear();
                foodList.addAll(Constants.leCircue(this));
                break;
            case "Le cirque":
                foodList.clear();
                foodList.addAll(Constants.leCircue(this));
                break;
        }
        foodAdapter.notifyDataSetChanged();
    }

    private void initAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        foodAdapter = new FoodAdapter(foodList, this);
        recyclerView.setAdapter(foodAdapter);
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