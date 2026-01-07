package week8;


/**
 * Write a description of class Patient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Patient
{
    private String PatientName;
    private int Age;
    private int DaysAdmitted;
    private double DailyCharge;

    public Patient(String Name, int age, int daysAdmitted, double dailyCharge)
    {
        this.PatientName = Name;
        this.Age = age;
        this.DaysAdmitted = daysAdmitted;
        this.DailyCharge = dailyCharge;
    }

    public int getDaysAdmitted() {
        return DaysAdmitted;
    }

    public void setDaysAdmitted(int daysAdmitted) {
        if (daysAdmitted >= 0) {
            this.DaysAdmitted = daysAdmitted;
        } else {
            System.out.println("Days admitted cannot be negative.");
        }
    }

    public double calculateTotalBill() {
        double totalBill = DaysAdmitted * DailyCharge;
        if (DaysAdmitted > 7) {
            totalBill = totalBill - (totalBill * 0.10);
        }
        return totalBill;
    }

    public void displayPatientInfo() {
        System.out.println("Patient Name: " + PatientName);
        System.out.println("Age: " + Age);
        System.out.println("Days Admitted: " + DaysAdmitted);
        System.out.println("Daily Charge: " + DailyCharge);
    }
}