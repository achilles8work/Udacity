package com.example.abhishek.habbittracker;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.example.abhishek.habbittracker.data.HabbitContract;
import com.example.abhishek.habbittracker.data.HabbitDbHelper;

public class EditorActivity extends AppCompatActivity {

    /** EditText field to enter the habbit */
    private EditText mHabbitEditText;
    private EditText mDurationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);

        // Find relevant views that we will need to read user input
        mHabbitEditText = (EditText) findViewById(R.id.edit_habbit);
        mDurationEditText = (EditText) findViewById(R.id.edit_duration);
    }

    /**
     * Get user input from editor and save new habbit into database.
     */

    private void inserHabbit() {
        // Read from input fields
        // Use trim to eliminate leading or trailling white space
        String habbitString = mHabbitEditText.getText().toString().trim();
        String duartion = mDurationEditText.getText().toString().trim();

        // Create database helper
        HabbitDbHelper mDbHelper = new HabbitDbHelper(this);

        // Gets the database in write mode
        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        // Create a ContentValues object where column names are the keys,
        // and habbit anames from the editor are the values.
        ContentValues values = new ContentValues();
        values.put(HabbitContract.HabbitEntry.COLUMN_HABBIT_NAME, habbitString);
        values.put(HabbitContract.HabbitEntry.COLUMN_HABBIT_DURATION, duartion);

        // Insert a new row for habbit in the database, returning the ID of that row.
        long newRowId = db.insert(HabbitContract.HabbitEntry.TABLE_NAME, null, values);

        // Show a toast message depending on whether or not the insertion was successful
        if (newRowId == -1) {
            // If the row ID is -1, then there was an error with insertion.
            Toast.makeText(this, "Error with saving pet", Toast.LENGTH_SHORT).show();
        } else {
            // Otherwise, the insertion was successful and we can display a toast with the row ID.
            Toast.makeText(this, "Pet saved with row id: " + newRowId, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu option from the res/menu/menu_editor.xml
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.menu_editor, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // User clicked on a menu option in the app bar overflow menu
        switch (item.getItemId()) {
            // Respond to a click on the "save" menu option
            case R.id.action_save:
                // Save habbit to database
                inserHabbit();
                // Exit activity
                finish();
                return true;

            // Respond to a click on the "Delete" menu option
            case R.id.action_delete:
                // Do nothing for now
                return true;

            // Respond to a click on the "Up" arrow button in the app bar
            case android.R.id.home:
                // Navigate back to parent activity (CatalogActivity)
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
