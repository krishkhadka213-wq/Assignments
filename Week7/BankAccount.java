package Week7;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accNum, String Holder, double initialBal)
    {
        this.accountNumber = accNum;
        this.accountHolder = Holder;
        this.balance = initialBal;
    }

    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount)
    {
        if(amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        }
        else
        {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayAccountInfo()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}