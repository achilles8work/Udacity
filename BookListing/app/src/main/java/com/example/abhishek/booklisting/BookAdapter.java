package com.example.abhishek.booklisting;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by abhishek on 23/1/17.
 */

/**
 * An {@link BookAdapter} knows how to create a list item layout for each book
 * in the dat source (a list of {@link Book} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user
 */

public class BookAdapter extends ArrayAdapter<Book> {

    /**
     * Construct a new {@link BookAdapter}
     *
     * @param context of the app
     * @param books is the list of the books, which is the data source of the adapter
     */
    public BookAdapter(Context context, List<Book> books) {
        super(context, 0 ,books);
    }

    /**
     * Returns a list item view that displays information about the book at the given position
     * in the list of books.
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.book_list_item, parent, false);
        }

        // Find the book at the given position in the list of books
        Book currentBook = getItem(position);

        // Find the TextView with view ID book_title
        TextView bookTitleView = (TextView) listItemView.findViewById(R.id.book_title);

        // Display the title of the current book in that TextView
        bookTitleView.setText(currentBook.getmBookTitle());

        // Find the TextView with view ID author
        TextView publisherView = (TextView) listItemView.findViewById(R.id.publisher);

        // Display the author of the current book in that TextView
        publisherView.setText(currentBook.getmPublisher());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
