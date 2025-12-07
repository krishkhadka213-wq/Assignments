import java.util.Scanner;

/**
 * Write a description of class Q10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q10
{
 public static void main(String[] args)
 {
     Scanner scan = new Scanner(System.in);
     
     System.out.println("Enter a paper size(From 1-6): ");
     int size = scan.nextInt();
     
     switch(size){
         case 1:
             System.out.println("A0: 841 x 1189 mm(33.1 x 46.8 inches)");
             break;
         case 2:
             System.out.println("A1: 594 x 841 mm(23.4 x 33.1 inches");
             break;
         case 3:
             System.out.println("A2: 420 x 594 mm(16.5 x 23.4 inches)");
             break;
         case 4:
             System.out.println("A3: 297 x 420 mm(11.7 x 16.5 inches");
             break;
         case 5:
             System.out.println("A4: 210 x 297 mm(8.3 x 11.7 inches)");
             break;
         case 6:
             System.out.println("A5: 148 x 210 mm(5.8 x 8.3 inches)");
             break;
         default:
             System.out.println("Please enter a valid size from 1-6");         
             
     }
     
 }
}