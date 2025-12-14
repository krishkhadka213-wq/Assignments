package Workshop5;
import java.util.Scanner;


/**
 * Write a description of class Scenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scenario
{
 public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        boolean another = true;
        
        while (another)
        {
            System.out.println("Enter FD details: ");
            System.out.print("  Principal (Rs.): ");
            double P = sc.nextDouble();
            
            if (P < 1000)
            {
                System.out.println("Minimum deposit is Rs. 1,000");
            }
            
            System.out.print("Annual Rate (8-12%): ");
            double R = sc.nextDouble();
            
            if (R < 8 || R > 12)
            {
                System.out.println("Rate must be between 8% and 12%");
            }
            
            System.out.print("  Duration (1-5 years): ");
            int T = sc.nextInt();
            
            if (T < 1 || T > 5)
            {
                System.out.println("Duration must be 1-5 years");
            }
            
            
            double r = R / 100 / 12;
            int n = T * 12;          
            
            
            double A = P * Math.pow(1 + r, n);
            
            
            double fee = A * 0.005;
            double finalAmt = A - fee;
            
        
            System.out.println("Deposit Amount: Rs."+ P);
            System.out.println("Interest Rate: " + R);
            System.out.println("Duration:" + T);
            System.out.println("Maturity Amount:Rs." + A);
            System.out.println("Processing Fee:Rs." + fee);
            System.out.println("Final amount:Rs." + finalAmt);    
        }
    }
}
