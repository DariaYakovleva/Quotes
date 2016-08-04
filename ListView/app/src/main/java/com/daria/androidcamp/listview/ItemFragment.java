package com.daria.androidcamp.listview;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

/**
 * Created by demouser on 8/2/16.
 */
public class ItemFragment extends Fragment {

    ListView list;
    ListAdapter myAdapter;
    CallBack mLister;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.list_fragment, container, false);

        List<String> lst = Arrays.asList(MainActivity.listC);
        myAdapter = new MyAdapter(lst);
        list = (ListView)v.findViewById(R.id.list);
        list.setAdapter(myAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView text = (TextView)view;
                mLister.onItemClick(text.getText().toString());
            }
        });
        return v;
    }

    @Override
    public void onAttach(Activity context) {
        super.onAttach(context);
        if (context instanceof CallBack) {
            mLister = (CallBack)context;
        } else {
            throw new IllegalStateException("Where is callback?");
        }
    }

}
