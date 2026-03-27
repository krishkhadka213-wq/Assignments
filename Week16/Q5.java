package Week16;
import java.util.Scanner;


/**
 * Write a description of class Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial string: ");
        String first = sc.nextLine();

        StringBuilder sb = new StringBuilder(first);

        System.out.print("Enter second string: ");
        String second = sc.nextLine();
        sb.append(second);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        sb.append(num);

        System.out.print("Enter a special character: ");
        char ch = sc.next().charAt(0);
        sb.append(ch);

        // 4. Print final string
        System.out.println("Final modified string: " + sb.toString());

        sc.close();
    }
}