package Week10;


/**
 * Write a description of class Doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doctor extends Person
{
    private String specialization;
    private double consultationFee;
    
    public Doctor(int id, String name, String specialization, double extraAllowance)
    {
       super(id, name);
       this.consultationFee= consultationFee;
       this.specialization= specialization;
    }
    
    @Override
    public double calculateSalary(){
      double base= super.calculateSalary();
      double finalSalary= base+(consultationFee * 30);
      return finalSalary;
    }
    
    public double calculateSalary(int emergencyCases)
    {
        double normalSalary= this.calculateSalary();
        double perEmergencyCharge= 500;
        double emergencyBonus= emergencyCases* perEmergencyCharge;
        return(emergencyBonus+ normalSalary);
    }
    
    @Override
    public String toString()
    {
        return super.toString()+ ", specialization"+ this.specialization;
    }
}