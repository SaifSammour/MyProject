package com.example.myproject;

public class OnBoardingItem {
    private final int imageResId;
    private final String title;

    public int getImageResId() {
        return imageResId;
    }

    public String getTitle() {
        return title;
    }

    public OnBoardingItem(int imageResId, String title) {
        this.imageResId = imageResId;
        this.title = title;
    }
}
