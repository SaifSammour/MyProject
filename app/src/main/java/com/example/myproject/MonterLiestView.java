package com.example.myproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class MonterLiestView extends BaseAdapter {
    ArrayList<Mentors> mentors=new ArrayList<>();
    Context context;

    public MonterLiestView(ArrayList<Mentors> mentors, Context context) {
        this.mentors = mentors;
        this.context = context;
    }

    public MonterLiestView(ArrayList<Mentors> mentors) {
        this.mentors = mentors;
    }

    @Override
    public int getCount() {
        return mentors.size();
    }

    @Override
    public Object getItem(int position) {
        return mentors.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return convertView= LayoutInflater.from(context).inflate(R.layout.mentors,parent,false);

    }
}
