package com.yalantis.desser.ce_1257218;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ImageSliderAdapter extends RecyclerView.Adapter<ImageSliderAdapter.SliderViewHolder> {

    Context context;
    ArrayList imagesList;
    LayoutInflater layoutInflater;

    public ImageSliderAdapter(ArrayList imagesListToDisplay, Context context) {
        imagesList = imagesListToDisplay;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }


    @Override
    public SliderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_img_item, null);
        SliderViewHolder viewHolder = new SliderViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(SliderViewHolder holder, int position) {
        Glide.with(context)
                .load(imagesList.get(position))
                .into(holder.imageView);


    }



    @Override
    public int getItemCount() {
        return imagesList.size();
    }

    public class SliderViewHolder extends RecyclerView.ViewHolder {
        protected ImageView imageView;

        public SliderViewHolder(View view) {
            super(view);
            this.imageView = (ImageView) view.findViewById(R.id.fragment_image_recycler);
        }

    }

}


