package com.example.bikeshowcase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.ViewHolder> {

    private Context mContext;
    private String[] mImages;
    private int mLayoutID;
    private LayoutInflater mInflater;

    public ViewPagerAdapter(Context context, int resource, String[] images) {
        this.mContext = context;
        this.mImages= images;
        this.mLayoutID = resource;
        this.mInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(mLayoutID,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String currentImage = this.mImages[position];
        int i = mContext.getResources().getIdentifier(
                currentImage, "drawable",
                mContext.getPackageName());

        holder.imageView.setImageResource(i);
    }

    @Override
    public int getItemCount() {
        return mImages.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.pager_image_view);
        }
    }
}
