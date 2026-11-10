/*
 * ====================================================================
 *   Program  : Q_276
 *   Chapter  : 14 - Arrays
 *   Title    : Topper from Parallel Arrays of Names and Marks
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the names and the total marks of n
 *   students in two parallel arrays. Display the name and marks of
 *   the student with the highest marks (all students in case of a
 *   tie) and the class average.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_276
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
        String name[] = new String[n];
        double marks[] = new double[n];
        for (int i = 0; i < n; i++)
        {
            sc.nextLine();
            System.out.print("Name of student " + (i + 1) + ": ");
            name[i] = sc.nextLine();
            System.out.print("Marks: ");
            marks[i] = sc.nextDouble();
        }

        double max = marks[0], sum = 0;
        for (int i = 0; i < n; i++)
        {
            if (marks[i] > max)
                max = marks[i];
            sum = sum + marks[i];
        }
        System.out.println("Highest marks: " + max);
        for (int i = 0; i < n; i++)
        {
            if (marks[i] == max)
                System.out.println("Topper: " + name[i]);
        }
        System.out.println("Class average: " + (sum / n));
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description           |
 * +----------------------+-----------+---------------------------------+
 * | n                    | int       | to store the number of students |
 * | name                 | String[]  | to store the names              |
 * | marks                | double[]  | to store the marks              |
 * | i                    | int       | to act as the index             |
 * | max                  | double    | to store the highest marks      |
 * | sum                  | double    | to store the total of all marks |
 * +----------------------+-----------+---------------------------------+
 */
