package com.example.foodhub.model;

import java.util.ArrayList;

public class UserData {
    private String name = null;
    private String phone = null;
    private String email = null;
    private String password = null;
    private String address = null;
    public ArrayList<FoodData> orderHistory = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<FoodData> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(ArrayList<FoodData> orderHistory) {
        this.orderHistory = orderHistory;
    }
}
