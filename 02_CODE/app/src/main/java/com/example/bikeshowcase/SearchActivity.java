package com.example.bikeshowcase;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // No sorting spinner is shown if there are no search results
        if (this.items.isEmpty()) {
            this.spinner.setVisibility(View.GONE);
        }
    }

    @Override
    public void populateItemsList(String message) {
        this.items = getActivityItems(message);
    }

    // This method sets the title for the Toolbar and TextView
    @Override
    public void setTitle(String message) {
        this.listToolBar.setTitle("Search");

        titleTextView.setVisibility(View.VISIBLE);
        if (this.items.isEmpty()) {  // If there are no search results
            this.titleTextView.setText("Sorry, no matches found!");
        } else {
            this.titleTextView.setText("Search results for " + "\"" + message + "\"");
        }
    }

    // This method returns a list of items where each item has at least one field containing the search query
    @Override
    public List<Item> getActivityItems(String searchQuery) {
        String[] searchQueryArray = searchQuery.split(" "); // Split the search query into individual words
        List<Item> items = DataProvider.getItems();
        List<Item> searchItems = new ArrayList<>();

        boolean containsQuery = true; // Flag indicating that the current item contains the search query

        // For each item, check if it contains each word in the search query,
        // add to searchItems if true.
        for (Item item : items) {
            for (String query : searchQueryArray) {
                containsQuery = containsQuery && itemContainsQuery(item, query);
            }
            // Will be true only if each word in the search query is found in the item
            if (containsQuery) {
                searchItems.add(item);
            } else {
                containsQuery = true; // Reset flag
            }
        }
        return searchItems;
    }

    // This method takes 2 arguments: an item and a query. If at least one of the fields
    // of the item (excluding price) contains the query, return true. Otherwise return false.
    // The fields and query are converted to lowercase in order to implement a case insensitive search.
    private boolean itemContainsQuery(Item item, String query) {
        query = query.toLowerCase();
        if ((item.getCategory().toLowerCase()).contains(query)) {
            return true;
        } else if ((item.getItemTitle().toLowerCase()).contains(query)) {
            return true;
        } else if ((item.getDescription().toLowerCase()).contains(query)) {
            return true;
        } else return (item.getColour().toLowerCase()).contains(query);
    }
}