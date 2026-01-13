package week9;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp
{
    public static void main(String[] args) {

        SavingAcc sa =
                new SavingAcc(23, "Ryu", 80000, 15);

        System.out.println("Saving Account");
        sa.deposit(18000);
        System.out.println("Balance      : " + sa.getBalance());
        System.out.println("Interest     : " + sa.calculateInterest());

        System.out.println();

        // Current Account object
        CurrentAcc ca =
                new CurrentAcc(12, "Sasuke", 80000, 26000);

        System.out.println("Current Account");
        ca.deposit(4000);
        ca.withdraw(49000);
        System.out.println("Balance      : " + ca.getBalance());
    }
}