package com.example.myproject.RoomDatabase;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "course",foreignKeys = @ForeignKey(entity = Category.class,parentColumns = "categoryId",childColumns = "categoryId",onDelete = ForeignKey.CASCADE))

public class Course {
    @PrimaryKey(autoGenerate = true)
    public int courseId;
    public String courseName;
    public String description;
    public String instructorName;

    public Course() {
    }

    public int Hours;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public int getHours() {
        return Hours;
    }

    public void setHours(int hours) {
        Hours = hours;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double price;
    public int numberOfStudent;
    public int categoryId;

    public Course(int courseId, String courseName, String description, String instructorName, int hours, double price, int numberOfStudent, int categoryId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.description = description;
        this.instructorName = instructorName;
        Hours = hours;
        this.price = price;
        this.numberOfStudent = numberOfStudent;
        this.categoryId = categoryId;
    }
}
