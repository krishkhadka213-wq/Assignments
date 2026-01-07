package Week7;


/**
 * Write a description of class MainClass2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainClass2
{
    public static void main(String[] args)
    {
        Laptop l1 = new Laptop("Dell", 6, 75000);
        Laptop l2 = new Laptop("HP", 8, 60000);
        Laptop l3 = new Laptop("Lenovo", 16, 150000);

        System.out.println("Laptops with RAM greater than 8GB:\n");

        if(l1.RAM > 8)
            System.out.println(l1.brand + " " + l1.RAM + "GB " + l1.price);

        if(l2.RAM > 8)
            System.out.println(l2.brand + " " + l2.RAM + "GB " + l2.price);

        if(l3.RAM > 8)
            System.out.println(l3.brand + " " + l3.RAM + "GB " + l3.price);
    }
}