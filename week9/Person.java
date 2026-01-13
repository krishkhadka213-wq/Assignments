package week9;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    int Id;
    String Name;
    double BasicSalary;
    static String CollegeName = "Islington College";

    Person(int Id, String Name, double BasicSalary) {
        this.Id = Id;
        this.Name = Name;
        this.BasicSalary = BasicSalary;
    }

    double calculateAnnualSalary() {
        return BasicSalary * 12;
    }
}