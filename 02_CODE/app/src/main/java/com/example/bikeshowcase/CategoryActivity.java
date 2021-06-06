package com.example.bikeshowcase;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void populateItemsList(String message) {
        this.mItems = getActivityItems(message);
    }

    @Override
    public void setTitle(String message) {
        this.mListToolBar.setTitle(message);
    }

    // This method returns a list of items whose category equals the categoryQuery argument
    @Override
    public List<Item> getActivityItems(String categoryName) {
        List<Item> items = DataProvider.getItems();
        List<Item> categoryItems = new ArrayList<>();

        for (Item item : items) {

            if (item.getCategory().equals(categoryName)) {
                categoryItems.add(item);
            }
        }
        return categoryItems;
    }
}