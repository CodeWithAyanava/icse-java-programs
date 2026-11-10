/*
 * ====================================================================
 *   Program  : Q_278
 *   Chapter  : 14 - Arrays
 *   Title    : Totals and Grades from Three Subject Arrays
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the marks of n students in three
 *   subjects (English, Maths and Science) in three separate arrays.
 *   Calculate each student's average and assign a grade (average >=
 *   80: A, >= 60: B, >= 40: C, below 40: D). Display a table with
 *   roll number (1 to n), the three marks, the average and the
 *   grade, and finally the class average for each subject.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_278
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
        int eng[] = new int[n];
        int mat[] = new int[n];
        int sci[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Marks of student " + (i + 1) + " (Eng Maths Sci): ");
            eng[i] = sc.nextInt();
            mat[i] = sc.nextInt();
            sci[i] = sc.nextInt();
        }

        System.out.println("Roll\tEng\tMaths\tSci\tAvg\tGrade");
        int sE = 0, sM = 0, sS = 0;
        for (int i = 0; i < n; i++)
        {
            double avg = (eng[i] + mat[i] + sci[i]) / 3.0;
            char g;
            if (avg >= 80)
                g = 'A';
            else if (avg >= 60)
                g = 'B';
            else if (avg >= 40)
                g = 'C';
            else
                g = 'D';
            System.out.println((i + 1) + "\t" + eng[i] + "\t" + mat[i] + "\t" + sci[i] + "\t"
                               + Math.round(avg * 10) / 10.0 + "\t" + g);
            sE = sE + eng[i];
            sM = sM + mat[i];
            sS = sS + sci[i];
        }
        System.out.println("Subject averages: Eng " + (double) sE / n + ", Maths " + (double) sM / n + ", Sci " + (double) sS / n);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description               |
 * +----------------------+-----------+-------------------------------------+
 * | n                    | int       | to store the number of students     |
 * | eng                  | int[]     | to store the english marks          |
 * | mat                  | int[]     | to store the maths marks            |
 * | sci                  | int[]     | to store the science marks          |
 * | i                    | int       | to act as the index                 |
 * | sE                   | int       | to store the total of english marks |
 * | sM                   | int       | to store the total of maths marks   |
 * | sS                   | int       | to store the total of science marks |
 * | avg                  | double    | to store a student's average        |
 * | g                    | char      | to store the grade                  |
 * +----------------------+-----------+-------------------------------------+
 */
