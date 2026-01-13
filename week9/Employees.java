package week9;


/**
 * Write a description of class Employees here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employees
{
    protected int EmployeeId;
    protected String Name;
    protected double BasicSalary;

    
    public Employees(int EmployeeId, String Name, double BasicSalary) {
        this.EmployeeId = EmployeeId;
        this.Name = Name;
        this.BasicSalary = BasicSalary;
    }

    public double calculateBonus() {
        return BasicSalary * 0.10;
    }

    public void displayEmployee() {
        System.out.println("Employee ID   : " + EmployeeId);
        System.out.println("Name          : " + Name);
        System.out.println("Basic Salary  : " + BasicSalary);
    }
}