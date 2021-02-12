package com.example.instagram;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // initializes parse sdk as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder( this)
                .applicationId("3k25I8s0D79sdygHDOKzkDJLOfeNIYHsXh8yLXBP")
                .clientKey("xVkUyoxJkEw4oy6WVJmeUU8tOTL4BrrNwSXQ1xm5")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
