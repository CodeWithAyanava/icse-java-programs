/*
 * ====================================================================
 *   Program  : Q_227
 *   Chapter  : 11 - Constructors
 *   Title    : Class Student: Stream Allocation
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Student (written here as class Q_227) with the
 *   following description:
 *
 *       Instance variables:
 *       String name; int age; int m1, m2, m3; int maximum; double average
 *
 *       Member methods:
 *       Student()    : default constructor
 *       void acceptDetails() : to accept the name, age and marks in three
 *                              subjects
 *       void compute() : to compute the average and the maximum of the
 *                        three marks
 *       void display() : to display the name, age, marks, maximum and
 *                        average, and the stream allotted as per the table:
 *                          Average marks         Stream
 *                          90 and above          Science with Computers
 *                          80 to below 90        Science with Biology
 *                          70 to below 80        Commerce with Mathematics
 *                          60 to below 70        Commerce
 *                          Below 60              Humanities
 *
 *   Write a main method to create an object and call the member
 *   methods.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_227
{
    String name;
    int age, m1, m2, m3, maximum;
    double average;

    Q_227()
    {
        name = "";
        age = 0;
        m1 = 0;
        m2 = 0;
        m3 = 0;
        maximum = 0;
        average = 0.0;
    }

    void acceptDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter marks in three subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }

    void compute()
    {
        average = (m1 + m2 + m3) / 3.0;
        maximum = Math.max(m1, Math.max(m2, m3));
    }

    void display()
    {
        String stream;
        if (average >= 90)
            stream = "Science with Computers";
        else if (average >= 80)
            stream = "Science with Biology";
        else if (average >= 70)
            stream = "Commerce with Mathematics";
        else if (average >= 60)
            stream = "Commerce";
        else
            stream = "Humanities";

        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Marks   : " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Maximum : " + maximum);
        System.out.println("Average : " + Math.round(average * 100) / 100.0);
        System.out.println("Stream  : " + stream);
    }

    public static void main(String[] args)
    {
        Q_227 ob = new Q_227();
        ob.acceptDetails();
        ob.compute();
        ob.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | name                 | String    | to store the student's name  |
 * | age                  | int       | to store the age             |
 * | m1                   | int       | to store marks in subject 1  |
 * | m2                   | int       | to store marks in subject 2  |
 * | m3                   | int       | to store marks in subject 3  |
 * | maximum              | int       | to store the highest marks   |
 * | average              | double    | to store the average marks   |
 * | stream               | String    | to store the stream allotted |
 * | ob                   | Q_227     | to refer to the object       |
 * +----------------------+-----------+------------------------------+
 */
