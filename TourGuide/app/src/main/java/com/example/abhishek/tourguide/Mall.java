package com.example.abhishek.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Mall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(getString(R.string.mall_0_title),getString(R.string.mall_0_location), R.drawable.mall_of_america));
        attractions.add(new Attraction(getString(R.string.mall_1_title),getString(R.string.mall_1_location), R.drawable.king_of_prussia));
        attractions.add(new Attraction(getString(R.string.mall_2_title),getString(R.string.mall_2_location), R.drawable.south_coast_plaza));
        attractions.add(new Attraction(getString(R.string.mall_3_title),getString(R.string.mall_3_location), R.drawable.aventura_mall));

        AttractionAdapter adapter = new AttractionAdapter(this,attractions,R.color.category_mall);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
