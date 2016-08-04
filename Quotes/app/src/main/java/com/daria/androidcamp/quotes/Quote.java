package com.daria.androidcamp.quotes;

import android.graphics.Bitmap;
import android.view.View;

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

    public String toString() {
        return quote + "\n" + author + "\n" + date + "\n" + link;
    }

}
