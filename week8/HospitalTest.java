package week8;


/**
 * Write a description of class HospitalTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalTest
{
    public static void main(String[] args)
    {
        Patient p1 = new Patient("Kakashi", 25, 7, 2500);
        Patient p2 = new Patient("Gojo", 5, 5, 1800);
        
        System.out.println("Patient 1 Details");
        p1.displayPatientInfo();
        System.out.println("Total Bill: " + p1.calculateTotalBill());
        System.out.println();

        System.out.println("=== Patient 2 Details ===");
        p2.displayPatientInfo();
        System.out.println("Total Bill: " + p2.calculateTotalBill());
    }
}