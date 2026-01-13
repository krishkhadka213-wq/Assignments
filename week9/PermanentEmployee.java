package week9;


/**
 * Write a description of class PermanentEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PermanentEmployee extends Employees
{
    private double HRA;
    private double DA;

    public PermanentEmployee(int employeeId, String name, double basicSalary,
                             double hra, double da) {
        super(employeeId, name, basicSalary);
        this.HRA = hra;
        this.DA = da;
    }

    public double calculateTotalSalary() {
        return BasicSalary + HRA + DA + calculateBonus();
    }
}