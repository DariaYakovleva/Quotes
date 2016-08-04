package com.daria.androidcamp.listview;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by demouser on 8/1/16.
 */
public class MyAdapter extends BaseAdapter {

    List<String> data;
    int color = Color.RED;

    public MyAdapter() {
        data = new ArrayList<>();
    }

    public MyAdapter(List<String> data) {
        this.data = data;
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
        TextView text = new TextView(viewGroup.getContext());
        text.setText(data.get(i));
        text.setTextSize(20);
        text.setTextColor(color);
        return text;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
