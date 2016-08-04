package com.daria.androidcamp.quotes;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;

import com.daria.androidcamp.quotes.Quote;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by demouser on 8/2/16.
 */
public class JSONDownload extends AsyncTask<String, Void, List<Quote>> {



    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.d("AS", "Start");
    }

    @Override
    protected List<Quote> doInBackground(String... urls) {
        URL url;
        HttpURLConnection urlConnection = null;
        String input = "";
        List<Quote> res = new ArrayList<>();
        try {
            url = new URL(urls[0]);
            urlConnection = (HttpURLConnection) url.openConnection();
            InputStream in = urlConnection.getInputStream();
            InputStreamReader isw = new InputStreamReader(in);
            Log.d("AS", "Start download JSON");
            int data = isw.read();
            while (data != -1) {
                char current = (char) data;
                input += current;
                data = isw.read();
            }
            Log.d("AS", "End download JSON");
            urlConnection.disconnect();
            in.close();
            Log.d("AS", "Start parse JSON");
            JSONParser parser = new JSONParser(input);
            res = parser.parse();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }
        System.err.println("fdf");
        return res;
    }

    @Override
    protected void onPostExecute(List<Quote> quotes) {
        super.onPostExecute(quotes);
    }
}
