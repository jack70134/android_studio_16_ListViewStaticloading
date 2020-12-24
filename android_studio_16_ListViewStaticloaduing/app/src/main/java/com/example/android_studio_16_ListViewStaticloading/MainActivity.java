package com.example.android_studio_16_ListViewStaticloading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String [] cities = getResources().getStringArray(R.array.cities);
        ListView listView = (ListView)findViewById(R.id.listView1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView outPut = (TextView)findViewById(R.id.change);
                outPut.setText("你選擇了: " + cities[position]);

            }
        });
    }
}