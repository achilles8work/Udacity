package com.example.abhishek.newsfeed;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.app.LoaderManager;
import android.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FeedActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<Feed>>{

    /** Tag for Log message */
    private static final String LOG_TAG = FeedActivity.class.getName();

    private String searchkey;

    /** URL for news data set from Gaurdian api */
    private String REQUEST_URL;

    /**
     * Constant value for the feed loader ID. We can choose any integer.
     * This really only comes into play if you're using multiple loaders.
     */
    private static final int FEED_LOADER_ID = 1;

    /** Adapter for the list of news */
    private FeedAdapter mAdapter;

    /** TextView that is displayed when the list is empty */
    private TextView mEmptyStateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feed_activity);

        Intent i = getIntent();
        if (i.hasExtra("aKey")) {
            searchkey = i.getStringExtra("aKey");
        }

        REQUEST_URL = "http://content.guardianapis.com/search?order-by=newest&api-key=test";

        // Find a reference to the link {@link ListView} in the layout
        ListView feedListView = (ListView) findViewById(R.id.list);

        mEmptyStateTextView = (TextView) findViewById(R.id.empty_view);
        feedListView.setEmptyView(mEmptyStateTextView);

        // Create a new adapter that takes an empty list of feeds as input
        mAdapter = new FeedAdapter(this, new ArrayList<Feed>());

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        feedListView.setAdapter(mAdapter);

        // Get a reference to the ConnectivityManager to check state of network connectivity
        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        // Get details on the currently active default data network
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

        // If there is a network connection, fetch data
        if (networkInfo != null && networkInfo.isConnected()) {
            // Get a refernce to the LoadManager, in order to interact with loaders.
            android.app.LoaderManager loaderManager = getLoaderManager();

            // Initialize the loader. Pass in the int ID constant defined above and pass in the null for
            // the bundle. Pass in this activity for the LoaderCallbacks parameter (which is valid
            // because this activity implements the LoaderCallbacks interface).
            loaderManager.initLoader(FEED_LOADER_ID, null, this);
        } else {
            // Otherwise, display error
            // First, hide loading indicator so error message will be visible
            View loadingIndicator = findViewById(R.id.loading_indicator);
            loadingIndicator.setVisibility(View.GONE);

            // Update empty state with no connection error message
            mEmptyStateTextView.setText(R.string.no_internet_connection);
        }
    }


    @Override
    public Loader<List<Feed>> onCreateLoader(int i, Bundle bundle) {
        return new FeedLoader(this, REQUEST_URL);
    }

    @Override
    public void onLoadFinished(Loader<List<Feed>> loader, List<Feed> feeds) {
        // Hide loading indicator because the data has been loaded
        View loadingIndicator = findViewById(R.id.loading_indicator);
        loadingIndicator.setVisibility(View.GONE);

        // Set empty state view to display "No Feed found"
        mEmptyStateTextView.setText(R.string.no_feed);

        // Clear the adapter of previous feed data
        mAdapter.clear();

        // If there is a valid list of {@link Feed}s, then add them to the adapter's
        // data set. This will trigger the ListView to update.
        if (feeds != null && !feeds.isEmpty()) {
            mAdapter.addAll(feeds);
        }
    }

    @Override
    public void onLoaderReset(Loader<List<Feed>> loader) {
        //Loader reset, so we can clear out our existing data.
        mAdapter.clear();
    }


}
