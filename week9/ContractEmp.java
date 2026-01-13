package week9;


/**
 * Write a description of class ContractEmp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContractEmp extends Employees
{
    private int workingDays;

    public ContractEmp(int employeeId, String name, double basicSalary, int workingDays)
    {
        super(employeeId, name, basicSalary);
        this.workingDays = workingDays;
    }

    // Calculate total salary
    public double calculateTotalSalary() {
        return BasicSalary * workingDays;
    }

}