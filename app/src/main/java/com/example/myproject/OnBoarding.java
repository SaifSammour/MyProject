package com.example.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class OnBoarding extends AppCompatActivity {
    private ViewPager2 viewPager2;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);
        viewPager2=findViewById(R.id.view_pager);
        textView=findViewById(R.id.btn_Next);
        ArrayList<OnBoardingItem> onBoardingItems=new ArrayList<>();
        onBoardingItems.add(new OnBoardingItem(R.drawable.undraw_teacher,"We Provide the best learning courses & great mentors!"));
        onBoardingItems.add(new OnBoardingItem(R.drawable.undraw_respond,"Learn anytime and anywhere easily and conveniently"));
        onBoardingItems.add(new OnBoardingItem(R.drawable.undraw_certification,"Lets improve your skills together whit Elera right now!"));
        OnBoardingAdabter onBoardingAdabter=new OnBoardingAdabter(onBoardingItems);
        viewPager2.setAdapter(onBoardingAdabter);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int current=viewPager2.getCurrentItem();
                if (current<onBoardingItems.size() -1){
                    viewPager2.setCurrentItem(current+1);

                }else {
                     Intent intent=new Intent(OnBoarding.this, SingIn.class);
                     startActivity(intent);
                }
                if(current == onBoardingItems.size() -1){
                    textView.setText("Start");
                }else {
                    textView.setText("Next");
                }
            }
        });
    }


}