package com.example.bikeshowcase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
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
                Intent searchIntent = new Intent(MainActivity.this, ListActivity.class);
                String message = "Search results for \"" + query + "\"";
                searchIntent.putExtra(EXTRA_MESSAGE, message); // Send user's search query
                startActivity(searchIntent);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
                return false;
            }
        });

        RelativeLayout roadCategory = findViewById(R.id.road_category);
        roadCategory.setOnClickListener(v -> {
            Intent roadCategoryIntent = new Intent(MainActivity.this, ListActivity.class);
            roadCategoryIntent.putExtra(EXTRA_MESSAGE, getString(R.string.road_category_name));
            startActivity(roadCategoryIntent);
        });

        RelativeLayout mountainCategory = findViewById(R.id.mountain_category);
        mountainCategory.setOnClickListener(v -> {
            Intent mountainCategoryIntent = new Intent(MainActivity.this, ListActivity.class);
            mountainCategoryIntent.putExtra(EXTRA_MESSAGE, getString(R.string.mountain_category_name));
            startActivity(mountainCategoryIntent);
        });

        RelativeLayout adventureCategory = findViewById(R.id.adventure_category);
        adventureCategory.setOnClickListener(v -> {
            Intent adventureCategoryIntent = new Intent(MainActivity.this, ListActivity.class);
            adventureCategoryIntent.putExtra(EXTRA_MESSAGE, getString(R.string.adventure_category_name));
            startActivity(adventureCategoryIntent);
        });

        RelativeLayout kidsCategory = findViewById(R.id.kids_category);
        kidsCategory.setOnClickListener(v -> {
            Intent kidsCategoryIntent = new Intent(MainActivity.this, ListActivity.class);
            kidsCategoryIntent.putExtra(EXTRA_MESSAGE, getString(R.string.kids_category_name));
            startActivity(kidsCategoryIntent);
        });

        ImageView icon = findViewById(com.google.android.material.R.id.search_mag_icon);
        Drawable blueIcon = icon.getDrawable();
        blueIcon.setTint(R.attr.colorSecondaryVariant);
        icon.setImageDrawable(blueIcon);

        RecyclerView recyclerView = findViewById(R.id.top_picks_view);
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManager);

        List<Item> bikeList = DataProvider.getItems();
        mRecyclerViewItemAdapter = new RecyclerViewItemAdapter(this, R.layout.bike_recycler_view_item, bikeList, this);
        recyclerView.setAdapter(mRecyclerViewItemAdapter);
    }

    @Override
    public void onItemClick(int position) {
        Intent detailsIntent = new Intent(MainActivity.this, DetailsActivity.class);
        detailsIntent.putExtra("bike", (Serializable) mRecyclerViewItemAdapter.getItem(position));
        startActivity(detailsIntent);
    }
}