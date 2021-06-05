package com.example.bikeshowcase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        this.populateItemsList(message);

        this.listToolBar = findViewById(R.id.list_toolbar);
        this.titleTextView = findViewById(R.id.list_text_view);

        if(this.items.isEmpty()){
            this.listToolBar.setTitle("Sorry, no matches found!");

        } else {
            setTitle(message);
            this.recyclerView = findViewById(R.id.list_recycler_view);
            this.listItemAdapter = new ListItemAdapter(this, this.items, this);
            recyclerView.setAdapter(listItemAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.sort_options_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public abstract void populateItemsList(String message);
    public abstract void setTitle(String message);

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