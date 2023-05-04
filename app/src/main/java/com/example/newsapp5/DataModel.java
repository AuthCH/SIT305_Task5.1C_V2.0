package com.example.newsapp5;

public class DataModel {

    String news;
    int image;
    public DataModel(String news, int image) {
        this.news = news;
        this.image = image;
    }

    public String getNews() {
        return news;
    }

    public int getImage() {
        return image;
    }
}
