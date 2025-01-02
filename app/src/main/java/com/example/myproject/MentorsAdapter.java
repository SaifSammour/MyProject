package com.example.myproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MentorsAdapter extends RecyclerView.Adapter<MentorsAdapter.OnBoaridingViewHolder> {
    public final ArrayList<Mentors> mentors;
    Context context;

    public MentorsAdapter(ArrayList<Mentors> mentors, Context context) {
        this.mentors = mentors;
        this.context = context;
    }



    @NonNull
    @Override
    public OnBoaridingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.mentors,parent,false);

        return new OnBoaridingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OnBoaridingViewHolder holder, int position) {
        Mentors item =mentors.get(position);
        holder.imageView.setImageResource(item.getImage());
        holder.textView.setText(item.getName());

    }

    @Override
    public int getItemCount() {
        return mentors.size();
    }

    public static class OnBoaridingViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public OnBoaridingViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView6);
            imageView = itemView.findViewById(R.id.imageView3);

        }
    }
}
