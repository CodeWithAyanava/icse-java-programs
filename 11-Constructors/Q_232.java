/*
 * ====================================================================
 *   Program  : Q_232
 *   Chapter  : 11 - Constructors
 *   Title    : Class CloudStorage
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class CloudStorage (written here as class Q_232) with
 *   the following description:
 *
 *       Instance variables:
 *       int acno       : to store the account number
 *       int storage    : to store the storage space used in GB
 *       double bill    : to store the total bill
 *
 *       Member methods:
 *       CloudStorage() : default constructor
 *       void accept()  : to accept the account number and storage space
 *       void calculate() : to calculate the bill (slab by slab):
 *                            First 15 GB          Rs 15 per GB
 *                            Next 15 GB           Rs 13 per GB
 *                            Above 30 GB          Rs 11 per GB
 *                          If the bill exceeds Rs 400, a surcharge of 5%
 *                          is added.
 *       void display() : to display the account number, storage and bill
 *
 *   Write a main method to create an object and call the methods.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_232
{
    int acno, storage;
    double bill;

    Q_232()
    {
        acno = 0;
        storage = 0;
        bill = 0.0;
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        acno = sc.nextInt();
        System.out.print("Enter storage used (GB): ");
        storage = sc.nextInt();
        if (storage < 0)
            storage = 0;
    }

    void calculate()
    {
        if (storage <= 15)
            bill = storage * 15;
        else if (storage <= 30)
            bill = 15 * 15 + (storage - 15) * 13;
        else
            bill = 15 * 15 + 15 * 13 + (storage - 30) * 11;
        if (bill > 400)
            bill = bill + bill * 5 / 100;
    }

    void display()
    {
        System.out.println("Account number : " + acno);
        System.out.println("Storage used   : " + storage + " GB");
        System.out.println("Total bill     : Rs " + bill);
    }

    public static void main(String[] args)
    {
        Q_232 ob = new Q_232();
        ob.accept();
        ob.calculate();
        ob.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description       |
 * +----------------------+-----------+-----------------------------+
 * | acno                 | int       | to store the account number |
 * | storage              | int       | to store the storage used   |
 * | bill                 | double    | to store the bill           |
 * | ob                   | Q_232     | to refer to the object      |
 * +----------------------+-----------+-----------------------------+
 */
