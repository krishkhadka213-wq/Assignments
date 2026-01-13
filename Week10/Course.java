package Week10;


/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    private int courseId;
    private String courseName;
    private double baseFee;
    
    public Course(int courseId, String courseName, double baseFee)
    {
        this.courseId= courseId;
        this.courseName= courseName;
        this.baseFee= baseFee;
    }
    
    public void setCourseId(int newId)
    {
        this.courseId= newId;
    }
    
    public int getCourseId()
    {
        return this.courseId;
    }
    
    public void setcourseName(String newCourseName)
    {
        this.courseName= newCourseName;
    }
    
    public String getcourseName()
    {
        return this.courseName;
    }
    
    public void setBaseFee(double baseFee)
    {
        this.baseFee= baseFee;
    }
    
    public double getbaseFee()
    {
        return this.baseFee;
    }
    
    protected double calculateFee()
    {
        return this.baseFee;
    }
    
    protected double calculateFee(double discountAmount)
    {
        return this.baseFee- discountAmount;
    }
    
    public void displayCourseDetails()
    {
        System.out.println("CourseId: " + getCourseId());
        System.out.println("CourseName: " + getcourseName());
    }
}