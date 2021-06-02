package com.example.bikeshowcase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import com.google.android.material.snackbar.Snackbar;

public abstract class ListActivity extends AppCompatActivity implements ListItemAdapter.OnItemClickListener {

    protected List<Item> items;
    protected RecyclerView recyclerView;
    protected ListItemAdapter listItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        this.populateItemsList(message);

        if(this.items.isEmpty()){
            View view = findViewById(R.id.list_constraint_layout);
            Snackbar snackbar = Snackbar.make(view, "Sorry, no matches found!", Snackbar.LENGTH_LONG);
            snackbar.setAction("GO BACK", v -> finish());
            snackbar.setActionTextColor(Color.BLACK);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundResource(R.drawable.background_primary_variant_round);
            TextView textView = snackBarView.findViewById(com.google.android.material.R.id.snackbar_text);
            textView.setTextColor(Color.BLACK);
            snackbar.show();

        } else {
            this.recyclerView = findViewById(R.id.list_recycler_view);
            this.listItemAdapter = new ListItemAdapter(this, this.items, this);
            recyclerView.setAdapter(listItemAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
    }

    public void onItemClick(int position) {
        // Start a details activity and pass the current item
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
        Intent detailsIntent = new Intent(ListActivity.this, DetailsActivity.class);
        Item item = listItemAdapter.getItem(position);
        detailsIntent.putExtra("bike", item);
        startActivity(detailsIntent, options.toBundle());

        DataProvider.incrementItemViewCount(item);
    }

    public abstract void populateItemsList(String message);
}