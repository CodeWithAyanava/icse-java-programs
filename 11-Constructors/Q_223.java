/*
 * ====================================================================
 *   Program  : Q_223
 *   Chapter  : 11 - Constructors
 *   Title    : Class FruitJuice
 *   Class    : FruitJuice   (compile: javac Q_223.java   run: java FruitJuice)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class called FruitJuice with the following description:
 *
 *       Instance variables:
 *       int product_code     : stores the product code number
 *       String flavour       : stores the flavour of the juice
 *                              (e.g. orange, apple)
 *       String pack_type     : stores the type of packaging (e.g. tetra
 *                              pack, PET bottle)
 *       int pack_size        : stores the package size (e.g. 200 ml)
 *       int product_price    : stores the price of the product
 *
 *       Member methods:
 *       FruitJuice()   : default constructor to initialise integer data
 *                        members to 0 and String data members to ""
 *       void input()   : to input and store the product code, flavour,
 *                        pack type, pack size and product price
 *       void discount(): to reduce the product price by 10
 *       void display() : to display the product code, flavour, pack type,
 *                        pack size and product price
 *
 *   Write a main method to create an object and call the member
 *   methods.
 * ====================================================================
 */

import java.util.Scanner;

class FruitJuice
{
    int product_code;
    String flavour;
    String pack_type;
    int pack_size;
    int product_price;

    FruitJuice()
    {
        product_code = 0;
        flavour = "";
        pack_type = "";
        pack_size = 0;
        product_price = 0;
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product code: ");
        product_code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter flavour: ");
        flavour = sc.nextLine();
        System.out.print("Enter pack type: ");
        pack_type = sc.nextLine();
        System.out.print("Enter pack size (ml): ");
        pack_size = sc.nextInt();
        System.out.print("Enter product price: ");
        product_price = sc.nextInt();
    }

    void discount()
    {
        product_price = product_price - 10;
        if (product_price < 0)
            product_price = 0;
    }

    void display()
    {
        System.out.println("Product code  : " + product_code);
        System.out.println("Flavour       : " + flavour);
        System.out.println("Pack type     : " + pack_type);
        System.out.println("Pack size     : " + pack_size + " ml");
        System.out.println("Product price : Rs " + product_price);
    }

    public static void main(String[] args)
    {
        FruitJuice ob = new FruitJuice();
        ob.input();
        ob.discount();
        ob.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+------------+--------------------------------+
 * | Name of the Variable | Data Type  | Purpose / Description          |
 * +----------------------+------------+--------------------------------+
 * | product_code         | int        | to store the product code      |
 * | flavour              | String     | to store the flavour           |
 * | pack_type            | String     | to store the type of packaging |
 * | pack_size            | int        | to store the package size      |
 * | product_price        | int        | to store the price             |
 * | ob                   | FruitJuice | to refer to the object         |
 * +----------------------+------------+--------------------------------+
 */
