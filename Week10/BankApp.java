package Week10;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp
{
     public static void main(String[] args) {

        SavingAcc sa = new SavingAcc(1, "Shiva", 60000);
        CurrentAcc ca = new CurrentAcc(1, "Maya", 40000);

        System.out.println(sa);
        System.out.println("Savings Interest: " + sa.calculateInterest());
        System.out.println("Savings Interest (custom rate): " + sa.calculateInterest(0.06));

        System.out.println();

        System.out.println(ca);
        System.out.println("Current Interest: " + ca.calculateInterest());
        System.out.println("Current Interest (custom rate): " + ca.calculateInterest(0.03));
    }
}