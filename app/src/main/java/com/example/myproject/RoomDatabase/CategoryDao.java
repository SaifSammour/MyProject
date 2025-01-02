package com.example.myproject.RoomDatabase;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface CategoryDao {
    @Insert
    void insertCategory (Category category);
    @Update
    void updateCategory( Category category);
    @Delete
    void  deleteCategory(Category category);
    @Query(" SELECT * FROM category")
    LiveData<List<Category>> getAllCategory();
}
