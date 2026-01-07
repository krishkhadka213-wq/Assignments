package week8;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int Id;
    private String Name;
    private String Address;
    private long PhoneNum;
    private String collegeName = "Islington";

    public Student(int id, String name, String address, long phoneNumber) {
        this.Id = id;
        this.Name = name;
        this.Address = address;
        this.PhoneNum = phoneNumber;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + Id);
        System.out.println("Name: " + Name);
        System.out.println("Address: " + Address);
        System.out.println("Phone Number: " + PhoneNum);
        System.out.println("College Name: " + collegeName);
    }
}