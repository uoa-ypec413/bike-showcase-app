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

public class ListItemAdapter extends RecyclerView.Adapter<ListItemAdapter.CategoryViewHolder> {

    private final List<Item> mItems;
    private final Context mContext;
    private final ListItemAdapter.OnItemClickListener mOnItemClickListener;

    public ListItemAdapter(Context context, List<Item> items, ListItemAdapter.OnItemClickListener onItemClickListener){
        this.mContext = context;
        this.mItems = items;
        this.mOnItemClickListener = onItemClickListener;
    }


    public Item getItem(int position) {
        return mItems.get(position);
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.item_list_view_item, parent,false);
        return new CategoryViewHolder(view, mOnItemClickListener);
    }

    //creates the item cards from item data
    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.title.setText(mItems.get(position).getItemTitle());
        holder.colour.setText(mItems.get(position).getColour());
        holder.price.setText("$" + mItems.get(position).getPrice().toString());
        String imageFileName = mItems.get(position).getImageFileNameList()[1] + "_ldpi"; //uses the low res image for thumbnails
        int i = mContext.getResources().getIdentifier(
                imageFileName, "drawable",
                mContext.getPackageName());
        holder.image.setImageResource(i);


    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public static class CategoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        OnItemClickListener onItemClickListener;
        TextView title, colour, price;
        ImageView image;

        public CategoryViewHolder(@NonNull View itemView, OnItemClickListener onItemClickListener) {
            super(itemView);
            title = itemView.findViewById(R.id.item_title_view);
            colour = itemView.findViewById(R.id.item_colour_view);
            price = itemView.findViewById(R.id.item_price_view);
            image = itemView.findViewById(R.id.item_image_view);

            this.onItemClickListener = onItemClickListener;

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
