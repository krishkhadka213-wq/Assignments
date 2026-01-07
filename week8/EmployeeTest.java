package week8;


/**
 * Write a description of class EmployeeTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee(25000);

        System.out.println("Basic Salary: " + e1.getBasicSalary());

        System.out.println("Gross Salary: " + e1.calculateGrossSalary());
    }
}