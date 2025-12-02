import java.util.Scanner;

/**
 * Write a description of class Workshop1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshop1
{
  public static void main(String[] args)
  {
      // Question 1. Java program to display Helllo world
         System.out.println("Hello,world");
      
      // Q2) Program to display My Namme is : and Your Full name
         Scanner scanner = new Scanner(System.in);
         System.out.println("My name is:");
         String name = scanner.nextLine();
         
         System.out.println("Your full-name " +name);        
       
      
      
  }
}