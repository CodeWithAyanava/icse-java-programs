/*
 * ====================================================================
 *   Program  : Q_45
 *   Chapter  : 05 - Mathematical Library Methods
 *   Title    : Four-Digit OTP Generator
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Banks and apps send a One-Time Password (OTP) to verify
 *   a user. Write a program to generate and display a random four-
 *   digit OTP (from 1000 to 9999) using Math.random(). Then accept
 *   the OTP from the user and display "OTP verified" if it matches,
 *   otherwise "Incorrect OTP".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_45
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int otp = 1000 + (int) (Math.random() * 9000);
        System.out.println("Your OTP is " + otp);
        System.out.print("Enter the OTP: ");
        int entered = sc.nextInt();
        if (entered == otp)
            System.out.println("OTP verified");
        else
            System.out.println("Incorrect OTP");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | otp                  | int       | to store the generated otp         |
 * | entered              | int       | to store the otp typed by the user |
 * +----------------------+-----------+------------------------------------+
 */
