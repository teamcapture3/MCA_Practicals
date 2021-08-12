package com.ninad.loginalert;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

@SuppressWarnings({"UnusedReturnValue", "RedundantIfStatement"})
public class SharedPrefManager {
    @SuppressLint("StaticFieldLeak")
    private static SharedPrefManager mInstance;
    @SuppressLint("StaticFieldLeak")
    private static Context mCtx;
    private static final String SHARED_PREF_NAME = "mysharedpref";
    private static final String KEY_PASSWORD = "password";
    private static final String KEY_USERNAME = "username";
    public SharedPrefManager(Context context){
        mCtx = context;
    }
    public static synchronized SharedPrefManager getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new
                    SharedPrefManager(context);
        }
        return mInstance;
    }
    public boolean userLogin(String username,String password){
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY_USERNAME,username);
        editor.putString(KEY_PASSWORD,password);
        editor.apply();
        return true;
    }
    public boolean isLoggedIn(){
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        if(sharedPreferences.getString(KEY_USERNAME,null) != null){
            return true;
        }
        return false;
    }
    public boolean logOut(){
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
        return true;
    }
    public String getUserName(){
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        return sharedPreferences.getString(KEY_USERNAME,null);
    }
}