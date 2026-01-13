package Week10;


/**
 * Write a description of class OnlineCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OnlineCourse extends Course
{
    private double platformFee;
    
    public OnlineCourse(int CourseId, String courseName, double baseFee, double platformFee)
    {
        super(CourseId, courseName, baseFee);
        this.platformFee= platformFee;
    }
    
    @Override
    protected double calculateFee()
    {
        return super.getbaseFee() + this.platformFee;
    }
    
    public void displayOnlineCourseDetails()
    {
        super.displayCourseDetails(); //courseId, course name
        System.out.println("total Fee for this online course:" + this.calculateFee());
    }
}
