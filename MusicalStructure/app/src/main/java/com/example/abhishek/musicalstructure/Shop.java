package com.example.abhishek.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Shop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        // Find the button that shows the music library
        Button musicLibrary = (Button) findViewById(R.id.button_music_library);

        // Set onClickListener on that button
        musicLibrary.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicLibraryActivity}
                Intent libraryIntent = new Intent(Shop.this, MusicLibrary.class);

                // Starts the new activity
                startActivity(libraryIntent);
            }
        });
    }
}
