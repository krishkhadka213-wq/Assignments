package Workshop5;
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
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        
        if (num < 0) {
            System.out.println("Please enter a positive number!");
            return;
        }
        
        int reverse = 0;
        int temp = num;
        
        
        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }
        
        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + reverse);
    }
}
