package com.example.abhishek.habbittracker.data;

import android.provider.BaseColumns;

/**
 * Created by abhishek on 30/1/17.
 */

public class HabbitContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private HabbitContract() {}

    /**
     * Inner class that defines constant values for the habits database table.
     * Each entry in the table represents a habbit.
     */
    public static final class HabbitEntry implements BaseColumns {

        /** Name of database table for habbits */
        public final static String TABLE_NAME = "habbits";

        /**
         * Unique ID number for the habit (only for use in the database table).
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the habbit.
         *
         * Type: TEXT
         */
        public final static String COLUMN_HABBIT_NAME ="name";

        /**
         * Duration of the habbit.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_HABBIT_DURATION ="duration";

    }
}
