package com.daria.androidcamp.listview;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

/**
 * Created by demouser on 8/2/16.
 */
public class ViewFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    TextView country;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_view, null);
        country = (TextView)v.findViewById(R.id.textView);
        ImageView image = (ImageView)v.findViewById(R.id.imageView);
        image.setImageResource(R.drawable.country);
        return v;
    }

    public void updateText(String upd) {
        country.setText(upd);
    }

}
