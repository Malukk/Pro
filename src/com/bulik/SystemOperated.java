package com.bulik;

import java.util.Scanner;

/**
 * Created by Bulik on 29.01.2017.
 */
public class SystemOperated {
    Scanner sc = new Scanner(System.in);
    Storage storage = new Storage();
    Student student = new Student();
    Course course = new Course();


    public void createCurse(){
        System.out.println("Course name:");
        String curseName = sc.nextLine();
        System.out.println("Course description:");
        String descriptedCurs = sc.nextLine();
        System.out.println("Start date:");
        String curseStart = sc.nextLine();
        System.out.println("End date:");
        String curseEnd = sc.nextLine();
        System.out.println("Days:");
        String daysOfWeak = sc.nextLine();
        Course course = new Course(curseName, descriptedCurs, curseStart, curseEnd, daysOfWeak );
        storage.courses.put(course.getCurseID(), course);
        System.out.println("New course has been successfully created:");
        System.out.println(course.toString2());

    }

    public void showCurseID(){
        System.out.print("Please, enter the curses ID -->:");
        int a =sc.nextInt();
        System.out.println(storage.courses.get(a).toString());

    }


    public void showOllCurses(){
        for(int i = 1; i<=storage.courses.size(); i++)
            System.out.println(storage.courses.get(i).toString1());

    }


    public void addStudent(){
        System.out.println("Enter name:");
        String studentName =sc.next();
        System.out.println("Enter surname :");
        String studentSurnam =sc.next();
        Student student = new Student(studentName, studentSurnam);
        storage.students.add(student);
        System.out.println("New student has been successfully add:");
        System.out.println("Select course:");
        showOllCurses();
        System.out.print("Please, enter the curses ID -->:");
        int answer= sc.nextInt();
        storage.courses.get(answer).add1Student(student);
        student.addCurs(storage.courses.get(answer));


    }

    public void addCourseforStudent(){
        System.out.println(storage.students.toString());
        System.out.println("Please, enter the students ID -->:");
        int a =sc.nextInt();
        storage.students.get(a-1);
        System.out.println("Select course:");
        showOllCurses();
        System.out.print("Please, enter the curses ID -->:");
        int answer= sc.nextInt();
        storage.courses.get(answer).add1Student(storage.students.get(a-1));
        storage.students.get(a-1).addCurs(storage.courses.get(answer));

    }

    public void replaseStudent(){

        System.out.println("Select course from:");
        showOllCurses();
        System.out.print("Please, enter the curses ID -->:");
        int answer= sc.nextInt();
        storage.courses.get(answer).deleteStudent(student);
        System.out.println("Select student for transfer");
        System.out.println(storage.students.toString());
        System.out.println("Please, enter the students ID -->:");
        int a =sc.nextInt();
        storage.students.get(a-1).deleteCurs(course);
        System.out.println(storage.students.get(a-1));
        storage.students.get(a-1);
        System.out.println("Select course to:");
        showOllCurses();
        System.out.print("Please, enter the curses ID -->:");
        int answe= sc.nextInt();
        storage.courses.get(answe).add1Student(storage.students.get(a-1));
        storage.students.get(a-1).addCurs(storage.courses.get(answe));
        System.out.println("You transfered "+ storage.students.get(a-1).toString2()+"from course "+storage.courses.get(answer).toString5()
                +" into course "+storage.courses.get(answe).toString5()+"!!!");

    }


    public void showStudentID(){
        System.out.println("Please, enter the students ID -->:");
        int a =sc.nextInt();
        System.out.println(storage.students.get(a-1).toString1());

    }


    public void addTeacher(){
        System.out.println("Enter Name:");
        String teacherName =sc.next();
        System.out.println("Enter Surname :");
        String teacherSurname =sc.next();
        Teacher teacher = new Teacher(teacherName, teacherSurname);
        storage.teachers.add(teacher);
        System.out.println("Select course :");
        showOllCurses();
        System.out.print("Please, enter the curses ID -->:");
        int answer= sc.nextInt();
        storage.courses.get(answer).add1Teacher(teacher);
        teacher.addCurs(storage.courses.get(answer));

    }
    public void addCourseforTeacher(){
        System.out.println(storage.teachers.toString());
        System.out.println("Please, enter the teachers ID -->:");
        int a =sc.nextInt();
        storage.teachers.get(a-1);
        System.out.println("Select course:");
        showOllCurses();
        System.out.print("Please, enter the curses ID -->:");
        int answer= sc.nextInt();
        storage.courses.get(answer).add1Teacher(storage.teachers.get(a-1));
        storage.teachers.get(a-1).addCurs(storage.courses.get(answer));

    }


    public void showTeacherID(){
        System.out.println("Please, enter the teachers ID -->:");
        int a =sc.nextInt();
        System.out.println(storage.teachers.get(a-1).toString1());

    }


    public void createTask(){
        System.out.print("Please, enter the Task -->:");
        String answe = sc.nextLine();
        Task task = new Task(answe);
        System.out.println("Select course :");
        showOllCurses();
        System.out.print("Please, enter the curses ID -->:");
//        sc.next();
        int answer= sc.nextInt();

        storage.courses.get(answer).add1Task(task);

    }


    public void showCurses(){
        System.out.print("Please, enter the curses ID -->:");
        int a =sc.nextInt();
        System.out.println(storage.courses.get(a).toString3());

    }


    public void showJournal(){
        System.out.print("Please, enter the curses ID -->:");
        int a =sc.nextInt();
        System.out.println(storage.courses.get(a).toString4());

    }

    public void saveJournal(){

    }
    public void exit(){
        System.out.println("Exit...");
        System.exit(0);

    }


}
