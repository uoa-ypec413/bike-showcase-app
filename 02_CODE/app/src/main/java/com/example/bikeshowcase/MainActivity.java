package com.example.bikeshowcase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
    }
}