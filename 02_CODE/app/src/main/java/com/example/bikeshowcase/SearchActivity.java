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
        List<Item> items = DataProvider.getItems();
        List<Item> searchItems = new ArrayList<>();

        for (Item item: items) {

            if ((item.getCategory().toLowerCase()).contains(searchQuery.toLowerCase())) {
                searchItems.add(item);
            } else if ((item.getItemTitle().toLowerCase()).contains(searchQuery.toLowerCase())) {
                searchItems.add(item);
            } else if ((item.getDescription().toLowerCase()).contains(searchQuery.toLowerCase())) {
                searchItems.add(item);
            } else if ((item.getColour().toLowerCase()).contains(searchQuery.toLowerCase()))
                searchItems.add(item);
        }
        return searchItems;
    }
}