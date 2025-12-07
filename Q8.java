import java.util.Scanner;

/**
 * Write a description of class Q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q8
{
 public static void main(String[] args)
 {
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Enter GPA: ");
   double gpa = scan.nextDouble();
   
   if(gpa<1.2)
   {
    System.out.println("Fail");
   }
   else if(gpa >= 1.2 && gpa <2)
   {
    System.out.println("D grade");
   }
   else if(gpa >= 2 && gpa <2.2)
   {
    System.out.println("C grade");
   }
   else if(gpa >= 2.2 && gpa < 3)
   {
       System.out.println("B grade");
   }
   else if(gpa >=3 && gpa <4)
   {
    System.out.println("A grade");
   }
   else if(gpa == 4)
   {
       System.out.println("A+ grade");
   }
   else{
       System.out.println("Invalid");
   }
 }
}