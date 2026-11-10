/*
 * ====================================================================
 *   Program  : Q_298
 *   Chapter  : 14 - Arrays
 *   Title    : Marks Matrix: Totals and Averages of Students
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to store the marks of n students in 4 subjects
 *   in a double dimensional array (one row per student). Display,
 *   for each student, the four marks, the total and the average, and
 *   display the highest total in the class.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_298
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        if (n < 1)
        {
            System.out.println("Invalid size");
            return;
        }
        int marks[][] = new int[n][4];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Marks of student " + (i + 1) + " in 4 subjects: ");
            for (int j = 0; j < 4; j++)
                marks[i][j] = sc.nextInt();
        }

        int high = 0;
        System.out.println("Student\tS1\tS2\tS3\tS4\tTotal\tAverage");
        for (int i = 0; i < n; i++)
        {
            int total = 0;
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 4; j++)
            {
                System.out.print(marks[i][j] + "\t");
                total = total + marks[i][j];
            }
            System.out.println(total + "\t" + (total / 4.0));
            if (i == 0 || total > high)
                high = total;
        }
        System.out.println("Highest total = " + high);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description           |
 * +----------------------+-----------+---------------------------------+
 * | n                    | int       | to store the number of students |
 * | marks                | int[][]   | to store the marks              |
 * | i                    | int       | to act as the student index     |
 * | j                    | int       | to act as the subject index     |
 * | high                 | int       | to store the highest total      |
 * | total                | int       | to store a student's total      |
 * +----------------------+-----------+---------------------------------+
 */
