package employee;

public class EmployeeTest {
    
    public static void main(String[] args) {
        
        Date birth = new Date(1, 14, 2000);
        Date hire = new Date(3, 12, 2018);
        
        Employee worker1 = new Employee("Ali", "Tunç",
                                        birth, hire);
        
        System.out.println(worker1);
        
        Employee worker2 = new Employee("Ayşe", "Demir", 
                           new Date(9, 19, 1980),
                           new Date(5, 11, 2005));
        
        System.out.println(worker2);
        
    }
}
