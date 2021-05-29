package com.example.bikeshowcase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.List;

public class DetailsActivity extends AppCompatActivity {

    private ViewPagerAdapter mViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Getting the first image for testing purposes, in actual implementation this will be provided
        // as an extra from the intent that starts this activity
        List<Item> items = DataProvider.getItems();
        Item item = items.get(0);
        String[] images = item.getImageFileNameList();

        ViewPager2 viewPager = findViewById(R.id.view_pager);
        mViewPagerAdapter = new ViewPagerAdapter(this, R.layout.image_view_pager, images);
        viewPager.setAdapter(mViewPagerAdapter);
    }
}