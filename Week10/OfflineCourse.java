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
    
    public OfflineCourse(int courseId, String courseName, double baseFee, double labFee)
    {
    super(courseId, courseName, baseFee);
    this.labFee = labFee;
    }
    
    @Override
    protected double calculateFee()
        {
            return super.getBaseFee() + this.labFee;
        }
    
    public void displayOfflineCourseDetails()
        {
            super.displayCourseDetails();
       System.out.println("Total fee for this online course: " + this.calculateFee());
    
        }
}