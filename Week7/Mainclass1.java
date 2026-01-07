package Week7;


/**
 * Write a description of class Mainclass1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mainclass1
{
  public static void main(String[] args)
    {
        Employee e1 = new Employee();
        e1.EmployeeId = 1;
        e1.Name = "Luffy";
        e1.Salary = 25000;

        Employee e2 = new Employee();
        e2.EmployeeId = 2;
        e2.Name = "Zoro";
        e2.Salary = 30000;

        Employee e3 = new Employee();
        e3.EmployeeId = 3;
        e3.Name = "Sanji";
        e3.Salary = 28000;

        System.out.println("Employee 1: " + e1.EmployeeId + " " + e1.Name + " " + e1.Salary);
        System.out.println("Employee 2: " + e2.EmployeeId + " " + e2.Name + " " + e2.Salary);
        System.out.println("Employee 3: " + e3.EmployeeId + " " + e3.Name + " " + e3.Salary);
        Employee highest = e1;

        if(e2.Salary > highest.Salary)
            highest = e2;

        if(e3.Salary > highest.Salary)
            highest = e3;

        System.out.println("\nEmployee with Highest Salary:");
        System.out.println("ID = " + highest.EmployeeId);
        System.out.println("Name = " + highest.Name);
        System.out.println("Salary = " + highest.Salary);
    }
}