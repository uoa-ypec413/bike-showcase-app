package com.example.bikeshowcase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Create a category header for the ListView
        TextView textView = new TextView(this);
        textView.setText(message);
        textView.setGravity(Gravity.CENTER);
        textView.setTextAppearance(R.style.TextAppearance_MaterialComponents_Headline5);

        List<Item> itemsList = DataProvider.getCategoryItems(message);
        ItemAdapter itemsAdapter = new ItemAdapter(this,
                R.layout.item_list_view_item, itemsList);
        ListView listView = findViewById(R.id.list_view);
        listView.addHeaderView(textView);
        listView.setAdapter(itemsAdapter);
    }
}