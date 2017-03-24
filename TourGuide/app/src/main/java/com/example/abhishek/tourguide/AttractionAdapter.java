package com.example.abhishek.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by abhishek on 21/1/17.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    private int mColorResourceId;

    /**
     * Create a new {@link AttractionAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param attractions is the list of {@link Attraction}s to be displayed.
     */
    public AttractionAdapter(Context context, ArrayList<Attraction> attractions, int colorResourceId) {
        super(context, 0, attractions);
        mColorResourceId = colorResourceId;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_text_view.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the Attraction name from the currentAttraction object and set this text on
        // the Name TextView.
        nameTextView.setText(currentAttraction.getmName());

        // Find the TextView in the list_item.xml layout with the ID location_text_view.
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        // Get the location of the attraction from the currentAttraction object and set this text on
        // the location TextView.
        locationTextView.setText(currentAttraction.getmLocation());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Display the provided image based on the resource ID
        imageView.setImageResource(currentAttraction.getmImageResourceId());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
