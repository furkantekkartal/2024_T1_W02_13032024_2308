package pkg2024_t1_w02_13032024_2308;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee first = new Employee("Scott", "Smith", "M4352");
        CommissionEmployee second = new CommissionEmployee("Lis", "Paul","M3456", 5000, 0.25);
        System.out.println(second);
        second.setGrossSales(4500);
        System.out.println(second);
             
    }
    
}
