package com.example.bikeshowcase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public abstract class ListActivity extends AppCompatActivity implements ListItemAdapter.OnItemClickListener {

    protected List<Item> items;
    protected RecyclerView recyclerView;
    protected ListItemAdapter listItemAdapter;
    protected Toolbar listToolBar;
    protected TextView titleTextView;
    protected Spinner spinner;
    protected ArrayAdapter<CharSequence> spinnerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        this.populateItemsList(message);
        this.listToolBar = findViewById(R.id.list_toolbar);
        this.titleTextView = findViewById(R.id.list_text_view);
        this.spinner = findViewById(R.id.spinner);

        setTitle(message);

        if(!this.items.isEmpty()){
            this.recyclerView = findViewById(R.id.list_recycler_view);
            this.listItemAdapter = new ListItemAdapter(this, this.items, this);
            recyclerView.setAdapter(listItemAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }

        this.spinnerAdapter = ArrayAdapter.createFromResource(this, R.array.sort_options_array, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                sortItemsByAlphabeticalOrder(true);
            }

            @Override
            public void onItemSelected(AdapterView adapter, View v, int i, long lng) {
                String selectedItem = adapter.getItemAtPosition(i).toString();
                switch(selectedItem){
                    case "Name: A-Z":
                        sortItemsByAlphabeticalOrder(true);
                        break;
                    case "Name: Z-A":
                        sortItemsByAlphabeticalOrder(false);
                        break;
                    case "Price: Low to High":
                        sortItemsByPrice(true);
                        break;
                    case "Price: High to Low":
                        sortItemsByPrice(false);
                        break;
                }
                listItemAdapter.notifyDataSetChanged();
            }
        });
    }

    public abstract void populateItemsList(String message);
    public abstract void setTitle(String message);
    public abstract List<Item> getActivityItems(String query); // Probably needs a better name than query

    public void onItemClick(int position) {
        // Start a details activity and pass the current item
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
        Intent detailsIntent = new Intent(ListActivity.this, DetailsActivity.class);
        Item item = listItemAdapter.getItem(position);
        detailsIntent.putExtra("bike", item);
        startActivity(detailsIntent, options.toBundle());

        DataProvider.incrementItemViewCount(item);
    }

    public void sortItemsByAlphabeticalOrder(boolean ascending) {
        Collections.sort(items, (l1, l2) -> l1.getItemTitle().compareTo(l2.getItemTitle()));
        if (!ascending) { Collections.reverse(items); }
    }

    public void sortItemsByPrice(boolean ascending) {
        Collections.sort(items, (l1, l2) -> l1.getPrice().compareTo(l2.getPrice()));
        if (!ascending) { Collections.reverse(items); }
    }
}