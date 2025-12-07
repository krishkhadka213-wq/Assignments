import java.util.Scanner;

/**
 * Write a description of class Q11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q11
{
 public static void main(String[] args)
  {
      
   Scanner scan = new Scanner(System.in);
 
   System.out.println("Enter Annual income: ");
   int income = scan.nextInt();
   int tax = 0;
   if(income <= 500000)
     {
      tax = (income*1)/100;
     }
   else if(income > 500001 && income <= 700000)
   {
    tax = (income*10)/100;
   }
   else if(income > 700001 && income <= 1000000)
   {
    tax = (income*20)/100;
   }
   else if(income > 1000001 && income <= 2000000)
   {
    tax = (income*30)/100;
   }
   else if(income > 2000001 && income <= 5000000)
   {
    tax = (income*36)/100;
   }
   else if(income > 5000000)
   {
    tax = (income*39)/100;
   }
   else
   {
    System.out.println("Invalid input");
   }
   System.out.println("Total taxable income:" + tax);
}
}