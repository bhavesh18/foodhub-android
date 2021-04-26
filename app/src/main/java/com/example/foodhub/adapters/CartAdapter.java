package com.example.foodhub.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodhub.R;
import com.example.foodhub.RecyclerViewBase;
import com.example.foodhub.SessionData;
import com.example.foodhub.model.FoodData;

import java.util.ArrayList;

public class CartAdapter extends RecyclerViewBase {
    private final ArrayList<FoodData> cartList;
    private ImageView iv_delete, iv_item;
    private TextView tv_item_name, tv_price, tv_qty;

    public CartAdapter(ArrayList<FoodData> cartList) {
        this.cartList = cartList;
    }

    @Override
    protected int rowLayout() {
        return R.layout.row_cart;
    }

    @Override
    protected void updateView(int position) {
        FoodData data = cartList.get(position);
        iv_item.setImageResource(data.getImg());
        tv_item_name.setText(data.getName());
        tv_price.setText("Price: $" + data.getPrice());
        tv_qty.setText("Qty: " + data.getQuantity());

        iv_delete.setOnClickListener(view->{
            for (int i = 0; i < SessionData.I.localData.cartList.size(); i++) {
                if (SessionData.I.localData.cartList.get(i).getName().equals(data.getName())){
                    SessionData.I.localData.cartList.remove(i);
                    SessionData.I.saveLocalData();
                    notifyDataSetChanged();
                    break;
                }
            }
        });

    }

    @Override
    protected int getListCount() {
        return cartList.size();
    }

    @Override
    protected void viewHolder(View itemView) {
        iv_item = itemView.findViewById(R.id.iv_item);
        iv_delete = itemView.findViewById(R.id.iv_delete);
        tv_item_name = itemView.findViewById(R.id.tv_item_name);
        tv_price = itemView.findViewById(R.id.tv_price);
        tv_qty = itemView.findViewById(R.id.tv_qty);
    }
}
