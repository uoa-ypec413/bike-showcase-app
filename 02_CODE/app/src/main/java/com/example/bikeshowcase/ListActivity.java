package com.example.bikeshowcase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public abstract class ListActivity extends AppCompatActivity {

    protected List<Item> itemsList;
    protected ItemAdapter itemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        this.populateItemsList(message);

        try{
            this.itemsAdapter = new ItemAdapter(this, R.layout.item_list_view_item, this.itemsList);
            ListView listView = findViewById(R.id.ListView);
            listView.setAdapter(this.itemsAdapter);
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public abstract void populateItemsList(String message);
}