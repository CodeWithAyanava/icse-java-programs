/*
 * ====================================================================
 *   Program  : Q_254
 *   Chapter  : 13 - Encapsulation
 *   Title    : BankAccount with a Private, Validated Balance
 *   Class    : BankAccount  (file BankAccount.java)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class BankAccount in which the balance cannot be
 *   changed directly from outside the class:
 *
 *       private long accNo; private String holder; private double balance
 *       BankAccount(long a, String h)  : constructor, balance starts at 0
 *       public boolean deposit(double amt)  : adds amt if it is positive
 *                                             and returns true, else false
 *       public boolean withdraw(double amt) : subtracts amt only if it is
 *                                             positive and not more than
 *                                             the balance; returns true on
 *                                             success, else false
 *       public double getBalance()          : returns the balance
 *       public void statement()             : displays the details
 *
 *   In main(), create an account and perform the transactions:
 *   deposit 5000, withdraw 1200, withdraw 10000, deposit -50,
 *   withdraw 0. Display "Success" or "Rejected" for each and the
 *   final statement.
 * ====================================================================
 */

public class BankAccount
{
    private long accNo;
    private String holder;
    private double balance;

    BankAccount(long a, String h)
    {
        accNo = a;
        holder = h;
        balance = 0;
    }

    public boolean deposit(double amt)
    {
        if (amt <= 0)
            return false;
        balance = balance + amt;
        return true;
    }

    public boolean withdraw(double amt)
    {
        if (amt <= 0 || amt > balance)
            return false;
        balance = balance - amt;
        return true;
    }

    public double getBalance()
    {
        return balance;
    }

    public void statement()
    {
        System.out.println("Account " + accNo + " (" + holder + ") balance: Rs " + balance);
    }

    public static void main(String[] args)
    {
        BankAccount acc = new BankAccount(20261001L, "Megha Kar");
        System.out.println("Deposit 5000     : " + (acc.deposit(5000) ? "Success" : "Rejected"));
        System.out.println("Withdraw 1200    : " + (acc.withdraw(1200) ? "Success" : "Rejected"));
        System.out.println("Withdraw 10000   : " + (acc.withdraw(10000) ? "Success" : "Rejected"));
        System.out.println("Deposit -50      : " + (acc.deposit(-50) ? "Success" : "Rejected"));
        System.out.println("Withdraw 0       : " + (acc.withdraw(0) ? "Success" : "Rejected"));
        acc.statement();
        System.out.println("getBalance()     : " + acc.getBalance());
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-------------+--------------------------------+
 * | Name of the Variable | Data Type   | Purpose / Description          |
 * +----------------------+-------------+--------------------------------+
 * | accNo                | long        | to store the account number    |
 * | holder               | String      | to store the holder's name     |
 * | balance              | double      | to store the balance           |
 * | a                    | long        | to receive the account number  |
 * | h                    | String      | to receive the holder's name   |
 * | amt                  | double      | to receive the amount          |
 * | acc                  | BankAccount | to refer to the account object |
 * +----------------------+-------------+--------------------------------+
 */
