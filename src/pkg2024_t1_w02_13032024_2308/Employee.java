package pkg2024_t1_w02_13032024_2308;

/**
 *
 * @author Furky_n_Betty
 */
public class Employee {
    private final String FIRST_NAME;
    private final String LAST_NAME;
    private final String SOCIAL_SECURITY_NUMBER;

    public Employee(){
        this ("undefined", "undefined", "");
    }
    
    public Employee(String firstName, String lastName, String socialsecurity){
        this.FIRST_NAME = firstName;
        this.LAST_NAME = lastName;
        this.SOCIAL_SECURITY_NUMBER = socialsecurity;
    }
    
    public Employee(Employee another){
        this(another.FIRST_NAME, another.LAST_NAME, another.SOCIAL_SECURITY_NUMBER);
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s",FIRST_NAME,LAST_NAME,SOCIAL_SECURITY_NUMBER);
    }
    
    public String getFirstName(){
        return FIRST_NAME;
    }
    
    public String getLastName(){
        return LAST_NAME;
    }

}
