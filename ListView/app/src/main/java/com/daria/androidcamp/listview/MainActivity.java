package com.daria.androidcamp.listview;

import android.app.Activity;
import android.content.Intent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.graphics.Color;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class MainActivity extends FragmentActivity implements CallBack {

    public static String COUNTRY = "country";
    public static String COLOR = "color";
    public static int color = Color.RED;
    public static String[] listC = {"Avon",
            "Bedfordshire",
            "Berkshire",
            "Buckinghamshire",
            "Cambridgeshire",
            "Cheshire",
            "Cleveland",
            "Cornwall",
            "Cumbria",
            "Derbyshire",
            "Devon",
            "Dorset",
            "Durham",
            "East Sussex",
            "Essex",
            "Gloucestershire",
            "Hampshire",
            "Herefordshire",
            "Hertfordshire",
            "Isle of Wight",
            "Kent",
            "Lancashire",
            "Leicestershire",
            "Lincolnshire",
            "London",
            "Merseyside",
            "Middlesex",
            "Norfolk",
            "Northamptonshire",
            "Northumberland",
            "North Humberside",
            "North Yorkshire",
            "Nottinghamshire",
            "Oxfordshire",
            "Rutland",
            "Shropshire",
            "Somerset",
            "South Humberside",
            "South Yorkshire",
            "Staffordshire",
            "Suffolk",
            "Surrey",
            "Tyne and Wear",
            "Warwickshire",
            "West Midlands",
            "West Sussex",
            "West Yorkshire",
            "Wiltshire",
            "Worcestershire"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        if (findViewById(R.id.detail_container) != null) {
//            Fragment ViewFragment = new ViewFragment();
//            getSupportFragmentManager().beginTransaction().replace(R.id.detail_container, ViewFragment);
//        }

    }

    @Override
    public void onItemClick(String itemName) {
        Fragment view = getSupportFragmentManager().findFragmentById(R.id.fragment2);
        ((ViewFragment)view).updateText(itemName);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = this.getMenuInflater();
//        inflater.inflate(R.menu.main_menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.red:
//                color = Color.RED;
//                break;
//            case R.id.blue:
//                color = Color.BLUE;
//                break;
//            case R.id.green:
//                color = Color.GREEN;
//                break;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//
////        ((MyAdapter)myAdapter).setColor(color);
////        list.invalidateViews();
//
//        return true;
//    }

}
