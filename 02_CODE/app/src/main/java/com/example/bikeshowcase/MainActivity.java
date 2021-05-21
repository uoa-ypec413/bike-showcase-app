package com.example.bikeshowcase;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView icon = findViewById(com.google.android.material.R.id.search_mag_icon);
        Drawable blueIcon = icon.getDrawable();
        blueIcon.setTint(R.attr.colorSecondaryVariant);
        icon.setImageDrawable(blueIcon);
    }
}