package week9;


/**
 * Write a description of class Payroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payroll
{
     public static void main(String[] args)
     {

        PermanentEmployee pe =
                new PermanentEmployee(9, "Ryan", 25000, 5500, 1500);

        System.out.println("Permanent Employee");
        pe.displayEmployee();
        System.out.println("Total Salary : " + pe.calculateTotalSalary());

        System.out.println();

        ContractEmp ce =
                new ContractEmp(201, "Shyam",1200, 60);

        System.out.println("Contract Employee");
        ce.displayEmployee();
        System.out.println("Total Salary : " + ce.calculateTotalSalary());
    }
}