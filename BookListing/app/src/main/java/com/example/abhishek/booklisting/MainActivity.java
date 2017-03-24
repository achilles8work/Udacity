package com.example.abhishek.booklisting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText searchText;
    private String searchKey;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchText = (EditText) findViewById(R.id.search_text_view);
        searchKey = searchText.getText().toString();
        Button searchButton = (Button) findViewById(R.id.search_button);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BookActivity.class);
                intent.putExtra("aKey", searchKey);
                startActivity(intent);
            }
        });
    }
}
