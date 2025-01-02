package com.example.myproject;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;
import androidx.room.Database;

import com.example.myproject.RoomDatabase.MyViewModel;
import com.example.myproject.RoomDatabase.User;
import com.example.myproject.databinding.ActivitySingInBinding;

public class SingIn extends AppCompatActivity {
    ActivitySingInBinding binding;
    MyViewModel myViewModel;
    String email;
    String password;
      SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivitySingInBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        email=   binding.etEmail.getText().toString();

        password=  binding.etPassword.getText().toString();

       sharedPreferences=getSharedPreferences("lohinPrefs", Context.MODE_PRIVATE);
        myViewModel = new ViewModelProvider(this).get(MyViewModel.class);
        binding.tvSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });
        binding.tvSing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SingIn.this, SingUp.class);
                startActivity(intent);
            }
        });

    }

    private void Login(){
        if(TextUtils.isEmpty(email)||TextUtils.isEmpty(password)){
            Toast.makeText(this, "يرجي ادخال البانات ", Toast.LENGTH_SHORT).show();
            return;
        }
        new Thread(()->{
            User user=myViewModel.login(email,password);
            if(user!= null){
                if (binding.rbRemember.isChecked()){
                    SharedPreferences.Editor editor=sharedPreferences.edit();
                    editor.putBoolean("remember_me",true);
                    editor.putString("email",email);
                    editor.apply();
                }
                runOnUiThread(()->{
                    Toast.makeText(this, "تم تسجيل الدخول بنجاح", Toast.LENGTH_SHORT).show();
                    Home();
                });

            }else {
                runOnUiThread(()->{
                    Toast.makeText(this, "البيانات غير صحيحة ", Toast.LENGTH_SHORT).show();

                });
            }
        }).start();
    }
    private  void Home(){
        Intent intent=new Intent(this, HomeFragment.class);
        startActivity(intent);
        finish();
    }
}