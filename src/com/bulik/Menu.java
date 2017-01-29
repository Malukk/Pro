package com.bulik;

import java.util.Scanner;

/**
 * Created by Bulik on 29.01.2017.
 */
public class Menu {
    TeacherSkills ts = new TeacherSkills();
    StudentSkills ss = new StudentSkills();
    AdminSkills as= new AdminSkills();
    //SystemOperated so = new SystemOperated();
    Scanner scanner = new Scanner(System.in);
    public void go(){
        while (true) {
            System.out.println("Select the user :");
            System.out.println(" 1 Administrator :");
            System.out.println(" 2 Teacher :");
            System.out.println(" 3 Student :");
            System.out.print("Enter number of commands-->> :");

            try {
                int q = scanner.nextInt();
                if (q >= 1 && q <= 3) {

                    switch (q) {
                        case 1:
                            System.out.println("Administrator");
                            as.adminSkills();
                            break;
                        case 2:
                            System.out.println("Teacher");
                            ts.teacherSkills();
                            break;
                        case 3:
                            System.out.println("Student");
                            ss.studentSkills();
                            break;

                    }
                } else {
                    System.out.println("Error, try again...");
                    System.out.println("*********************************");

                }
            } catch (Exception e) {
                System.out.println("Error, try again.");
                System.out.println("*****************************************************");
                String wer = scanner.nextLine();

            }


        }

    }

}

