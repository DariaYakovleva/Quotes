package com.daria.androidcamp.quotes;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by demouser on 8/3/16.
 */
public class ImageDownload extends AsyncTask<String, Void, Bitmap> {

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.d("AS", "Start download image");
    }

    @Override
    protected Bitmap doInBackground(String... urls) {
        URL urlImage = null;
        Bitmap res = null;
        try {
            urlImage = new URL(urls[0]);
            HttpURLConnection urlConnection = (HttpURLConnection) urlImage.openConnection();
            urlConnection.connect();
            InputStream in = urlConnection.getInputStream();
            BufferedInputStream image = new BufferedInputStream(in);
            Bitmap bitImage = BitmapFactory.decodeStream(image);
            res = bitImage;
            image.close();
            in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.d("AS", "End download image");
        return res;
    }
}
