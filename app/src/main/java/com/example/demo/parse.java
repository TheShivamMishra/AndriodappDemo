package com.example.demo;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class parse extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("f70a8799e406844405d818d547f966aaa99e3a90")
                .clientKey("af0c0eda10145d34fa915dc74d7ea27af31647f8")
                .server("http://13.127.211.2:80/parse/")
                .build()
        );

        ParseObject object = new ParseObject("class");

        object.put("username","shivam");
        object.put("password","shiv");

        object.saveInBackground();
    }
}
