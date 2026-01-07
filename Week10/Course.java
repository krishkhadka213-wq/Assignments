package Week10;

public class Course
 {
    private int courseId;
    private String courseName;
    private double baseFee;
    
    public Course(int courseID, String courseName, double baseFee)
     {
        this.courseId = courseId;
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
    
    public void setCourseName(String newName)
        {
            this.courseName = newName;
        }
      
    public String getCourseName()
        {
            return this.courseName;
        }
        
    public void setBaseFee(double newFee)
        {
            this.baseFee = newFee;
        }
        
    public double getBaseFee()
        {
            return this.baseFee;
        }
}