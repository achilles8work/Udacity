package com.example.abhishek.newsfeed;

/**
 * Created by abhishek on 26/1/17.
 */

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link FeedAdapter} knows how to create a list item layout for each feed
 * in the data source (a list of {@link Feed} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user
 */

public class FeedAdapter extends ArrayAdapter<Feed> {

    /**
     * Construct a new {@link FeedAdapter}
     *
     * @param context of the app
     * @param feeds is the list of the feeds, which is the data source of the adapter
     */
    public FeedAdapter(Context context, List<Feed> feeds) {
        super(context, 0 ,feeds);
    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of feeds.
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.feed_list_item, parent, false);
        }

        // Find the feed at the given position in the list of feeds
        Feed currentFeed = getItem(position);

        // Find the TextView with view ID feed_title
        TextView feedTitleView = (TextView) listItemView.findViewById(R.id.feed_title);

        // Display the title of the current feed in that TextView
        feedTitleView.setText(currentFeed.getmFeedTitle());

        TextView feedUrlView = (TextView) listItemView.findViewById(R.id.feed_url);

        feedUrlView.setText(currentFeed.getmUrl());

        TextView webTitleView = (TextView) listItemView.findViewById(R.id.web_title);

        webTitleView.setText(currentFeed.getmWebTitle());

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO implement Intent
                Uri uri = Uri.parse();
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }


}
