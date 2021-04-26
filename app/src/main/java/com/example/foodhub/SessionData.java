package com.example.foodhub;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;

import com.example.foodhub.model.LocalData;
import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SessionData {
    public static SessionData I = new SessionData();
    public static final int PREF_SAVED_DATA = 99;
    public static final int PREF_SAVED_DATA2 = 100;
    public static final int PREF_KEY_VERSION = 21;
    String version = "0";
    public static final String LOCAL_DATA_VERSION = "2";

    Gson gson = new Gson();
    protected SharedPreferences preferences;
    protected String fileName;

    public LocalData localData;

    private SessionData() {

    }

    public void goTo(Context context, Class<?> className) {
        Intent intent = new Intent(context, className);
        context.startActivity(intent);
    }

    public String getDate() {
        // Create a DateFormatter object for displaying date in specified format.
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy hh:mm a");
        // Create a calendar object that will convert the date and time value in milliseconds to date.
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        return formatter.format(calendar.getTime());
    }

    public void init(Context context) {
        fileName = context.getPackageName() + ".prefFile";
        preferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
        version = readString(PREF_KEY_VERSION);
        String data = readString(PREF_SAVED_DATA2);
        Log.d("TAG", "SessionData: " + data);


        if (!version.equals(LOCAL_DATA_VERSION) || data.length() <= 1) {
            version = LOCAL_DATA_VERSION;
            localData = new LocalData();
            saveLocalData();
        } else {
            if (data.length() > 1) {
                try {
                    this.localData = (gson.fromJson(data, LocalData.class));
                } catch (Exception e) {
                    localData = new LocalData();
                }
            }
        }
    }

    public void saveLocalData() {
        writeString(PREF_KEY_VERSION, version);
        String data = gson.toJson(localData, LocalData.class);
        Log.d("TAG", "saveData: " + data);
        writeString(PREF_SAVED_DATA2, data);
    }

    public void writeString(Integer key, String value) {
        preferences.edit().putString(key.toString(), value).apply();
    }

    public String readString(Integer key) {
        switch (key) {
            case PREF_SAVED_DATA:
                return preferences.getString(key.toString(), "");
        }
        return preferences.getString(key.toString(), "");
    }

    public void setLogin(boolean isLogin) {
        preferences.edit().putBoolean("isLogin", isLogin).apply();
    }

    public boolean isLogin() {
        return preferences.getBoolean("isLogin", false);
    }

    public void clearLocalData() {
        localData = new LocalData();
        saveLocalData();
    }
}
