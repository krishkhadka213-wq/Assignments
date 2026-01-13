package week9;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {

        Teacher teacher = new Teacher(1, "Santosh", 60000, "Math", 8500);
        System.out.println("Teacher Annual Salary: " + teacher.calculateAnnualSalary());

        Staff staff = new Staff(2, "Savita", 120, 450);
        System.out.println("Staff Salary: " + staff.calculateSalary());

        System.out.println("College Name: " + Person.CollegeName);
    }
}