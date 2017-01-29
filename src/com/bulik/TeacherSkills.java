package com.bulik;

import java.util.Scanner;

/**
 * Created by Bulik on 29.01.2017.
 */
public class TeacherSkills {

    SystemOperated so = new SystemOperated();

    public void teacherSkills() {
        point:
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" 1 Display information about the course by ID");
            System.out.println(" 2 Display information about the student by ID");
            System.out.println(" 3 Display information about the teacher by ID");
            System.out.println(" 4 Add task to course");
            System.out.println(" 5 Display information about oll students by ID course");
            System.out.println(" 6 Display the separate course gradebook");
            System.out.println(" 7 Save gradebook in file");
            System.out.println(" 8 Back");
            System.out.println(" 9 Exit");
            System.out.print("Enter number of commands-->> :");

            try {
                int q = sc.nextInt();
                if (q >= 1 && q <= 9) {
                    switch (q) {

                        case 1:
                            so.showCurseID();
                            System.out.println("*************************************************");
                            break;

                        case 2:
                            so.showStudentID();
                            System.out.println("*************************************************");
                            break;

                        case 3:
                            so.showTeacherID();
                            System.out.println("*************************************************");
                            break;

                        case 4:
                            so.createTask();
                            System.out.println("*************************************************");
                            break;

                        case 5:
                            so.showCurses();
                            System.out.println("*************************************************");
                            break;

                        case 6:
                            so.showJournal();
                            System.out.println("*************************************************");
                            break;

                        case 7:
                            so.saveJournal();
                            System.out.println("*************************************************");
                            break;

                        case 8:
                            break point;

                        case 9:
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
