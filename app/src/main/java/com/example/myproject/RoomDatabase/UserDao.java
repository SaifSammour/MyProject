package com.example.myproject.RoomDatabase;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
public interface UserDao {
    @Insert
    void insertUser (User user);
    @Update
    void updateUser(User user);
    @Delete
    void  deleteUser(User user);
    @Query(" SELECT * FROM user")
    LiveData<List<User>> getAllUser();
    @Query(" SELECT * FROM user WHERE Email = :email")
    User getAllUserByEmail(String email);
    @Query(" SELECT * FROM user WHERE Email = :email and Password=:password")
    User login(String email, String password);

}
