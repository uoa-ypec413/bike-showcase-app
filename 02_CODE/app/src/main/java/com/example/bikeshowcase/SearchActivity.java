package com.example.bikeshowcase;

import android.os.Bundle;
import android.view.View;

public class SearchActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        titleTextView.setVisibility(View.VISIBLE);
    }

    @Override
    public void populateItemsList(String message) {
        this.items = DataProvider.getSearchItems(message);
    }

    @Override
    public void setTitle(String message) {
        this.listToolBar.setTitle("Search");
        this.titleTextView.setText("Search results for " + "\"" + message + "\"");
    }
}