import java.util.Scanner;

/**
 * Write a description of class Workshop4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshop4
{
    public static void main(String [] args)
    {
      // Q1. 
      
      Scanner sc = new Scanner(System.in);
      
      
      System.out.println("Enter student's marks: ");
      int marks = sc.nextInt();
      
      if(marks >= 40)
      {
          System.out.println("Student has passed an examination");
      }
      else
      {
          System.out.println("Student has failed an examination");
      }
      
      
      //Q2.
      
      System.out.println("Enter a number: ");
      
      int num = sc.nextInt();
      
      if(num % 2 == 0)
      {
        System.out.println("The number is even");
      }
      else
      {
        System.out.println("The number is odd");
      }
      
      
      //Q3. 
      
      System.out.println("Enter a number");
      int n = sc.nextInt();
      
      if(n == 0)
      {
        System.out.println("The number is zero");
      }
      else if(n > 0)
      {
          System.out.println("The number is positive");
      }
      else
      {
        System.out.println("The number is negative");
      }
      
      //Q4.
      
      System.out.println("Enter a number");
      int nu = sc.nextInt();
      
      if(nu % 3 == 0)
      {
        if(nu % 5 == 0)
        {
          System.out.println("The number is divisible by both 3 and 5");
        }
      }
      else
      {
       System.out.println("The number is not divisble by neither 3 nor 5");
      }
      
      //Q5.
      
      System.out.println("Enter a number");
      int numb = sc.nextInt();
      
      if(numb % 3 == 0)
      {
       if(numb % 5 == 0)
       {
        System.out.println("The number is divisible by both 3 and 5");
       }
       else
       {
        System.out.println("The number is divisble by 3");
       }
      }
      else
      {
       if(numb % 5 == 0)
       {
        System.out.println("The number is divisible by 5");
       }
       else
       {
           System.out.println("The number is not divisible by neither 3 nor 5");
       }
      }
    }
}