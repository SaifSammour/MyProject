package com.example.myproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OnBoardingAdabter extends RecyclerView.Adapter<OnBoardingAdabter.OnBoaridingViewHolder> {
    public final ArrayList<OnBoardingItem> onBoardingItems;

    public OnBoardingAdabter(ArrayList<OnBoardingItem> onBoardingItems) {
        this.onBoardingItems = onBoardingItems;
    }

    @NonNull
    @Override
    public OnBoaridingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewpager,parent,false);

        return new OnBoaridingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OnBoaridingViewHolder holder, int position) {
        OnBoardingItem item =onBoardingItems.get(position);
        holder.imageView.setImageResource(item.getImageResId());
        holder.textView.setText(item.getTitle());

    }

    @Override
    public int getItemCount() {
        return onBoardingItems.size();
    }

    public static class OnBoaridingViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public OnBoaridingViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_viewpager);
            imageView = itemView.findViewById(R.id.img_viewpager);

        }
    }
}
