/*
 * ====================================================================
 *   Program  : Q_23
 *   Chapter  : 03 - Operators in Java
 *   Title    : Total, Average and Percentage of Five Subjects
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the marks obtained by a student in
 *   five subjects (each out of 100) and calculate the total marks,
 *   the average marks and the percentage. Display "Invalid marks" if
 *   any mark is outside the range 0 to 100.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in five subjects:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        boolean valid = m1 >= 0 && m1 <= 100 && m2 >= 0 && m2 <= 100
                     && m3 >= 0 && m3 <= 100 && m4 >= 0 && m4 <= 100
                     && m5 >= 0 && m5 <= 100;
        if (!valid)
        {
            System.out.println("Invalid marks");
        }
        else
        {
            int total = m1 + m2 + m3 + m4 + m5;
            double avg = total / 5.0;
            double per = total * 100.0 / 500;
            System.out.println("Total      = " + total);
            System.out.println("Average    = " + avg);
            System.out.println("Percentage = " + per + "%");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | m1                   | int       | to store marks in subject 1       |
 * | m2                   | int       | to store marks in subject 2       |
 * | m3                   | int       | to store marks in subject 3       |
 * | m4                   | int       | to store marks in subject 4       |
 * | m5                   | int       | to store marks in subject 5       |
 * | valid                | boolean   | to check that all marks are valid |
 * | total                | int       | to store the total marks          |
 * | avg                  | double    | to store the average marks        |
 * | per                  | double    | to store the percentage           |
 * +----------------------+-----------+-----------------------------------+
 */
