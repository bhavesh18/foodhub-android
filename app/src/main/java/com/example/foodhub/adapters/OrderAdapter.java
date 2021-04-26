package com.example.foodhub.adapters;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodhub.R;
import com.example.foodhub.RecyclerViewBase;
import com.example.foodhub.model.FoodData;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerViewBase {
    private final ArrayList<FoodData> orderList;
    private TextView tv_price, tv_qty, tv_restaurant_name, tv_item_name, tv_date;
    private ImageView iv_item;

    public OrderAdapter(ArrayList<FoodData> orderList) {
        this.orderList = orderList;
    }

    @Override
    protected int rowLayout() {
        return R.layout.row_order;
    }

    @Override
    protected void updateView(int position) {
        FoodData data = orderList.get(position);
        iv_item.setImageResource(data.getImg());
        tv_item_name.setText(data.getName());
        tv_qty.setText("Qty: " + data.getQuantity());
        tv_price.setText("Price: $" + data.getPrice());
        tv_date.setText("Date: " + data.getDate());
    }

    @Override
    protected int getListCount() {
        return orderList.size();
    }

    @Override
    protected void viewHolder(View itemView) {
        tv_price = itemView.findViewById(R.id.tv_price);
        tv_qty = itemView.findViewById(R.id.tv_qty);
        tv_restaurant_name = itemView.findViewById(R.id.tv_restaurant_name);
        tv_item_name = itemView.findViewById(R.id.tv_item_name);
        tv_date = itemView.findViewById(R.id.tv_date);
        iv_item = itemView.findViewById(R.id.iv_item);
    }
}
