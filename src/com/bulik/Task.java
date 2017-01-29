package com.bulik;

/**
 * Created by Bulik on 29.01.2017.
 */
public class Task {
    String task;

    public Task(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "" + task ;
    }
}