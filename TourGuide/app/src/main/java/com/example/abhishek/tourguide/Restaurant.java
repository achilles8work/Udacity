package com.example.abhishek.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(getString(R.string.rest_0_title),getString(R.string.rest_0_location), R.drawable.anjappar));
        attractions.add(new Attraction(getString(R.string.rest_1_title),getString(R.string.rest_1_location), R.drawable.margaritaville));
        attractions.add(new Attraction(getString(R.string.rest_2_title),getString(R.string.rest_2_location), R.drawable.aw));
        attractions.add(new Attraction(getString(R.string.rest_3_title),getString(R.string.rest_3_location), R.drawable.red));

        AttractionAdapter adapter = new AttractionAdapter(this,attractions,R.color.category_restaurant);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
