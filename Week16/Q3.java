package Week16;
import java.util.Scanner;


/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
    
        System.out.print("Enter index to retrieve character: ");
        int index = sc.nextInt();

        if (index >= 0 && index < str.length()) {
            char ch = str.charAt(index);
            System.out.println("Character at index " + index + " is: " + ch);
        } else {
            System.out.println("Invalid index!");
        }

        System.out.print("Enter a character to find: ");
        char searchChar = sc.next().charAt(0);

        int charPos = str.indexOf(searchChar);
        if (charPos != -1) {
            System.out.println("First occurrence of '" + searchChar + "' is at index: " + charPos);
        } else {
            System.out.println("Character not found.");
        }

        sc.nextLine();

        System.out.print("Enter a word to search: ");
        String word = sc.nextLine();

        if (str.contains(word)) {
            int wordPos = str.indexOf(word);
            System.out.println("Word found at index: " + wordPos);
        } else {
            System.out.println("Word not found in the string.");
        }

        sc.close();
    }
}
