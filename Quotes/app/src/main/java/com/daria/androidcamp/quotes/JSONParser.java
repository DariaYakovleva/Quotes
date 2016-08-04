package com.daria.androidcamp.quotes;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by demouser on 8/2/16.
 */
public class JSONParser {


    public static String AUTHOR = "author";
    public static String QUOTE = "quote";
    public static String QUOTES = "quotes";
    public static String DATE = "date";
    public static String PIC = "pic";
    String data;
    public JSONParser() {}
    public JSONParser(String data) {
        this.data = data;
    }

    public List<Quote> parse() {
        List<Quote> res = new ArrayList<>();
        try {
            JSONObject obj = new JSONObject(data);
            JSONArray jsonArr = (JSONArray) obj.get(QUOTES);
            int cnt = jsonArr.length();
            for (int i = 0; i < cnt; i++) {
                JSONObject cur = jsonArr.getJSONObject(i);
                Quote quote = new Quote();
                quote.author = cur.getString(AUTHOR);
                quote.quote = cur.getString(QUOTE);
                quote.date = cur.getString(DATE);
                quote.link = cur.getString(PIC);
                res.add(quote);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return res;
    }
}
