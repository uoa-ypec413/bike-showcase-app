package com.example.bikeshowcase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.List;

public class ListActivity extends AppCompatActivity implements ListItemAdapter.OnItemClickListener{

    private RecyclerView recyclerView;
    private ListItemAdapter listItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = findViewById(R.id.list_recycler_view);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        List<Item> items = DataProvider.getCategoryItems(message);


        listItemAdapter = new ListItemAdapter(this, items, this);
        recyclerView.setAdapter(listItemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void onItemClick(int position) {
        // Start a details activity and pass the current item
        Intent detailsIntent = new Intent(ListActivity.this, DetailsActivity.class);
        Item item = listItemAdapter.getItem(position);
        detailsIntent.putExtra("bike", item);
        startActivity(detailsIntent);

        DataProvider.incrementItemViewCount(item);
    }
}