package Week7;


/**
 * Write a description of class Mainclass3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mainclass3
{
    public static void main(String[] args) {
        Mobiile mobile1 = new Mobiile("Samsung", 80000);
        Mobiile mobile2 = new Mobiile("Apple", 270000);
        Mobiile mobile3 = new Mobiile("Google", 175000);

        System.out.println(mobile1.brand + " is affordable? " + mobile1.isAffordable());
        System.out.println(mobile2.brand + " is affordable? " + mobile2.isAffordable());
        System.out.println(mobile3.brand + " is affordable? " + mobile3.isAffordable());
    }
}