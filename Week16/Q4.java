package Week16;
import java.util.Scanner;


/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String upper = str.toUpperCase();
        System.out.println("Uppercase: " + upper);

        String lower = str.toLowerCase();
        System.out.println("Lowercase: " + lower);

        String[] words = str.split(" ");
        String titleCase = "";

        for (String word : words) 
        {
            if (word.length() > 0) 
            {
                titleCase += word.substring(0, 1).toUpperCase()
                           + word.substring(1).toLowerCase() + " ";
            }
        }

        System.out.println("Title Case: " + titleCase.trim());

        sc.close();
    }
    }