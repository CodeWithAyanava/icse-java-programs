/*
 * ====================================================================
 *   Program  : Q_75
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Zodiac Sign from Date of Birth
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to accept the day and month of birth and
 *   display the zodiac (sun) sign according to the table below.
 *   Display "Invalid date" if the day or month is not valid (ignore
 *   leap years; take February as 29 days).
 *
 *       Aries        21 Mar - 19 Apr    Libra        23 Sep - 22 Oct
 *       Taurus       20 Apr - 20 May    Scorpio      23 Oct - 21 Nov
 *       Gemini       21 May - 20 Jun    Sagittarius  22 Nov - 21 Dec
 *       Cancer       21 Jun - 22 Jul    Capricorn    22 Dec - 19 Jan
 *       Leo          23 Jul - 22 Aug    Aquarius     20 Jan - 18 Feb
 *       Virgo        23 Aug - 22 Sep    Pisces       19 Feb - 20 Mar
 * ====================================================================
 */

import java.util.Scanner;

public class Q_75
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day and month of birth: ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int maxDay;

        switch (m)
        {
            case 2:
                maxDay = 29;
                break;
            case 4: case 6: case 9: case 11:
                maxDay = 30;
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                maxDay = 31;
                break;
            default:
                maxDay = 0;
        }

        String sign = "";
        if (d < 1 || d > maxDay)
            sign = "Invalid date";
        else if ((m == 3 && d >= 21) || (m == 4 && d <= 19))
            sign = "Aries";
        else if ((m == 4 && d >= 20) || (m == 5 && d <= 20))
            sign = "Taurus";
        else if ((m == 5 && d >= 21) || (m == 6 && d <= 20))
            sign = "Gemini";
        else if ((m == 6 && d >= 21) || (m == 7 && d <= 22))
            sign = "Cancer";
        else if ((m == 7 && d >= 23) || (m == 8 && d <= 22))
            sign = "Leo";
        else if ((m == 8 && d >= 23) || (m == 9 && d <= 22))
            sign = "Virgo";
        else if ((m == 9 && d >= 23) || (m == 10 && d <= 22))
            sign = "Libra";
        else if ((m == 10 && d >= 23) || (m == 11 && d <= 21))
            sign = "Scorpio";
        else if ((m == 11 && d >= 22) || (m == 12 && d <= 21))
            sign = "Sagittarius";
        else if ((m == 12 && d >= 22) || (m == 1 && d <= 19))
            sign = "Capricorn";
        else if ((m == 1 && d >= 20) || (m == 2 && d <= 18))
            sign = "Aquarius";
        else
            sign = "Pisces";
        System.out.println(sign);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description           |
 * +----------------------+-----------+---------------------------------+
 * | d                    | int       | to store the day of birth       |
 * | m                    | int       | to store the month of birth     |
 * | maxDay               | int       | to store the days in that month |
 * | sign                 | String    | to store the zodiac sign        |
 * +----------------------+-----------+---------------------------------+
 */
