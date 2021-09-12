package com.philipowino.medicalhealthtracker.ui;

import androidx.annotation.NonNull;

public class ResultItem {
    private String name;
    private int count;
    private int imageSource;

    public ResultItem(String name, int count, int imageSource) {
        super();
        this.name = name;
        this.count = count;
        this.imageSource = imageSource;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getImageSource() {
        return imageSource;
    }

    public void setImageSource(int imageSource) {
        this.imageSource = imageSource;
    }

    @NonNull
    @Override
    public String toString() {
        return "DrugEventFrequency [name=" + name + ", count=" + count + "]";
    }
}
