/*
 * ====================================================================
 *   Program  : Q_1
 *   Chapter  : 01 - Introduction to OOP and Java
 *   Title    : Display Student Details using print() and println()
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to store a student's name, class and school in
 *   three String variables. Display the three details on three
 *   separate lines using System.out.println(). Then display all
 *   three details on a single line, separated by commas, using
 *   System.out.print().
 * ====================================================================
 */

public class Q_1
{
    public static void main(String[] args)
    {
        String name = "Aarav Sen";
        String std = "X";
        String school = "Green Valley School";

        System.out.println("Name   : " + name);
        System.out.println("Class  : " + std);
        System.out.println("School : " + school);

        System.out.print(name + ", ");
        System.out.print(std + ", ");
        System.out.print(school);
        System.out.println();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | name                 | String    | to store the name of the student  |
 * | std                  | String    | to store the class of the student |
 * | school               | String    | to store the name of the school   |
 * +----------------------+-----------+-----------------------------------+
 */
