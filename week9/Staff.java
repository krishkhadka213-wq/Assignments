package week9;


/**
 * Write a description of class Staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staff extends Person
{
    int workingHours;
    double ratePerHour;

    Staff(int Id, String Name, int workingHours, double ratePerHour)
    {
        super(Id, Name, 0);
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }

    double calculateSalary()
    {
        return workingHours * ratePerHour;
    }
}