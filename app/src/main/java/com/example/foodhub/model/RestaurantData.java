package com.example.foodhub.model;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class RestaurantData {
    private Drawable img = null;
    private String name = null;
    private String rating = null;
    private String dishes = null;
    private ArrayList<FoodData> foodList = new ArrayList<>();

    public Drawable getImg() {
        return img;
    }

    public void setImg(Drawable img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDishes() {
        return dishes;
    }

    public void setDishes(String dishes) {
        this.dishes = dishes;
    }

    public ArrayList<FoodData> getFoodList() {
        return foodList;
    }

    public void setFoodList(ArrayList<FoodData> foodList) {
        this.foodList = foodList;
    }
}
