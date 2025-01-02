package com.example.myproject.RoomDatabase;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class MyRepository {
    private CategoryDao categoryDao;
    private CourseDao couersDao;
    private UserDao userDao;
    private LiveData<List<Course>> getAllCoures;
    MyRepository(Application application) {
        MyDatabase db = MyDatabase.getDatabase(application);
        categoryDao = db.categoryDao();
        couersDao =db.courseDao();
        userDao= db.userDao();

    }
    void insertCourse (Course course){
        MyDatabase.databaseWriteExecutor.execute(()->{
                    couersDao.insertCourse(course);
                }
        );
    }
    void  deleteCourse (Course course){
        MyDatabase.databaseWriteExecutor.execute(()->{
                    couersDao.deleteCourse(course);
                }
        );
    }
    void updateCourse (Course course){
        MyDatabase.databaseWriteExecutor.execute(()->{
                    couersDao.updateCourse(course);
                }
        );
    }
    LiveData<List<Course>> getAllCourse(){
        return couersDao.getAllCourse();
    }
    void insertUser (User user){
        MyDatabase.databaseWriteExecutor.execute(()->{
                    userDao.insertUser(user);
                }
        );
    }
    void deleteUser (User user){
        MyDatabase.databaseWriteExecutor.execute(()->{
                    userDao.deleteUser(user);
                }
        );
    }
    void updateUser (User user){
        MyDatabase.databaseWriteExecutor.execute(()->{
                    userDao.updateUser(user);
                }
        );
    }
    LiveData<List<User>> getAllUser(){
        return userDao.getAllUser();
    }
    void insertCategory (Category category){
        MyDatabase.databaseWriteExecutor.execute(()->{
                    categoryDao.insertCategory(category);
                }
        );
    }
    void  deleteCategory (Category category){
        MyDatabase.databaseWriteExecutor.execute(()->{
                    categoryDao.deleteCategory(category);
                }
        );
    }
    void updateCategory (Category category){
        MyDatabase.databaseWriteExecutor.execute(()->{
                    categoryDao.updateCategory(category);
                }
        );
    }
    LiveData<List<Category>> getAllCategory(){
        return categoryDao.getAllCategory();
    }
    User getlogin(String name,String password){
        return userDao.login( name,password);
    }
}
