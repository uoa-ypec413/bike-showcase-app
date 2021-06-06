package com.example.bikeshowcase;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Override
    public void populateItemsList(String message) {
        this.items =  getActivityItems(message);
    }

    @Override
    public void setTitle(String message) {
        this.listToolBar.setTitle(message);
    }

    @Override
    public List<Item> getActivityItems(String categoryQuery) {
        List<Item> items = DataProvider.getItems();
        List<Item> categoryItems = new ArrayList<>();

        for (Item item: items) {

            if(item.getCategory().equals(categoryQuery)){
                categoryItems.add(item);
            }
        }
        return categoryItems;
    }
}