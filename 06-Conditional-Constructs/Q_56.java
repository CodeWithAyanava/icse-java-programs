/*
 * ====================================================================
 *   Program  : Q_56
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Grade from Percentage
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the percentage of marks of a student
 *   and display the grade according to the following table. Display
 *   "Invalid percentage" if the percentage is not from 0 to 100.
 *
 *       Percentage              Grade
 *       90 and above            A+
 *       80 to less than 90      A
 *       70 to less than 80      B
 *       60 to less than 70      C
 *       50 to less than 60      D
 *       40 to less than 50      E
 *       Below 40                F (Fail)
 * ====================================================================
 */

import java.util.Scanner;

public class Q_56
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the percentage: ");
        double p = sc.nextDouble();

        if (p < 0 || p > 100)
            System.out.println("Invalid percentage");
        else if (p >= 90)
            System.out.println("Grade A+");
        else if (p >= 80)
            System.out.println("Grade A");
        else if (p >= 70)
            System.out.println("Grade B");
        else if (p >= 60)
            System.out.println("Grade C");
        else if (p >= 50)
            System.out.println("Grade D");
        else if (p >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade F (Fail)");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------+
 * | Name of the Variable | Data Type | Purpose / Description   |
 * +----------------------+-----------+-------------------------+
 * | p                    | double    | to store the percentage |
 * +----------------------+-----------+-------------------------+
 */
