package com.daria.androidcamp.intent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Context.startActivity();
//        Context.startService(); //bindService()
//        Activity.startActivityForRescult();
//        contex.sendBroadcast();
//        getIntent();
//        Intent myIntent = new Intent();
//        myIntent.setAction("android.intent.action.CALL");
//        startActivity(myIntent);
        //call; google.com; map;image capture;contacts
        Button call = (Button)findViewById(R.id.call);
        Button google = (Button)findViewById(R.id.google);
        Button map = (Button)findViewById(R.id.map);
        Button image = (Button)findViewById(R.id.image);
        Button contacts = (Button)findViewById(R.id.contacts);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_CALL);
                myIntent.setData(Uri.parse("tel:0542556320"));
                startActivity(myIntent);
            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW);
                myIntent.setData(Uri.parse("http://www.vk.com"));
                startActivity(myIntent);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW);
                mapIntent.setData(Uri.parse("geo:0,0?q=someplace"));
                startActivity(mapIntent);
            }
        });
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(myIntent);
            }
        });
        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW);
                myIntent.setData(Uri.parse("content://contacts/people/"));
                startActivity(myIntent);

            }
        });
    }

}
