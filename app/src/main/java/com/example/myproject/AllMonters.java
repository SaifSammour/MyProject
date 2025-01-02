package com.example.myproject;

import static androidx.core.content.ContentProviderCompat.requireContext;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AllMonters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_all_monters);
        ImageView img_back_btn=findViewById(R.id.img_back_btn);
        RecyclerView recyclerView=findViewById(R.id.recyclerView);
        ArrayList<Mentors> mentors=new ArrayList<>();
        mentors.add(new Mentors(R.drawable.pesion,"saif","XD"));
        mentors.add(new Mentors(R.drawable.pesion,"saif","XD"));
        mentors.add(new Mentors(R.drawable.pesion,"saif","XD"));
        mentors.add(new Mentors(R.drawable.pesion,"saif","XD"));
        mentors.add(new Mentors(R.drawable.pesion,"saif","XD"));
        mentors.add(new Mentors(R.drawable.pesion,"saif","XD"));
        mentors.add(new Mentors(R.drawable.pesion,"saif","XD"));
        mentors.add(new Mentors(R.drawable.pesion,"saif","XD"));
        mentors.add(new Mentors(R.drawable.pesion,"saif","XD"));
        mentors.add(new Mentors(R.drawable.pesion,"saif","XD"));
        mentors.add(new Mentors(R.drawable.pesion,"saif","XD"));
        mentors.add(new Mentors(R.drawable.pesion,"saif","XD"));
        MonetresAdapter mentorsAdapter1=new MonetresAdapter(this, mentors);
        recyclerView.setAdapter(mentorsAdapter1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        img_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AllMonters.this,HomeFragment.class);
                startActivity(intent);
            }
        });
    }
}