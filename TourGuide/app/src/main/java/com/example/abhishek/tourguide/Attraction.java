package com.example.abhishek.tourguide;

/**
 * Created by abhishek on 21/1/17.
 */

public class Attraction {

    private String mName;

    private String mLocation;

    private int mImageResourceId;

    public Attraction(String name, String location, int imageResourceId) {
        mName = name;
        mLocation = location;
        mImageResourceId = imageResourceId;
    }

    public String getmName() {
        return mName;
    }

    public String getmLocation() {
        return mLocation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
