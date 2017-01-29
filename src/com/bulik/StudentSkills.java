package com.bulik;

import java.util.Scanner;

/**
 * Created by Bulik on 29.01.2017.
 */
public class StudentSkills {
    SystemOperated so = new SystemOperated();

    public void studentSkills() {
        point:
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" 1 Display information about the course by ID");
            System.out.println(" 2 Display the names of all courses");
            System.out.println(" 3 Display information about the student by ID");
            System.out.println(" 4 Display information about the teacher by ID");
            System.out.println(" 5 Display the separate course gradebook");
            System.out.println(" 6 Back");
            System.out.println(" 7 Exit");
            System.out.print("Enter number of commands-->> :");

            try {
                int q = sc.nextInt();
                if (q >= 1 && q <= 7) {
                    switch (q) {

                        case 1:
                            so.showCurseID();
                            System.out.println("*************************************************");
                            break;

                        case 2:
                            so.showOllCurses();
                            System.out.println("*************************************************");
                            break;

                        case 3:
                            so.showStudentID();
                            System.out.println("*************************************************");
                            break;

                        case 4:
                            so.showTeacherID();
                            System.out.println("*************************************************");
                            break;

                        case 5:
                            so.showJournal();
                            System.out.println("*************************************************");
                            break;

                        case 6:
                            break point;

                        case 7:
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
