package Week10;


/**
 * Write a description of class OfflineCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OfflineCourse extends Course
{
     private double labFee;
    
    public OfflineCourse(int courseID, String courseName,double baseFee, double labFee)
    {
        super(courseID, courseName, labFee);
        this.labFee= labFee;
        
    }
    
    @Override
    protected double calculateFee()
    {
        return super.getbaseFee() + this.labFee;
    }
    
    public void displayCourseDetails()
    {
        super.displayCourseDetails();
        System.out.println("Total Fee for this Offline course:"+ this.calculateFee());
    }
}
