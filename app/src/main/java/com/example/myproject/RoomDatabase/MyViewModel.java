package com.example.myproject.RoomDatabase;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class MyViewModel extends AndroidViewModel {
    private MyRepository myRepository;
    public MyViewModel(@NonNull Application application) {
        super(application);
        myRepository=new MyRepository(application);

    }
    void insertCourse(Course course){
        myRepository.insertCourse(course);
    }
    void deleteCourse (Course course){
        myRepository.deleteCourse(course);
    }
    void updateCourse (Course course){
        myRepository.updateCourse(course);
    }
    public void insertUser(User user){
        myRepository.insertUser(user);
    }
    void updateUser (User user){
        myRepository.updateUser(user);
    }
    void deleteUser (User user){
        myRepository.deleteUser(user);
    }
    void insertCategory(Category category){
        myRepository.insertCategory(category);
    }
    void deleteCategory ( Category category){
        myRepository.deleteCategory(category);
    }
    void updateCategory (Category category ){
        myRepository.updateCategory(category);
    }
    LiveData<List<Course>> getAllCourse(){
        return myRepository.getAllCourse();
    }
    LiveData<List<Category>> getAllCategory(){
        return myRepository.getAllCategory();
    }

   public User login(String email, String password){
        return myRepository.getlogin(email, password);
    }

}
