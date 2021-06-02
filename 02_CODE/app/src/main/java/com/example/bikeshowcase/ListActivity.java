package com.example.bikeshowcase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public abstract class ListActivity extends AppCompatActivity {

    protected List<Item> itemsList;
    protected ItemAdapter itemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        this.populateItemsList(message);

        if(this.itemsList.isEmpty()){
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
            this.itemsAdapter = new ItemAdapter(this, R.layout.item_list_view_item, this.itemsList);
            ListView listView = findViewById(R.id.ListView);
            listView.setAdapter(this.itemsAdapter);
        }
    }

    public abstract void populateItemsList(String message);
}