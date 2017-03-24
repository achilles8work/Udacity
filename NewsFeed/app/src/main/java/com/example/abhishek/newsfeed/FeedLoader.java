package com.example.abhishek.newsfeed;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by abhishek on 26/1/17.
 */

public class FeedLoader extends AsyncTaskLoader<List<Feed>> {

    /** Tag for Log message */
    private static final String LOG_TAG = FeedLoader.class.getName();

    /** Query URL */
    private String mUrl;

    /**
     * Constructs a new {@link FeedLoader}.
     *
     * @param context of the activity
     * @param url to load data from
     */
    public FeedLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on background thread.
     */
    @Override
    public List<Feed> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of books
        List<Feed> feeds = QueryUtils.fetchFeedData(mUrl);
        return feeds;
    }
}
