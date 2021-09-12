package com.philipowino.medicalhealthtracker.models;

import androidx.annotation.NonNull;

public class DrugEventFrequency {
    private String name;
    private int count;
    private static int allCount;

    public DrugEventFrequency(String name, int count) {
        super();
        this.name = name;
        this.count = count;
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

    @NonNull
    @Override
    public String toString() {
        return "DrugEventFrequency [name=" + name + ", count=" + count + "]";
    }
}
