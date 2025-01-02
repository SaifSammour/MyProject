package com.example.myproject;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_navigation,new HomeFragment()).commit();
                return true;
            case R.id.comment:
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_navigation,new CommentFragment()).commit();
                return true;
            case R.id.memo:
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_navigation,new MemoFragment()).commit();
              return true;
            case R.id.cart:
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_navigation,new CartFragment()).commit();
                return true;
            case R.id.user:
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_navigation,new UserFragment()).commit();
                 return true;
        }

        return false;
    }
}