package employee;
public class Employee {
        
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    
    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s; Hired: %s ; Birthday: %s", 
                getFirstName(),getLastName(),
                getBirthDate(),getHireDate());
    }
}
