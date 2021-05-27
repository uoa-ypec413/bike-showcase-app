package com.example.bikeshowcase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemAdapter extends ArrayAdapter {

    int mLayoutID;
    List<Item> mItems;
    Context mContext;

    public ItemAdapter(@NonNull Context context, int resource, @NonNull List<Item> objects) {
        super(context, resource, objects);
        mLayoutID = resource;
        mContext = context;
        mItems = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Get a reference to the current ListView item
        View currentListViewItem = convertView;

        // Check if the existing view is being reused, otherwise inflate the view
        if (currentListViewItem == null) {
            currentListViewItem = LayoutInflater.from(getContext()).inflate(mLayoutID, parent, false);
        }
        //Get the Number object for the current position
        Item currentItem = mItems.get(position);

        //Set the attributed of list_view_number_item views
        ImageView iconImageView = (ImageView) currentListViewItem.findViewById(R.id.item_image_view);
        int i = mContext.getResources().getIdentifier(
                currentItem.getImageFileNameList()[1], "drawable",
                mContext.getPackageName());

        //Setting the icon
        iconImageView.setImageResource(i);

        TextView itemTitleView = (TextView) currentListViewItem.findViewById(R.id.item_title_view);
        itemTitleView.setText(currentItem.getItemTitle());

        TextView itemColourView = (TextView) currentListViewItem.findViewById(R.id.item_colour_view);
        itemColourView.setText(currentItem.getColour());

        TextView itemPriceView = (TextView) currentListViewItem.findViewById(R.id.item_price_view);
        String price = "$" + String.valueOf(currentItem.getPrice());
        itemPriceView.setText(price);



        return currentListViewItem;
    }

}
