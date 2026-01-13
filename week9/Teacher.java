package week9;


/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher extends Person
{
    String subject;
    double bonus;

    Teacher(int Id, String Name, double BasicSalary, String subject, double bonus) {
        super(Id, Name, BasicSalary);
        this.subject = subject;
        this.bonus = bonus;
    }

    @Override
    double calculateAnnualSalary() {
        return super.calculateAnnualSalary() + bonus;
    }
}