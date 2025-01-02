package com.example.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;
import androidx.room.Database;

import com.example.myproject.RoomDatabase.MyDatabase;
import com.example.myproject.RoomDatabase.MyRepository;
import com.example.myproject.RoomDatabase.MyViewModel;
import com.example.myproject.RoomDatabase.User;
import com.example.myproject.databinding.ActivitySingUpBinding;

public class SingUp extends AppCompatActivity {
   ActivitySingUpBinding binding;
     MyViewModel myViewModel;
      MyRepository myRepository;
    public MyDatabase database;
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        binding=ActivitySingUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        myViewModel = new ViewModelProvider(this).get(MyViewModel.class);
        ImageView img_back=findViewById(R.id.img_back);
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SingUp.this, SingIn.class);
                startActivity(intent);
            }

        });
        binding.tvSingup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = binding.etName.getText().toString();
                String password = binding.etPassword.getText().toString();
                String email = binding.etEmail.getText().toString();
                if ((name.isEmpty())) {
                    binding.etName.setError("الاسم فارغ");
                } else if (name.length() <= 3) {
                    binding.etName.setError("الاسم يجب ان يحتوي علي الاقل علي 3 احرف ");
                } else if (email.isEmpty()) {
                    binding.etEmail.setError("البريد الالكتروني فارغ ");
                } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    binding.etEmail.setError("البريد الالكتروني غير صالح ");
                } else if (password.isEmpty()) {
                    binding.etPassword.setError("كلمة السر فارغة ");
                } else if (!TextUtils.isDigitsOnly(password) || password.length() < 8) {
                    binding.etPassword.setError("يجب ان تحتوي كلمة المرور علي 8 أرقام علي الاقل ");
                } else {
                 user= database.userDao().getAllUserByEmail(email);
                User user1 = new User();
                user1.setEmail(email);
                user1.setPassword(password);
                user1.setUserName(name);
                myViewModel.insertUser(user1);
                Toast.makeText(SingUp.this, "تم انشاء حساب ", Toast.LENGTH_SHORT).show();
                finish();
                }

                if (user != null) {
                    Toast.makeText(SingUp.this, "المستخدم موجود بالفعل ", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
