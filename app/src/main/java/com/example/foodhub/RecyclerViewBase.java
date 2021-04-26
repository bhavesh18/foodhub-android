package com.example.foodhub;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public abstract class RecyclerViewBase extends RecyclerView.Adapter<RecyclerViewBase.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout(), parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        updateView(position);
    }

    @Override
    public int getItemCount() {
        return getListCount();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            viewHolder(itemView);
        }
    }

    protected abstract int rowLayout();

    protected abstract void updateView(int position);

    protected abstract int getListCount();

    protected abstract void viewHolder(View itemView);

}
