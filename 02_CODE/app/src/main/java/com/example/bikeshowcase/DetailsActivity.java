package com.example.bikeshowcase;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Explode;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create an explode transition when this activity is started
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        Explode enterTransition = new Explode();
        enterTransition.setDuration(600);
        getWindow().setEnterTransition(enterTransition);

        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        Item item = (Item) intent.getSerializableExtra("bike");
        String[] images = item.getImageFileNameList();
        if (savedInstanceState == null) {
            for (int i = 0; i < images.length; i++) {
                images[i] = images[i] + "_xxhdpi"; // uses high res images for detail view
            }
        }

        ViewPager2 viewPager = findViewById(R.id.view_pager);
        ViewPagerAdapter mViewPagerAdapter = new ViewPagerAdapter(this, R.layout.image_view_pager, images);
        viewPager.setAdapter(mViewPagerAdapter);

        /* Displays the fields of the item for which this DetailsActivity was started */
        TextView titleTextView = findViewById(R.id.details_title_view);
        titleTextView.setText(item.getItemTitle());

        TextView descriptionTextView = findViewById(R.id.details_colour_view);
        descriptionTextView.setText(item.getColour());

        TextView priceTextView = findViewById(R.id.details_price_view);
        priceTextView.setText("$" + item.getPrice().toString());

        TextView colorTextView = findViewById(R.id.details_description_view);
        colorTextView.setText(item.getDescription());

        /* Navigation buttons as an alternative to scrolling through the ViewPager */
        ImageButton leftNav = findViewById(R.id.left_nav);
        leftNav.setOnClickListener(v -> {
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        });

        ImageButton rightNav = findViewById(R.id.right_nav);
        rightNav.setOnClickListener(v -> {
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        });

        /* Set the category icon corresponding to the item's category */
        ImageView imageView = findViewById(R.id.category_image_view);
        switch (item.getCategory()) {
            case "Road Bikes":
                imageView.setImageResource(R.drawable.ic_road);
                break;
            case "Mountain Bikes":
                imageView.setImageResource(R.drawable.ic_mountain);
                break;
            case "Adventure Bikes":
                imageView.setImageResource(R.drawable.ic_globe_europe);
                break;
            case "Kids Bikes":
                imageView.setImageResource(R.drawable.ic_baby);
                break;
        }
    }
}