/*
 * ====================================================================
 *   Program  : Q_279
 *   Chapter  : 14 - Arrays
 *   Title    : Sort Students by Marks Keeping Names Aligned
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the names and marks of n students in
 *   two parallel arrays and arrange them in descending order of
 *   marks using the selection sort technique. Whenever two marks are
 *   interchanged, interchange the corresponding names too, so that
 *   every name stays with its marks. Display the merit list with
 *   ranks. If the size entered is less than 1, display "Invalid
 *   size".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_279
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
        int marks[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            sc.nextLine();
            System.out.print("Name: ");
            name[i] = sc.nextLine();
            System.out.print("Marks: ");
            marks[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++)
        {
            int max = i;
            for (int j = i + 1; j < n; j++)
            {
                if (marks[j] > marks[max])
                    max = j;
            }
            int t = marks[i];
            marks[i] = marks[max];
            marks[max] = t;
            String s = name[i];
            name[i] = name[max];
            name[max] = s;
        }

        System.out.println("Rank\tMarks\tName");
        for (int i = 0; i < n; i++)
            System.out.println((i + 1) + "\t" + marks[i] + "\t" + name[i]);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                   |
 * +----------------------+-----------+-----------------------------------------+
 * | n                    | int       | to store the number of students         |
 * | name                 | String[]  | to store the names                      |
 * | marks                | int[]     | to store the marks                      |
 * | i                    | int       | to mark the position being filled       |
 * | max                  | int       | to store the index of the highest marks |
 * | j                    | int       | to act as the search index              |
 * | t                    | int       | to hold marks while swapping            |
 * | s                    | String    | to hold a name while swapping           |
 * +----------------------+-----------+-----------------------------------------+
 */
