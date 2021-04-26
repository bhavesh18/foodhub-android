package com.example.foodhub.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NavUtils;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.foodhub.R;
import com.example.foodhub.SessionData;
import com.example.foodhub.model.FoodData;

import java.util.Calendar;

public class FoodDetailActivity extends AppCompatActivity {
    private String foodName, details, calorie;
    private float price;
    private int image;
    private TextView tvDescription, tvPrice, tvCalorie, tvItemName, tvTotalPrice, tvFoodItemName;
    private ImageView ivItemImage;
    private Button btnAddToCart, btnMinus, btnPlus;
    private int quantity = 1;
    private Toolbar toolBar;
//    private float priceInt;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);
        initViews();
        initViewsWithData();

    }

    private void initViews() {
        toolBar = findViewById(R.id.toolbar);
        tvDescription = findViewById(R.id.tv_description);
        tvPrice = findViewById(R.id.tv_price);
        tvCalorie = findViewById(R.id.tv_calorie);
        tvItemName = findViewById(R.id.tv_item_name);
        ivItemImage = findViewById(R.id.iv_item_image);
        tvTotalPrice = findViewById(R.id.tv_total_price);
        tvFoodItemName = findViewById(R.id.tv_food_item_name);
        btnAddToCart = findViewById(R.id.btn_add_to_cart);
        btnMinus = findViewById(R.id.btn_minus);
        btnPlus = findViewById(R.id.btn_plus);

    }

    private void initViewsWithData() {
        setSupportActionBar(toolBar);
        getSupportActionBar().setTitle("Food Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            foodName = bundle.getString("foodName", "");
            details = bundle.getString("details", "");
            calorie = bundle.getString("calorie", "");
            price = bundle.getFloat("price", 0.0f);
            image = bundle.getInt("image");
        }
        tvDescription.setText(details);
        tvPrice.setText("$" + price);
        tvCalorie.setText(calorie);
        tvItemName.setText(foodName);
        ivItemImage.setImageResource(image);
        btnMinus.setEnabled(false);

        tvTotalPrice.setText("$" + (price * quantity));
        tvFoodItemName.setText(foodName + " (x" + quantity + ")");
        btnAddToCart.setOnClickListener(view -> {
            FoodData data = new FoodData();
            data.setDetails(details);
            data.setCalories(calorie);
            data.setName(foodName);
            data.setImg(image);
            data.setQuantity(quantity);
            data.setDate(SessionData.I.getDate());
            data.setPrice(price * quantity);
            SessionData.I.localData.cartList.add(data);
            SessionData.I.saveLocalData();
            Toast.makeText(this, "Added to cart", Toast.LENGTH_SHORT).show();
            finish();
        });

        btnPlus.setOnClickListener(view -> {
            quantity += 1;
            if (quantity > 1) {
                btnMinus.setEnabled(true);
            }
            tvTotalPrice.setText("$" + (price * quantity));
            tvFoodItemName.setText(foodName + " (x" + quantity + ")");
        });
        btnMinus.setOnClickListener(view -> {
            if (quantity == 1) {
                btnMinus.setEnabled(false);
            } else {
                quantity -= 1;
                tvTotalPrice.setText("$" + (price * quantity));
                tvFoodItemName.setText(foodName + " (x" + quantity + ")");
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
}