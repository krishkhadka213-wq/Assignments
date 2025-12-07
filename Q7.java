import java.util.Scanner;

/**
 * Write a description of class Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q7
{
 public static void main(String[] args)
 {
  Scanner scan = new Scanner(System.in);
 
  System.out.println("Enter marked price: ");
  float mp = scan.nextFloat();
 
  System.out.println("Choose a category (A/B/C/D): ");
  char category = scan.next().charAt(0);
 
  double discount = 0;
  float sp =0;
  switch(category){
      case 'A': 
           sp = mp-(mp*60)/100;
      break;
      case 'B':
          sp = mp-(mp*40)/100;
      break;
      case 'C':
          sp = mp-(mp*20)/100;
      break;
      case 'D':
          sp = mp-(mp*10)/100;
      break;
      
      default:
          System.out.println("Please choose a category from(A/B/C/D)");
    }
  
  System.out.println("Final amount: " + sp);
 }
}