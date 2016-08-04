package com.daria.androidcamp.quotes;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class MainActivity extends Activity {

    public static String LINK = "https://firebasestorage.googleapis.com/v0/b/bootcamp-5be0c.appspot.com/o/" +
            "101Quotes.json?alt=media&token=b428d722-5cca-4400-a25a-c75502c79063";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JSONDownload downloader = new JSONDownload();
        try {
            List<Quote> res = downloader.execute(LINK).get();
//            for (int i = 0; i < res.size(); i++) {
//                Quote quote = res.get(i);
//                quote.image = new ImageDownload().execute(quote.link).get();
//                res.set(i, quote);
//            }
            ListAdapter myAdapter = new MyAdapter(res, this);
            ListView list = (ListView)findViewById(R.id.list);
            list.setAdapter(myAdapter);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

}
