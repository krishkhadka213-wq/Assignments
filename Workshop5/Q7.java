package Workshop5;
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
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter a number: ");
   int a = sc.nextInt();
   
   System.out.println("Enter second number: ");
   int b = sc.nextInt();
   
   System.out.println("Choose a Arithematic operation(+,-,*,/): ");
   char op = sc.next().charAt(0);
   
   char choice = 'y';
   int sum;
   int diff;
   int mult;
   int div;
   
   while(choice == 'y'){
     switch(op){
       case '+':
           System.out.println("Result: " + (a + b));
       break;
       
       case '-':
           System.out.println("Result: " + (a - b));
       break;
       
       case '*':
           System.out.println("Result: " + (a * b));
       break;
       
       case '/':
           System.out.println("Result: " + (a / b));
       break;
       
       default:
           System.out.println("Choose a correct operator");
    }
    System.out.println("Do you want to continue(y/n)");
   choice = sc.next().charAt(0);
   }
   System.out.println("Program exited.");
 }
}