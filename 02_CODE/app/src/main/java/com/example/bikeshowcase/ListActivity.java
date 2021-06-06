package com.example.bikeshowcase;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public abstract class ListActivity extends AppCompatActivity implements ListItemAdapter.OnItemClickListener {

    protected List<Item> mItems;
    protected RecyclerView mRecyclerView;
    protected ListItemAdapter mListItemAdapter;
    protected Toolbar mListToolBar;
    protected TextView mTitleTextView;
    protected Spinner mSpinner;
    protected ArrayAdapter<CharSequence> mSpinnerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        this.populateItemsList(message);

        this.mTitleTextView = findViewById(R.id.list_text_view);
        this.mListToolBar = findViewById(R.id.list_toolbar);
        setTitle(message);

        this.mRecyclerView = findViewById(R.id.list_recycler_view);
        if (!this.mItems.isEmpty()) {
            setRecyclerViewAdapter();
        }

        this.mSpinner = findViewById(R.id.spinner);
        setSpinnerAdapter();
    }

    // Allows the subclass to determine what items are necessary for the activity
    public abstract void populateItemsList(String message);

    // Allows the subclass to determine what the title will be and where the title will be shown
    public abstract void setTitle(String message);

    // Allows the subclass to define what items to return according to the message
    public abstract List<Item> getActivityItems(String message);

    public void onItemClick(int position) {
        // Start a details activity and pass the current item
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
        Intent detailsIntent = new Intent(ListActivity.this, DetailsActivity.class);
        Item item = mListItemAdapter.getItem(position);
        detailsIntent.putExtra("bike", item);
        startActivity(detailsIntent, options.toBundle());

        DataProvider.incrementItemViewCount(item);
    }

    public void setRecyclerViewAdapter() {
        this.mListItemAdapter = new ListItemAdapter(this, this.mItems, this);
        this.mRecyclerView.setAdapter(mListItemAdapter);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void setSpinnerAdapter() {
        this.mSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.sort_options_array, android.R.layout.simple_spinner_item);
        this.mSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.mSpinner.setAdapter(mSpinnerAdapter);
        this.mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                sortItemsByAlphabeticalOrder(true);
            }

            @Override
            public void onItemSelected(AdapterView adapter, View v, int i, long lng) {
                String selectedItem = adapter.getItemAtPosition(i).toString();
                switch (selectedItem) {
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
                mListItemAdapter.notifyDataSetChanged();
            }
        });
    }

    public void sortItemsByAlphabeticalOrder(boolean ascending) {
        Collections.sort(mItems, (l1, l2) -> l1.getItemTitle().compareTo(l2.getItemTitle()));
        if (!ascending) {
            Collections.reverse(mItems);
        }
    }

    public void sortItemsByPrice(boolean ascending) {
        Collections.sort(mItems, (l1, l2) -> l1.getPrice().compareTo(l2.getPrice()));
        if (!ascending) {
            Collections.reverse(mItems);
        }
    }
}