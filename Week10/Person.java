package Week10;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private int Id;
    private String Name;
    
    
    public Person(int Id, String Name)
    {
       this.Id= Id;
       this.Name= Name;
    }
    
    public void setid(int newID)
    {
        this.Id= newID;
    }
    
    public int getid()
    {
        return this.Id;
    }
    
    public void setname(String Name)
    {
        this.Name= Name;
    }
    
    public String getname()
    {
        return this.Name;
    }
    
    public double calculateSalary()
    {
        return 0.0;
    }
    
    @Override
    public String toString()
    {
        return "Person Details"+ "Student id:" +this.Id+ "Student name:" + this.Name;
    }
}