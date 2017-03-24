package com.example.abhishek.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the views that shows the listen now category
        TextView listenNow = (TextView) findViewById(R.id.listen_now);

        // Set onClickListener on that view
        listenNow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ListenNowActivity}
                Intent listenNowIntent = new Intent(MainActivity.this, ListenNow.class);

                // Starts the new activity
                startActivity(listenNowIntent);
            }
        });

        // Find the views that shows the music library category
        TextView musicLibrary = (TextView) findViewById(R.id.music_library);

        // Set onClickListener on that view
        musicLibrary.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicLibraryActivity}
                Intent musicLibraryIntent = new Intent(MainActivity.this, MusicLibrary.class);

                // Starts the new activity
                startActivity(musicLibraryIntent);
            }
        });

        // Find the views that shows the shop category
        TextView shop = (TextView) findViewById(R.id.shop);

        // Set onClickListener on that view
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ShopActivity}
                Intent shopIntent = new Intent(MainActivity.this, Shop.class);

                // Starts the new activity
                startActivity(shopIntent);
            }
        });
    }
}
