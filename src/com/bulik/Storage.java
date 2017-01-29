package com.bulik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Bulik on 29.01.2017.
 */
public class Storage {

    public Map<Integer, Course> courses;
    public List<Student> students;
    public List<Teacher> teachers;

    public Storage(){
        courses = new HashMap<>();
        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }

}