package com.example.bikeshowcase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class RecyclerViewItemAdapter extends RecyclerView.Adapter<RecyclerViewItemAdapter.ItemViewHolder> {

    int mLayoutID;
    List<Item> mItems;
    Context mContext;
    LayoutInflater mInflater;

    public RecyclerViewItemAdapter(Context context, int resource, List<Item> items) {
        this.mLayoutID = resource;
        this.mContext = context;
        this.mItems = items;
        this.mInflater = LayoutInflater.from(mContext);
    }

    // Inflates the bike view
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(mLayoutID, parent, false);
        return new ItemViewHolder(view);
    }

    // Binds the bike image and text data to the ImageView and TextView
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        //Get the bike object for the current position
        Item currentItem = mItems.get(position);
        int i = mContext.getResources().getIdentifier(
                currentItem.getImageFileNameList()[1], "drawable",
                mContext.getPackageName());

        holder.bikeImageView.setImageResource(i);
        holder.bikeTextView.setText(currentItem.getItemTitle());
    }

    // Gets the total number of bikes
    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        ImageView bikeImageView;
        TextView bikeTextView;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            bikeImageView = itemView.findViewById(R.id.bike_image_view);
            bikeTextView = itemView.findViewById(R.id.bike_text_view);
        }
    }
}
