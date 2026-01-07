package Week7;


/**
 * Write a description of class mainClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mainClass
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 20;

        Rectangle r2 = new Rectangle();
        r2.length = 12;
        r2.breadth = 15;

        System.out.println("Rectangle 1:");
        System.out.println("Length = " + r1.length);
        System.out.println("Breadth = " + r1.breadth);
        System.out.println("Area = " + (r1.length * r1.breadth));

        System.out.println();

        System.out.println("Rectangle 2:");
        System.out.println("Length = " + r2.length);
        System.out.println("Breadth = " + r2.breadth);
        System.out.println("Area = " + (r2.length * r2.breadth));
    }
    }