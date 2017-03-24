package com.example.abhishek.booklisting;

/**
 * Created by abhishek on 23/1/17.
 */

/**
 * An {@link Book} object contains information related to a single book.
 */
public class Book {

    /** Title of the book */
    private String mBookTitle;

    /** Author of the book */
    private String mPublisher;

    /**
     * Construct a new {@link Book} object.
     *
     * @param bookTitle is the title of the book
     * @param publisher is the publisher of the book
     */
    public Book(String bookTitle, String publisher) {
        mBookTitle = bookTitle;
        mPublisher = publisher;
    }

    /**
     * Returns the title of the book
     */
    public String getmBookTitle() {
        return mBookTitle;
    }

    /**
     * Returns the author of the book
     */
    public String getmPublisher() {
        return mPublisher;
    }
}
