package com.example.newsapp5;

public class DataModel2 {
    private String heading;
    private int image;

    public DataModel2(String heading,int image) {
        this.heading = heading;

        this.image = image;
    }

    public String getHeading() {
        return heading;
    }

    public int getImage() {
        return image;
    }
}
