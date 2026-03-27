package Week17;


/**
 * Write a description of class Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q5
{
    private String studentId, name, course;
    Q5(String studentId, String name, String course)
    {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
    }
    
    public String getFormattedHTMLText() {
        return String.format(
            "<html><p>ID: %s</p><p>Name: %s </p><p>Course: %s </>p</html?",
            studentId,
            name,
            course
        );
    }
}

