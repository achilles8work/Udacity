package com.example.abhishek.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListenNow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen_now);

        // Find the button that shows the shop
        Button shopButton = (Button) findViewById(R.id.button_shop);

        // Set onClickListener on that button
        shopButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ShopActivity}
                Intent shopIntent = new Intent(ListenNow.this, Shop.class);

                // Starts the new activity
                startActivity(shopIntent);
            }
        });
    }


}
