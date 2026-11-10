/*
 * ====================================================================
 *   Program  : Q_28
 *   Chapter  : 04 - Input in Java
 *   Title    : Reading a Full Name with nextLine() after nextInt()
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the age of a person (an integer)
 *   followed by the person's full name (which may contain spaces)
 *   and display them. Show how the leftover new-line character after
 *   nextInt() is removed so that nextLine() reads the name
 *   correctly. Remove any extra spaces at the beginning and end of
 *   the name. If the age is negative, display "Invalid age".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_28
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your full name: ");
        String name = sc.nextLine().trim();

        if (age < 0)
        {
            System.out.println("Invalid age");
        }
        else
        {
            System.out.println("Name : " + name);
            System.out.println("Age  : " + age + " years");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------+
 * | Name of the Variable | Data Type | Purpose / Description  |
 * +----------------------+-----------+------------------------+
 * | age                  | int       | to store the age       |
 * | name                 | String    | to store the full name |
 * +----------------------+-----------+------------------------+
 */
