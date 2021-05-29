package com.example.bikeshowcase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

public class DetailsActivity extends AppCompatActivity {

    private ViewPagerAdapter mViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Getting the first item for testing purposes, in actual implementation this will be provided
        // as an extra from the intent that starts this activity
        List<Item> items = DataProvider.getItems();
        Item item = items.get(7);
        String[] images = item.getImageFileNameList();

        ViewPager2 viewPager = findViewById(R.id.view_pager);
        mViewPagerAdapter = new ViewPagerAdapter(this, R.layout.image_view_pager, images);
        viewPager.setAdapter(mViewPagerAdapter);

        TextView titleTextView = findViewById(R.id.details_title_view);
        titleTextView.setText(item.getItemTitle());

        TextView descriptionTextView = findViewById(R.id.details_colour_view);
        descriptionTextView.setText(item.getColour().toString());

        TextView priceTextView = findViewById(R.id.details_price_view);
        priceTextView.setText("$" + item.getPrice().toString());

        TextView colorTextView = findViewById(R.id.details_description_view);
        colorTextView.setText(item.getDescription().toString());

        ImageButton leftNav = findViewById(R.id.left_nav);
        leftNav.setOnClickListener(v -> {
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        });

        ImageButton rightNav = findViewById(R.id.right_nav);
        rightNav.setOnClickListener(v -> {
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        });
    }
}