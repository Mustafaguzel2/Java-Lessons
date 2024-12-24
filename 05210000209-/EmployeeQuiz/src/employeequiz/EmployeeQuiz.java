package employeequiz;
public class EmployeeQuiz {
    private String firstName;
    private String lastName;
    private int insRegistrationNu;
    private String departmant;
    private String position;
    
    public EmployeeQuiz() {
        this.insRegistrationNu = 9999;
        this.firstName = "";
        this.lastName = "";
        this.departmant = "";
        this.position = "";
    }

    public EmployeeQuiz(String firstName, String lastName, int insRegistrationNu, String departmant, String position) {
        this.insRegistrationNu = insRegistrationNu;
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmant = departmant;
        this.position = position;
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

    public int getInsRegistrationNu() {
        return insRegistrationNu;
    }

    public void setInsRegistrationNu(int insRegistrationNu) {
        this.insRegistrationNu = insRegistrationNu;
    }

    public String getDepartmant() {
        return departmant;
    }

    public void setDepartmant(String departmant) {
        this.departmant = departmant;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    @Override
    public String toString() {
        return String.format("%s %s; İnstituion Registration Number: %i ; Departmant: %s ; Position: %s",
                            getFirstName(),
                            getLastName(),
                            getInsRegistrationNu(),
                            getDepartmant(),
                            getPosition());
    }
}
