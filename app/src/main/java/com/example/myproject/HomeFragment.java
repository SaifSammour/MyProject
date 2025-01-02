package com.example.myproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myproject.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
     FragmentHomeBinding binding;
    private MentorsAdapter mentorsAdapter;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         View view=inflater.inflate(R.layout.fragment_home,container,false);
        ArrayList<Mentors> mentors=new ArrayList<>();
        mentors.add(new Mentors(R.drawable.baseline_person_24,"saif"));
        mentors.add(new Mentors(R.drawable.pesion,"saif"));
        mentors.add(new Mentors(R.drawable.pesion,"saif"));
        mentors.add(new Mentors(R.drawable.pesion,"saif"));
        mentors.add(new Mentors(R.drawable.pesion,"saif"));
        mentors.add(new Mentors(R.drawable.pesion,"saif"));
        mentors.add(new Mentors(R.drawable.pesion,"saif"));
        mentors.add(new Mentors(R.drawable.baseline_person_24,"saif"));
        mentors.add(new Mentors(R.drawable.pesion,"saif"));
        mentors.add(new Mentors(R.drawable.pesion,"saif"));
        mentors.add(new Mentors(R.drawable.pesion,"saif"));
        mentors.add(new Mentors(R.drawable.pesion,"saif"));
        MentorsAdapter mentorsAdapter1=new MentorsAdapter(mentors,requireContext());
        recyclerView=view.findViewById(R.id.rv_monter);
        recyclerView.setAdapter(mentorsAdapter1);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity(),
                LinearLayoutManager.HORIZONTAL,
                false));
        TextView textView=view.findViewById(R.id.tv_All);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(requireContext(), AllMonters.class);
                startActivity(intent);
            }
        });
        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}