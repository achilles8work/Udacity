package com.example.abhishek.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicLibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

        // Find the button that shows the listen now
        Button listenNow = (Button) findViewById(R.id.button_listen_now);

        // Set onClickListener on that button
        listenNow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ListenNowActivity}
                Intent listenIntent = new Intent(MusicLibrary.this, ListenNow.class);

                // Starts the new activity
                startActivity(listenIntent);
            }
        });
    }
}
