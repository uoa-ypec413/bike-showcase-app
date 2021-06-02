package com.example.bikeshowcase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.List;

public class CategoryActivity extends AppCompatActivity implements CategoryItemAdapter.OnItemClickListener{

    private RecyclerView recyclerView;
    private CategoryItemAdapter categoryItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        recyclerView = findViewById(R.id.category_recycler_view);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        List<Item> categoryItems = DataProvider.getCategoryItems(message);


        categoryItemAdapter = new CategoryItemAdapter(this, categoryItems, this);
        recyclerView.setAdapter(categoryItemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void onItemClick(int position) {
        // Start a details activity and pass the current item
        Intent detailsIntent = new Intent(CategoryActivity.this, DetailsActivity.class);
        Item item = categoryItemAdapter.getItem(position);
        detailsIntent.putExtra("bike", item);
        startActivity(detailsIntent);

        DataProvider.incrementItemViewCount(item);
    }
}