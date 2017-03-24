package com.example.abhishek.habbittracker.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by abhishek on 30/1/17.
 */

public class HabbitDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = HabbitDbHelper.class.getSimpleName();

    /** Name of the database file */
    private static final String DATABASE_NAME = "shelter.db";

    /**
     * Database version. If you change the database schema, you must increment the database version.
     */
    private static final int DATABASE_VERSION = 1;

    /**
     * Constructs a new instance of {@link HabbitDbHelper}.
     *
     * @param context of the app
     */
    public HabbitDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * This is called when the database is created for the first time.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create a String that contains the SQL statement to create the pets table
        String SQL_CREATE_HABBITS_TABLE =  "CREATE TABLE " + HabbitContract.HabbitEntry.TABLE_NAME + " ("
                + HabbitContract.HabbitEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + HabbitContract.HabbitEntry.COLUMN_HABBIT_NAME + " TEXT NOT NULL, " + HabbitContract.HabbitEntry.COLUMN_HABBIT_DURATION + "INTEGER);";

        // Execute the SQL statement
        db.execSQL(SQL_CREATE_HABBITS_TABLE);
    }

    /**
     * This is called when the database needs to be upgraded.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // The database is still at version 1, so there's nothing to do be done here.
    }
}
