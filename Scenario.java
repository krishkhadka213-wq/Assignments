import java.util.Scanner;

/**
 * Write a description of class Scenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scenario
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        System.out.print("Enter age group (C = Child, A = Adult, S = Senior): ");
        char ageGroup = sc.next().charAt(0);

        System.out.print("Enter movie language (N = Nepali, H = Hindi, E = English): ");
        char language = sc.next().charAt(0);

        System.out.print("Do you have a student ID? (Y/N): ");
        char student = sc.next().charAt(0);

        System.out.print("Is it a festival day? (Y/N): ");
        char festival = sc.next().charAt(0);

        float basePrice = 0;

        // Base price by age
        if (ageGroup == 'C')
        {
            basePrice = 150;
        } 
        else if (ageGroup == 'A')
        {
            basePrice = 250;
        } 
        else if (ageGroup == 'S')
        {
            basePrice = 200;
        } 
        else 
        {
            System.out.println("Invalid age group!");       
        }

        // Surcharge by movie language
        if (language == 'H' || language == 'h') {
            basePrice += 50;
        } 
        else if (language == 'E' || language == 'e') {
            basePrice += 100;
        }

        float finalPrice = basePrice;

        // Apply Student Discount (20%)
        if (student == 'Y')
        {
            finalPrice -= finalPrice * 0.20f;
        }

        // Apply Festival Discount (15%) 
        if (festival == 'Y') 
        {
            finalPrice -= finalPrice * 0.15f;
        }

        // Output
        System.out.println("----------------------------");
        System.out.println("Base Price After Surcharge: Rs. " + basePrice);
        System.out.println("Final Ticket Price: Rs. " + finalPrice);
        System.out.println("----------------------------");
    }
}
