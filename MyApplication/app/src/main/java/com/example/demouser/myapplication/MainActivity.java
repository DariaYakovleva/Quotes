package com.android_camp.daria.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int choise = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        Button click = (Button) findViewById(R.id.convert);
        final EditText edit = (EditText)findViewById(R.id.editText);
        final RadioGroup group = (RadioGroup)findViewById(R.id.group);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = group.getCheckedRadioButtonId();
                Double res;
                if (selectedId == R.id.cels) {
                     res = Double.parseDouble(edit.getText().toString()) * 1.8 + 32;
                } else {
                    res = (Double.parseDouble(edit.getText().toString()) - 32) / 1.8;
                }
                Toast.makeText(MainActivity.this, res.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
