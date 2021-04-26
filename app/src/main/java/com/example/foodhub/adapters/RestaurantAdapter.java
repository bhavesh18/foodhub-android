package com.example.foodhub.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.foodhub.R;
import com.example.foodhub.RecyclerViewBase;
import com.example.foodhub.activity.FoodListActivity;
import com.example.foodhub.model.RestaurantData;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerViewBase {
    private final ArrayList<RestaurantData> list;
    private TextView tvRating, tvDishType, tvRestaurantName;
    private ImageView ivRestaurantImage;
    private CardView cv_layout;
    private Context context;

    public RestaurantAdapter(ArrayList<RestaurantData> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    protected int rowLayout() {
        return R.layout.row_restaurant;
    }

    @Override
    protected void updateView(int position) {
        RestaurantData data = list.get(position);
        ivRestaurantImage.setImageDrawable(data.getImg());
        tvRestaurantName.setText(data.getName());
        tvDishType.setText(data.getDishes());
        tvRating.setText(data.getRating());
        cv_layout.setOnClickListener(view -> {
            Intent intent = new Intent(context, FoodListActivity.class);
            intent.putExtra("restaurantName", data.getName());
            context.startActivity(intent);
        });

    }

    @Override
    protected int getListCount() {
        return list.size();
    }

    @Override
    protected void viewHolder(View itemView) {
        cv_layout = itemView.findViewById(R.id.cv_layout);
        tvRating = itemView.findViewById(R.id.tv_rating);
        tvDishType = itemView.findViewById(R.id.tv_dish_type);
        tvRestaurantName = itemView.findViewById(R.id.tv_restaurant_name);
        ivRestaurantImage = itemView.findViewById(R.id.iv_restaurant_image);
    }
}
