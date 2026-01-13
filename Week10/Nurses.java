package Week10;

public class Nurses extends Person
{
    private String shift;
    private double extraAllowance;

    public Nurses(int Id, String Name, String shift, double extraAllowance)
    {
        super(Id, Name);
        this.shift = shift;
        this.extraAllowance = extraAllowance;
    }

    @Override
    public double calculateSalary()
    {
        double base = super.calculateSalary();
        return base + extraAllowance;
    }

    @Override
    public String toString()
    {
        return super.toString() +
               ", Shift: " + this.shift +
               ", Extra Allowance: " + this.extraAllowance;
    }
}