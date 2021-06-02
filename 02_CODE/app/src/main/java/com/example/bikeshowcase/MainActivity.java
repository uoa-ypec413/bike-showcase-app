package com.example.bikeshowcase;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerViewItemAdapter.OnItemClickListener {

    public final static String EXTRA_MESSAGE = "";
    private RecyclerViewItemAdapter mRecyclerViewItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SearchView searchView = findViewById(R.id.search_view);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener(){

            @Override
            public boolean onQueryTextSubmit(String query) {
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                searchIntent.putExtra(EXTRA_MESSAGE, query); // Send user's search query
                startActivity(searchIntent);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
                return false;
            }
        });

        ConstraintLayout roadCategory = findViewById(R.id.road_constraint_layout);
        roadCategory.setOnClickListener(v -> {
            Intent roadCategoryIntent = new Intent(MainActivity.this, CategoryActivity.class);
            roadCategoryIntent.putExtra(EXTRA_MESSAGE, getString(R.string.road_category_name));
            startActivity(roadCategoryIntent);
        });

        ConstraintLayout mountainCategory = findViewById(R.id.mountain_constraint_layout);
        mountainCategory.setOnClickListener(v -> {
            Intent mountainCategoryIntent = new Intent(MainActivity.this, CategoryActivity.class);
            mountainCategoryIntent.putExtra(EXTRA_MESSAGE, getString(R.string.mountain_category_name));
            startActivity(mountainCategoryIntent);
        });

        ConstraintLayout adventureCategory = findViewById(R.id.adventure_constraint_layout);
        adventureCategory.setOnClickListener(v -> {
            Intent adventureCategoryIntent = new Intent(MainActivity.this, CategoryActivity.class);
            adventureCategoryIntent.putExtra(EXTRA_MESSAGE, getString(R.string.adventure_category_name));
            startActivity(adventureCategoryIntent);
        });

        ConstraintLayout kidsCategory = findViewById(R.id.kids_constraint_layout);
        kidsCategory.setOnClickListener(v -> {
            Intent kidsCategoryIntent = new Intent(MainActivity.this, CategoryActivity.class);
            kidsCategoryIntent.putExtra(EXTRA_MESSAGE, getString(R.string.kids_category_name));
            startActivity(kidsCategoryIntent);
        });

        RecyclerView recyclerView = findViewById(R.id.top_picks_view);
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManager);

        List<Item> mostVisitedItems = DataProvider.getItemsOrderedByVisits();
        mRecyclerViewItemAdapter = new RecyclerViewItemAdapter(this, R.layout.bike_recycler_view_item, mostVisitedItems, this);
        recyclerView.setAdapter(mRecyclerViewItemAdapter);
    }

    @Override
    public void onItemClick(int position) {
        // Start a details activity and pass the current item
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
        Intent detailsIntent = new Intent(MainActivity.this, DetailsActivity.class);
        Item item = mRecyclerViewItemAdapter.getItem(position);
        detailsIntent.putExtra("bike", item);
        startActivity(detailsIntent, options.toBundle());

        DataProvider.incrementItemViewCount(item);
    }

    // This method updates the items for the adapter with the most visited items
    // each time the MainActivity is resumed
    @Override
    protected void onResume() {
        super.onResume();
        List<Item> mostVisitedItems = DataProvider.getItemsOrderedByVisits();
        this.mRecyclerViewItemAdapter.setItems(mostVisitedItems);
        this.mRecyclerViewItemAdapter.notifyDataSetChanged();
    }
}