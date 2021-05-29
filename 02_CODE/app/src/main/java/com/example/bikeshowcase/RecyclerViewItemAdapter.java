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

    private int mLayoutID;
    private List<Item> mItems;
    private Context mContext;
    private LayoutInflater mInflater;
    private OnItemClickListener mOnItemClickListener;

    public RecyclerViewItemAdapter(Context context, int resource, List<Item> items, OnItemClickListener onItemClickListener) {
        this.mLayoutID = resource;
        this.mContext = context;
        this.mItems = items;
        this.mInflater = LayoutInflater.from(mContext);
        this.mOnItemClickListener = onItemClickListener;
    }

    // Inflates the bike view
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(mLayoutID, parent, false);
        return new ItemViewHolder(view, mOnItemClickListener);
    }

    // Populates the data from mItems to the view items
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        //Get the bike object for the current position
        Item currentItem = getItem(position);
        int i = mContext.getResources().getIdentifier(
                currentItem.getImageFileNameList()[1], "drawable",
                mContext.getPackageName());

        holder.bikeImageView.setImageResource(i);
        holder.bikeTextView.setText(currentItem.getItemTitle());
    }

    public void setItems(List<Item> items) {
        this.mItems = items;
    }

    // Gets the total number of bikes
    @Override
    public int getItemCount() {
        return mItems.size();
    }

    // Gets the item at a given position
    public Item getItem(int position) {
        return mItems.get(position);
    }

    // View Holder for each individual item
    // Implements View.OnClickListener so that the view items are clickable
    public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView bikeImageView;
        TextView bikeTextView;
        OnItemClickListener onItemClickListener;

        public ItemViewHolder(@NonNull View itemView, OnItemClickListener onItemClickListener) {
            super(itemView);
            this.bikeImageView = itemView.findViewById(R.id.bike_image_view);
            this.bikeTextView = itemView.findViewById(R.id.bike_text_view);

            // Sets the onItemClickListener for each individual view holder
            this.onItemClickListener = onItemClickListener;

            // Attaches the onClickListener to the individual view
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            this.onItemClickListener.onItemClick(getBindingAdapterPosition());
        }
    }

    // Allows the parent activity to implement the on item click listener
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
}
