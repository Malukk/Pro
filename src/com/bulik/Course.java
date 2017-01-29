package com.bulik;

import java.util.*;

/**
 * Created by Bulik on 29.01.2017.
 */
public class Course {
    private  int curseID;
    static int createIDCurs = 1;
    private String curseName;
    private String curseDescription;
    private List<Teacher> curseTeacher = new ArrayList<>();
    private String curseStart;
    private String curseEnd;
    private String daysOfWeak;
    private List<Task> tasks = new ArrayList<>();
    //    private Map<Integer, Task> tasks = new HashMap<>();
    List<Student> students = new ArrayList<>();
    //    private Student[] studentList = new Student[12];
    private Map<Student, HashMap<Task, Integer>> journal = new HashMap<>();

    Scanner sc = new Scanner(System.in);


    public void add1Teacher(Teacher teacher){
        curseTeacher.add(teacher);

    }
    public void deleteTeacher(Teacher teacher){
        curseTeacher.remove(teacher);

    }
    public void add1Task(Task task){
        tasks.add(task);

    }

    public void add1Student(Student student) {
        students.add(student);

    }
    public void deleteStudent(Student student) {
        System.out.println(toString3());
        System.out.println("Select student for transfer");
        int x=sc.nextInt();
        students.remove(x-1);

    }

    public Course() {

    }

    public Course(String curseName, String curseDescription, String curseStart, String curseEnd, String daysOfWeak) {
        this.curseName = curseName;
        this.curseDescription = curseDescription;
        this.curseStart = curseStart;
        this.curseEnd = curseEnd;
        this.daysOfWeak = daysOfWeak;
        this.curseID = createIDCurs++;
    }

    public int getCurseID() {
        return curseID;
    }

    public void setCurseID(int curseID) {
        this.curseID = curseID;
    }

    public String getCurseName() {
        return curseName;
    }

    public void setCurseName(String curseName) {
        this.curseName = curseName;
    }

    public String getCurseDescription() {
        return curseDescription;
    }

    public void setCurseDescription(String curseDescription) {
        this.curseDescription = curseDescription;
    }

    public List<Teacher> getCurseTeacher() {
        return curseTeacher;
    }

    public void setCurseTeacher(List<Teacher> curseTeacher) {
        this.curseTeacher = curseTeacher;
    }
//    public Teacher getCurseTeacher() {
//        return curseTeacher;
//    }
//
//    public void setCurseTeacher(Teacher curseTeacher) {
//        this.curseTeacher = curseTeacher;
//    }

    public String getCurseStart() {
        return curseStart;
    }

    public void setCurseStart(String curseStart) {
        this.curseStart = curseStart;
    }

    public String getCurseEnd() {
        return curseEnd;
    }

    public void setCurseEnd(String curseEnd) {
        this.curseEnd = curseEnd;
    }

    public String getDaysOfWeak() {
        return daysOfWeak;
    }

    public void setDaysOfWeak(String daysOfWeak) {
        this.daysOfWeak = daysOfWeak;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    //    public Map<Integer, Task> getTasks() {
//        return tasks;
//    }
//
//    public void setTasks(HashMap<Integer, Task> tasks) {
//        this.tasks = tasks;
//    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
//    public Student[] getStudentList() {
//        return studentList;
//    }
//
//    public void setStudentList(Student[] studentList) {
//        this.studentList = studentList;
//    }

    public Map<Student, HashMap<Task, Integer>> getJournal() {
        return journal;
    }

    public void setJournal() {

    }

    public void wer() {
        System.out.println(curseID + '\t' + curseName);

    }

    public String toString4() {
        return ""+journal;

    }

    public String toString3() {
        return ""+students;

    }


    public String toString2() {
        return
                "Course ID:"  + '\t'+'\t'+'\t'+ curseID + '\n' +
                        "Course name: "+ '\t'+'\t'+curseName + '\n' +
                        "Course description: " +curseDescription + '\n' +
                        "Start date:"+ '\t'+'\t'+'\t'+curseStart + '\n' +
                        "End date:"+ '\t'+'\t'+'\t'+curseEnd + '\n' +
                        "Days:"+ '\t' + '\t'+'\t'+'\t'+daysOfWeak+ '\n';


    }



    public String toString1() {
        return
                "ID:" + curseID +'\t'+curseName ;

    }
    public String toString5() {
        return
                "" +curseName ;

    }

    @Override
    public String toString() {
        return
                "Course ID:" + '\t'+'\t'+'\t'+ curseID + '\n' +
                        "Course name: "+ '\t'+'\t'+ curseName + '\n' +
                        "Course description: " + curseDescription+ '\n' +
                        curseTeacher + '\n' +
                        "Course Start: "+ '\t'+'\t'+ curseStart + '\n' +
                        "Course End: "+ '\t'+'\t'+ curseEnd + '\n' +
                        "daysOfWeak: " + '\t'+ '\t'+daysOfWeak+ '\n' +
                        students + '\n';

    }

//    @Override
//    public String toString() {
//        return
//                "ID = " + curseID +'\n' +
//                "Name = " + curseName + '\n' +
//                "Description = " + curseDescription + '\n' +
//                curseTeacher +'\n' +
//                "Start = " + curseStart + '\n' +
//                "End = " + curseEnd + '\n' +
//                "DaysOfWeak = " +daysOfWeak +'\n' +
//                "Tasks = " + tasks +'\n' +
//                students +'\n' +
//                "Journal = " + journal ;
//
//
//    }
}

