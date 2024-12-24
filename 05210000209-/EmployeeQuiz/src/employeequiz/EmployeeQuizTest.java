package employeequiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmployeeQuizTest {
    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("girdiQuiz1.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if(line.equals("Default")) {
                EmployeeQuiz employee = new EmployeeQuiz();
                System.out.println(employee.toString());
            }
            else {
                String[] data = line.split(",");
                String firstName = data[0];
                String lastName = data[1];
                int insRegistrationNu = Integer.parseInt(data[2]);
                String departmant = data[3];
                String position = data[4];
                
                EmployeeQuiz employee = new EmployeeQuiz(firstName, lastName, insRegistrationNu, departmant, position);
                
                System.out.println(employee.toString());
            }
        }
        scanner.close();
    }
}
