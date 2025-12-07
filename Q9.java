import java.util.Scanner;

/**
 * Write a description of class Q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q9
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter GPA: ");
    double gpa = scan.nextDouble();
    
    System.out.println("Enter attendance(in percentage): ");
    int attend = scan.nextInt();
    
    System.out.println("Enter attitude score: ");
    int attitude = scan.nextInt();
    
    if( gpa >= 3.2)
    {
     if(attend > 80)
      {
        if(attitude < 5)
        {
         System.out.println("Is Eligible");
        }
      }
    }
    else
    {
     System.out.println("Not Eligible");
    }
    
  }
}