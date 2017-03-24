package com.example.abhishek.newsfeed;

/**
 * Created by abhishek on 26/1/17.
 */

/**
 * An {@link Feed} object contains information related to the single feed.
 */
public class Feed {

    /** News Title */
    private String mFeedTitle;

    private String mUrl;

    private String mWebTitle;

    public String getmUrl() {
        return mUrl;
    }

    /**
     * Construct a new {@link Feed} object.
     *
     * @param feedTitle is the headline
     */
    public Feed(String feedTitle, String url, String webTitle) {
        mFeedTitle = feedTitle;
        mUrl = url;
        mWebTitle = webTitle;
    }

    /**
     * Returns the headline of the news
     */
    public String getmFeedTitle() {
        return mFeedTitle;
    }

    public String getmWebTitle() {
        return mWebTitle;
    }
}
