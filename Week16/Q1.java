package Week16;
import java.util.Scanner;


/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter  First Name: ");
        
        String Fname = s.nextLine();
        
        System.out.println("Enter last Name: ");
        
        String Lname = s.nextLine();
        
        String FuName = Fname.concat(Lname);
        
        System.out.println("The concatenation of the two strings is: " + FuName);  
        
    }
}