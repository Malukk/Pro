package com.bulik;

import java.util.Scanner;

/**
 * Created by Bulik on 29.01.2017.
 */
public class AdminSkills {
    SystemOperated so = new SystemOperated();

    public void adminSkills() {
        point:
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" 1 Create course ");
            System.out.println(" 2 Display information about the course by ID");
            System.out.println(" 3 Display the names of all courses");
            System.out.println(" 4 Create and add Student");
            System.out.println(" 5 Transfer the student from one course to another");
            System.out.println(" 6 Display information about the student by ID");
            System.out.println(" 7 Create and add Teacher to Course");
            System.out.println(" 8 Display information about the teacher by ID");
            System.out.println(" 9 Display information about oll students by ID course");
            System.out.println(" 10 Display the separate course gradebook");
            System.out.println(" 11 Save gradebook in file");
            System.out.println(" 12 Add task to course");
            System.out.println(" 13 Add Student to course");
            System.out.println(" 14 Add Teacher to course");
            System.out.println(" 15 Back");
            System.out.println(" 16 Exit");
            System.out.print("Enter number of commands-->> :");

            try {

                int q = sc.nextInt();
                if (q >= 1 && q <= 16) {
                    switch (q) {
                        case 1:
                            so.createCurse();
                            System.out.println("*************************************************");
                            break;

                        case 2:
                            so.showCurseID();
                            System.out.println("*************************************************");
                            break;

                        case 3:
                            so.showOllCurses();
                            System.out.println("*************************************************");
                            break;

                        case 4:
                            so.addStudent();
                            System.out.println("*************************************************");
                            break;

                        case 5:
                            so.replaseStudent();
                            System.out.println("*************************************************");
                            break;

                        case 6:
                            so.showStudentID();
                            System.out.println("*************************************************");
                            break;

                        case 7:
                            so.addTeacher();
                            System.out.println("*************************************************");
                            break;

                        case 8:
                            so.showTeacherID();
                            System.out.println("*************************************************");
                            break;

                        case 9:
                            so.showCurses();
                            System.out.println("*************************************************");
                            break;

                        case 10:
                            so.showJournal();
                            System.out.println("*************************************************");
                            break;

                        case 11:
                            so.saveJournal();
                            System.out.println("*************************************************");
                            break;

                        case 12:
                            so.createTask();
                            System.out.println("*************************************************");
                            break;

                        case 13:
                            so.addCourseforStudent();
                            System.out.println("*************************************************");
                            break;
                        case 14:
                            so.addCourseforTeacher();
                            System.out.println("*************************************************");
                            break;
                        case 15:
                            break point;
                        case 16:
                            so.exit();
                            break;

                    }
                } else {
                    System.out.println("Error, try again...");
                    System.out.println("*********************************");
                    continue;
                }

            } catch (Exception e) {
                System.out.println("Error, try again.");
                continue;

            }

        }
    }
}
