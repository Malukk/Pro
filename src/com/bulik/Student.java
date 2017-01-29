package com.bulik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Bulik on 29.01.2017.
 */
public class Student {
    private int studentID;
    static int createIdStud = 1;
    private String studentName;
    private String studentSurname;
    private List<String> courses = new ArrayList<>();
    private List<?> tasks = new ArrayList<>();

    Scanner sc = new Scanner(System.in);


    public void addCurs (Course course){
        courses.add(course.getCurseName());
    }

    public void deleteCurs(Course course){
        System.out.println(toString3());
        System.out.println("Select course for del");
        int a=sc.nextInt();
        courses.remove(a-1);
    }



    public Student() {
    }

    public Student(String studentName, String studentSurname) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentID = createIdStud++;
    }



    public Student(List<String> courses) {
        this.courses = courses;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public List<?> getTasks() {
        return tasks;
    }

    public void setTasks(List<Integer> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Student : "+
                "ID = " + studentID +'\t' +
                "Name = " + studentName + '\t' +
                "Surname = " + studentSurname +'\n';

    }


    public String toString1() {
        return "Student : "+
                "ID = " + studentID +'\t' +
                "Name = " + studentName + '\t' +
                "Surname = " + studentSurname + '\t' +
                "Courses = " + courses +'\t' +
                "Tasks = " + tasks+'\n';
    }
    public String toString2() {
        return
                "" + studentName + '\t' + studentSurname +'\t';

    }
    public String toString3() {
        return
                "" + courses;

    }
}
