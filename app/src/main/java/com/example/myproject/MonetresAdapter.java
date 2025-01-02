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

public class MonetresAdapter extends RecyclerView.Adapter<MonetresAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Mentors> mentors;

    public MonetresAdapter(Context context, ArrayList<Mentors> mentors) {
        this.context = context;
        this.mentors = mentors;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.monetorall,parent,false);
        return new ViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Mentors mentors1=mentors.get(position);
        holder.name.setText(mentors1.getName());
        holder.role.setText(mentors1.getRole());
        holder.image.setImageResource(mentors1.getImage());
    }



    @Override
    public int getItemCount() {
        return mentors.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView name,role;
        ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.mentorName);
            role=itemView.findViewById(R.id.mentorRole);
            image=itemView.findViewById(R.id.mentor_image);
        }
    }

}
