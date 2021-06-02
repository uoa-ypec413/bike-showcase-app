package com.example.bikeshowcase;

import android.os.Bundle;

public class SearchActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void populateItemsList(String message) {
        this.items = DataProvider.getSearchItems(message);
    }

    @Override
    public void setTitle(String message) {
        this.titleTextView.setText("Search results for " + "\"" + message +"\"");
    }
}