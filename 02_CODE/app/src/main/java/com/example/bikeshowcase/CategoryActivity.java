package com.example.bikeshowcase;

import android.os.Bundle;

public class CategoryActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Override
    public void populateItemsList(String message) {
        this.items =  DataProvider.getCategoryItems(message);
    }

    @Override
    public void setTitle(String message) {
        this.listToolBar.setTitle(message);
    }
}