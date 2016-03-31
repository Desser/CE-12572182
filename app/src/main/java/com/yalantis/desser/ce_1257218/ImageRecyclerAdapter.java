package com.yalantis.desser.ce_1257218;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ImageRecyclerAdapter extends RecyclerView.Adapter<ImageRecyclerAdapter.SliderViewHolder> {

    Context context;
    ArrayList imagesList;
    LayoutInflater layoutInflater;


    public ImageRecyclerAdapter(ArrayList imagesListToDisplay, Context context) {
        imagesList = imagesListToDisplay;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }


    @Override
    public SliderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.img_item, null);
        SliderViewHolder viewHolder = new SliderViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(SliderViewHolder holder, final int position) {
        Glide.with(context)
                .load(imagesList.get(position))
                .into(holder.imageView);

        holder.imageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(context, "RecyclerView", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return imagesList.size();
    }

    public class SliderViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;

        public SliderViewHolder(View view) {
            super(view);
            this.imageView = (ImageView) view.findViewById(R.id.image_recycler);
        }

    }

}


