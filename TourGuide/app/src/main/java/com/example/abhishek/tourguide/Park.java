package com.example.abhishek.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Park extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(getString(R.string.park_0_title),getString(R.string.park_0_location), R.drawable.acadia));
        attractions.add(new Attraction(getString(R.string.park_1_title),getString(R.string.park_1_location), R.drawable.samoa));
        attractions.add(new Attraction(getString(R.string.park_2_title),getString(R.string.park_2_location), R.drawable.arches));
        attractions.add(new Attraction(getString(R.string.park_3_title),getString(R.string.park_3_location), R.drawable.badland));

        AttractionAdapter adapter = new AttractionAdapter(this,attractions,R.color.category_park);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
