import java.util.Scanner;

/**
 * Write a description of class Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q6
{
 public static void main(String[] args)
 {
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Enter marked price: ");
   float mp = scan.nextFloat();
   
   System.out.println("Enter a category(A/B/C/D): ");
   char category = scan.next().charAt(0);
   
   float discount =0;
   if(category == 'A')
   {
    discount = 60;
   }
   else if(category == 'B')
   {
    discount = 40;   
   }
   else if(category == 'C')
   {
    discount = 20;
   }
   else if(category == 'D')
   {
    discount = 10;
   }
   else
   {
    System.out.println("Invalid category, please choose from (A/B/C/D)");
   }
   float sp = mp-(mp*discount)/100;
   
   System.out.println("Discount percentage: " + discount +"%");
   System.out.println("Final selling price= " + sp);
   
 }
}