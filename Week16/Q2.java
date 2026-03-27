package Week16;
import java.util.Scanner;

public class Q2
{
   public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String trimmed = input.trim();
        System.out.println("After trim(): " + trimmed);
        
        if (trimmed.length() >= 10) {
            String firstTen = trimmed.substring(0, 10);
            System.out.println("First 10 characters: " + firstTen);
        } else {
            System.out.println("String has less than 10 characters: " + trimmed);
        }
        
        String[] words = trimmed.split("\\s+");
        
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }
        
        scanner.close();
   }
}
