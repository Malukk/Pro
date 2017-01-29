package com.bulik;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bulik on 29.01.2017.
 */
public class Teacher {
    private int teacherID;
    static int createIdTeacher = 1;
    private String teacherName;
    private String teacherSurname;
    private List<String> courses = new ArrayList<>();

    Course course= new Course();
    public Teacher() {
    }

    public Teacher(String teacherName, String teacherSurname) {
        this.teacherName = teacherName;
        this.teacherSurname = teacherSurname;
        this.teacherID = createIdTeacher++;
    }
    public void addCurs (Course course){
        courses.add(course.getCurseName());
    }

    //    public Teacher(String teacherName, String teacherSurname, List<Course> courses) {
//        this.teacherName = teacherName;
//        this.teacherSurname = teacherSurname;
//        this.courses = courses;
//    }
    public void add1Curse(Course course){
        courses.add(course.getCurseName());
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherSurname() {
        return teacherSurname;
    }

    public void setTeacherSurname(String teacherSurname) {
        this.teacherSurname = teacherSurname;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public String toString1() {
        return "Teacher : "+
                "ID = " + teacherID +'\t' +
                "Name =" + teacherName + '\t' +
                "Surname = " + teacherSurname + '\t' +
                "courses = " + courses +'\n' ;
    }

    @Override
    public String toString() {
        return "Teacher : "+
                "ID = " + teacherID +'\t' +
                "Name = " + teacherName + '\t' +
                "Surname = " + teacherSurname + '\n' ;

    }
}
