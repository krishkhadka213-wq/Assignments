package Week10;


/**
 * Write a description of class OrderApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderApp
{
     public static void main(String[] args) 
     {

        NormalOrd n1 = new NormalOrd(1, "Rekha", 4000);
        PremiumOrd p1 = new PremiumOrd(2, "Nimesh", 7000);

        System.out.println("Normal Order Invoice");
        System.out.println(n1);
        System.out.println("Final Amount: " + n1.calculateFinalAmount());
        System.out.println("Final Amount (with discount): " +
                n1.calculateFinalAmount(100));

        System.out.println();

        System.out.println("Premium Order Invoice");
        System.out.println(p1);
        System.out.println("Final Amount: " + p1.calculateFinalAmount());
        System.out.println("Final Amount (with discount): " +
                p1.calculateFinalAmount(200));
    }
}