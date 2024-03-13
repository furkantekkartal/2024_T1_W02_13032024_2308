package pkg2024_t1_w02_13032024_2308;

/**
 *
 * @author Furky_n_Betty
 */
public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;
    
    public CommissionEmployee(){
        
    }
    
    public CommissionEmployee(String firstName,String lastName, String socialSecurity,double grossSales, double commissionRate){
        super(firstName, lastName, socialSecurity);
        
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        } 
        
        if (commissionRate<=0.0 || commissionRate>=1.0){
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    
    public void setCommissionRate(double rate){
        commissionRate = rate;
    }
    
    public void setGrossSales(double grossSales){
        this.grossSales = grossSales;
    }
    
    public double getGrossSales(){
        return grossSales;
    }
    
    public double getCommissionRate(){
        return commissionRate;
    }
    
    public double earnings(){
        return commissionRate * grossSales;
    }
        
    @Override
    public String toString(){
        return String.format("%s %s : gross sales is %.2f and commission rate is %.2f",FIRST_NAME,LAST_NAME,grossSales, commissionRate);
    }
}
