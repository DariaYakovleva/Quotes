package com.daria.androidcamp.listview;

import android.graphics.Bitmap;

/**
 * Created by demouser on 8/2/16.
 */
public class Quote {

    String quote;
    String author;
    String date;
    String link;
    Bitmap image;
    Quote() {}

    public Quote(String quote, String author, String date, String link) {
        this.quote = quote;
        this.author = author;
        this.date = date;
        this.link = link;
    }

}
