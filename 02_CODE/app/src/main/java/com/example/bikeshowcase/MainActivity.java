package com.example.bikeshowcase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Item> itemsList = DataProvider.getItems();
        ItemAdapter itemsAdapter = new ItemAdapter(this,
                R.layout.item_list_view_item, itemsList);
        ListView listView = (ListView) findViewById(R.id.ListView);
        listView.setAdapter(itemsAdapter);
    }
}