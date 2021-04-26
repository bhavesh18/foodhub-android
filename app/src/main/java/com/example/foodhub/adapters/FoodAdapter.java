package com.example.foodhub.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.foodhub.R;
import com.example.foodhub.RecyclerViewBase;
import com.example.foodhub.activity.FoodDetailActivity;
import com.example.foodhub.model.FoodData;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerViewBase {
    private final ArrayList<FoodData> list;
    private TextView tvPrice, tvCalories, tvFoodItem;
    private ImageView ivFoodImage, ivStar/*, ivDish*/;
    private CardView cvLayout;
    private Context context;

    public FoodAdapter(ArrayList<FoodData> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    protected int rowLayout() {
        return R.layout.row_restaurant;
    }

    @Override
    protected void updateView(int position) {
        FoodData data = list.get(position);
        ivStar.setVisibility(View.INVISIBLE);
//        ivDish.setVisibility(View.INVISIBLE);
        tvPrice.setText("$" + data.getPrice());
        tvCalories.setText("Calories: " + data.getCalories());
        tvFoodItem.setText(data.getName());
        ivFoodImage.setImageResource(data.getImg());
        cvLayout.setOnClickListener(view -> {
            Intent intent = new Intent(context, FoodDetailActivity.class);
            intent.putExtra("foodName", data.getName());
            intent.putExtra("price", data.getPrice());
            intent.putExtra("calorie", data.getCalories());
            intent.putExtra("details", data.getDetails());
            intent.putExtra("image", data.getImg());
            context.startActivity(intent);
        });

    }

    @Override
    protected int getListCount() {
        return list.size();
    }

    @Override
    protected void viewHolder(View itemView) {
        ivStar = itemView.findViewById(R.id.iv_star);
        cvLayout = itemView.findViewById(R.id.cv_layout);
//        ivDish = itemView.findViewById(R.id.iv_dish);
        tvPrice = itemView.findViewById(R.id.tv_rating);
        tvCalories = itemView.findViewById(R.id.tv_dish_type);
        tvFoodItem = itemView.findViewById(R.id.tv_restaurant_name);
        ivFoodImage = itemView.findViewById(R.id.iv_restaurant_image);
    }
}
