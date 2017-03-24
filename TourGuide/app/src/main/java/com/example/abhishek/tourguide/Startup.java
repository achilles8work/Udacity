package com.example.abhishek.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Startup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(getString(R.string.startup_0_title),getString(R.string.startup_0_location), R.drawable.airbnb_logo));
        attractions.add(new Attraction(getString(R.string.startup_1_title),getString(R.string.startup_1_location), R.drawable.uber_logo));
        attractions.add(new Attraction(getString(R.string.startup_2_title),getString(R.string.startup_2_location), R.drawable.quora_logo));
        attractions.add(new Attraction(getString(R.string.startup_3_title),getString(R.string.startup_3_location), R.drawable.thinkgeek_logo));

        AttractionAdapter adapter = new AttractionAdapter(this,attractions,R.color.category_startup);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
