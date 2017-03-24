package com.example.abhishek.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the views that shows the Startup category
        TextView startup = (TextView) findViewById(R.id.startup);

        //Set onClickListener on that view
        startup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link StartupActivity}
                Intent startupIntent = new Intent(MainActivity.this, Startup.class);

                startActivity(startupIntent);
            }
        });

        //Find the views that shows the Restaurant category
        TextView restaurant = (TextView) findViewById(R.id.restaurant);

        //Set onClickListener on that view
        restaurant.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link RestaurantActivity}
                Intent restaurantIntent = new Intent(MainActivity.this, Restaurant.class);

                startActivity(restaurantIntent);
            }
        });

        //Find the views that shows the Parks category
        TextView park = (TextView) findViewById(R.id.park);

        //Set onClickListener on that view
        park.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link ParkActivity}
                Intent parkIntent = new Intent(MainActivity.this, Park.class);

                startActivity(parkIntent);
            }
        });

        //Find the views that shows the Malls category
        TextView mall = (TextView) findViewById(R.id.mall);

        //Set onClickListener on that view
        mall.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link MallActivity}
                Intent mallIntent = new Intent(MainActivity.this, Mall.class);

                startActivity(mallIntent);
            }
        });
    }
}
