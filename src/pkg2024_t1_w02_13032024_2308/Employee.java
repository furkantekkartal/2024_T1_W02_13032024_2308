package pkg2024_t1_w02_13032024_2308;

/**
 *
 * @author Furky_n_Betty
 */
public class Employee {
    protected final String FIRST_NAME;
    protected final String LAST_NAME;
    protected final String SOCIAL_SECURITY_NUMBER;

    public Employee(){
        this ("undefined", "undefined", "");
    }
    
    public Employee(String firstName, String lastName, String socialSecurity){
        this.FIRST_NAME = firstName;
        this.LAST_NAME = lastName;
        this.SOCIAL_SECURITY_NUMBER = socialSecurity;
    }
    
    public Employee(Employee another){
        this(another.FIRST_NAME, another.LAST_NAME, another.SOCIAL_SECURITY_NUMBER);
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s",this.getFirstName(),this.getLastName(),this.getSocialSecurityNumber());
    }
    
    public String getFirstName(){
        return FIRST_NAME;
    }
    
    public String getLastName(){
        return LAST_NAME;
    }
    
    public String getSocialSecurityNumber(){
        return SOCIAL_SECURITY_NUMBER;
    }
}
