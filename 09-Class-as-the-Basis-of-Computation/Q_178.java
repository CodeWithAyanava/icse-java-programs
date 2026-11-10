/*
 * ====================================================================
 *   Program  : Q_178
 *   Chapter  : 09 - Class as the Basis of all Computation
 *   Title    : Class BankAccount: Two Objects with Deposit and Withdraw
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class BankAccount (written here as class Q_178) with
 *   the following description:
 *
 *       Data members : String holder; long accNo; double balance
 *       void open(String h, long a, double amt) : to store the details;
 *                      a negative opening amount is stored as 0
 *       void deposit(double amt)  : to add amt to the balance (only if
 *                                   amt is positive)
 *       void withdraw(double amt) : to subtract amt from the balance if
 *                      enough balance is available, otherwise display
 *                      "Insufficient balance"
 *       void display() : to display the account details
 *
 *   In main(), create two account objects and show that each object
 *   keeps its own balance: open account 1 with Rs 5000 and account 2
 *   with Rs 1200, deposit Rs 2500 in account 1, withdraw Rs 2000
 *   from account 2 and withdraw Rs 3000 from account 1. Display both
 *   accounts at the end.
 * ====================================================================
 */

public class Q_178
{
    String holder;
    long accNo;
    double balance;

    void open(String h, long a, double amt)
    {
        holder = h;
        accNo = a;
        if (amt > 0)
            balance = amt;
        else
            balance = 0;
    }

    void deposit(double amt)
    {
        if (amt > 0)
            balance = balance + amt;
    }

    void withdraw(double amt)
    {
        if (amt <= balance)
            balance = balance - amt;
        else
            System.out.println("Insufficient balance in account " + accNo);
    }

    void display()
    {
        System.out.println(accNo + "  " + holder + "  Balance: Rs " + balance);
    }

    public static void main(String[] args)
    {
        Q_178 acc1 = new Q_178();
        Q_178 acc2 = new Q_178();
        acc1.open("Priya Sharma", 1001L, 5000);
        acc2.open("Arjun Mehta", 1002L, 1200);

        acc1.deposit(2500);
        acc2.withdraw(2000);
        acc1.withdraw(3000);

        acc1.display();
        acc2.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | holder               | String    | to store the account holder's name |
 * | accNo                | long      | to store the account number        |
 * | balance              | double    | to store the balance               |
 * | h                    | String    | to receive the holder's name       |
 * | a                    | long      | to receive the account number      |
 * | amt                  | double    | to receive an amount               |
 * | acc1                 | Q_178     | to refer to the first account      |
 * | acc2                 | Q_178     | to refer to the second account     |
 * +----------------------+-----------+------------------------------------+
 */
