/*
 * ====================================================================
 *   Program  : Q_58
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Telephone Bill with Monthly Rent
 * --------------------------------------------------------------------
 *   Question :
 *
 *   A telephone company charges a fixed monthly rent of Rs 180 and
 *   charges for calls as follows (slab by slab):
 *
 *       First 100 calls          Free
 *       Next 100 calls           Rs 1.00 per call
 *       Next 200 calls           Rs 0.80 per call
 *       Above 400 calls          Rs 0.60 per call
 *
 *   Write a program to input the number of calls made in a month and
 *   display the total bill. Display "Invalid input" for a negative
 *   number of calls.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_58
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of calls: ");
        int calls = sc.nextInt();
        final double RENT = 180;
        double charge;

        if (calls < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            if (calls <= 100)
                charge = 0;
            else if (calls <= 200)
                charge = (calls - 100) * 1.0;
            else if (calls <= 400)
                charge = 100 * 1.0 + (calls - 200) * 0.80;
            else
                charge = 100 * 1.0 + 200 * 0.80 + (calls - 400) * 0.60;
            System.out.println("Call charges = Rs " + charge);
            System.out.println("Total bill   = Rs " + (RENT + charge));
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description           |
 * +----------------------+-----------+---------------------------------+
 * | calls                | int       | to store the number of calls    |
 * | RENT                 | double    | to store the fixed monthly rent |
 * | charge               | double    | to store the call charges       |
 * +----------------------+-----------+---------------------------------+
 */
