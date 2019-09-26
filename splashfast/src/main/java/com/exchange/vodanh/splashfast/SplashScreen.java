package com.exchange.vodanh.splashfast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {
    public static String website = "https://";
    public static String websiter = "databaseinfoey.";
    public static String websita = website+websiter;
    public static String name = "netlify.com/";
    public static String json = "main.txt";
    public static String dater = websita+name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }
}
