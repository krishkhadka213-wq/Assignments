package Week6;
import java.util.Scanner;


/**
 * Write a description of class Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q5
{
 public static void main(String[] arg)
 {
   String[] names = {"Morang", "Kathmandu","Kaski","Sindhuli"};
   
   for(int i= 0; i< names.length; i++)
   {
       System.out.println((i+1)+ "."+ names[i]);
   }
  
   
   
   
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter length: ");
   int len = sc.nextInt();
   
   for(int i = 0; i<len; i++)
   {
    System.out.println(names[i]);   
   }
   }
}