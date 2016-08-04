package com.daria.androidcamp.quotes;

/**
 * Created by demouser on 8/2/16.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by demouser on 8/1/16.
 */
public class MyAdapter extends BaseAdapter {

    List<Quote> data;
    LayoutInflater inflater = null;
    Activity activity = null;

    public MyAdapter() {
        data = new ArrayList<>();
    }

    public MyAdapter(List<Quote> data, Activity activity) {
        this.data = data;
        this.activity = activity;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return data.get(i).hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View curView;
        ViewHolder holder;
        if (view == null) {
            curView = inflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.quoteView = (TextView)curView.findViewById(R.id.quote);
            holder.authorView = (TextView)curView.findViewById(R.id.author);
            holder.dateView = (TextView)curView.findViewById(R.id.date);
            holder.imageView = (ImageView)curView.findViewById(R.id.image);
            curView.setTag(holder);
        } else {
            curView = view;
            holder = (ViewHolder)curView.getTag();
        }
        holder.quoteView.setText(data.get(i).quote);
        holder.authorView.setText(data.get(i).author);
        holder.dateView.setText(data.get(i).date);

        Picasso.with(activity).load(data.get(i).link).placeholder(R.drawable.notfound).error(R.drawable.notfound).into(holder.imageView);
        return curView;
    }

}
