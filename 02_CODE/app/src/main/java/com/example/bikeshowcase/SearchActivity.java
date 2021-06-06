package com.example.bikeshowcase;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SearchActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        titleTextView.setVisibility(View.VISIBLE);
    }

    @Override
    public void populateItemsList(String message) {
        this.items = getActivityItems(message);
    }

    @Override
    public void setTitle(String message) {

        this.listToolBar.setTitle("Search");

        if(this.items.isEmpty()) {
            this.titleTextView.setText("Sorry, no matches found!");
            this.spinner.setVisibility(View.GONE);
        } else {
            this.titleTextView.setText("Search results for " + "\"" + message + "\"");
        }
    }

    @Override
    public List<Item> getActivityItems(String searchQuery) {
        String[] searchQueryArray = searchQuery.split(" ");

        List<Item> items = DataProvider.getItems();
        List<Item> searchItems = new ArrayList<>();

        boolean containsQuery = true;

        for (Item item: items) {
            for(String query: searchQueryArray) {
                containsQuery = containsQuery && itemContainsQuery(item, query);
            }
            if(containsQuery){
                searchItems.add(item);
            } else {
                containsQuery = true;
            }
        }
        return searchItems;
    }

    private boolean itemContainsQuery(Item item, String query) {
        if ((item.getCategory().toLowerCase()).contains(query.toLowerCase())) {
            return true;
        } else if ((item.getItemTitle().toLowerCase()).contains(query.toLowerCase())) {
            return true;
        } else if ((item.getDescription().toLowerCase()).contains(query.toLowerCase())) {
            return true;
        } else if ((item.getColour().toLowerCase()).contains(query.toLowerCase())) {
            return true;
        } else
            return false;
    }
}