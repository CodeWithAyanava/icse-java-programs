/*
 * ====================================================================
 *   Program  : Q_67
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Eligibility to Vote
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the name and the age of a person and
 *   check whether the person is eligible to vote (age 18 years or
 *   above). Display "<name> is eligible to vote" or "<name> is not
 *   eligible to vote". Display "Invalid age" for a negative age.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_67
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        if (age < 0)
            System.out.println("Invalid age");
        else if (age >= 18)
            System.out.println(name + " is eligible to vote");
        else
            System.out.println(name + " is not eligible to vote");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------+
 * | Name of the Variable | Data Type | Purpose / Description |
 * +----------------------+-----------+-----------------------+
 * | name                 | String    | to store the name     |
 * | age                  | int       | to store the age      |
 * +----------------------+-----------+-----------------------+
 */
