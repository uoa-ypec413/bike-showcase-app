package com.example.bikeshowcase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;
import com.google.android.material.snackbar.Snackbar;

public abstract class ListActivity extends AppCompatActivity implements ListItemAdapter.OnItemClickListener {

    protected List<Item> items;
    protected RecyclerView recyclerView;
    protected ListItemAdapter listItemAdapter;
    protected TextView titleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        this.populateItemsList(message);

        this.titleTextView = findViewById(R.id.list_title_view);

        if(this.items.isEmpty()){
            this.titleTextView.setText("Sorry, no matches found!");

        } else {
            setTitle(message);
            this.recyclerView = findViewById(R.id.list_recycler_view);
            this.listItemAdapter = new ListItemAdapter(this, this.items, this);
            recyclerView.setAdapter(listItemAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
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

    public void sortItemsByAlphabeticalOrder() {
        Collections.sort(items, (l1, l2) -> l1.getItemTitle().compareTo(l2.getItemTitle()));
    }
}