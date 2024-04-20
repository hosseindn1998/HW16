package utility;

import Model.Career;
import Model.Professor;
import Model.Student;
import lombok.NoArgsConstructor;
import service.Career.CareerService;
import service.Professor.ProfessorService;
import service.student.StudentService;

import java.util.Scanner;
@NoArgsConstructor
public class Menu {
    private final ProfessorService studentService =  ApplicationContext.getProfessorService();
    private final Scanner scanner = new Scanner(System.in);


    public void signUp(){
        System.out.println("--- Signing Up NEW STUDENT ---");
        System.out.println("first name: ");
        Integer id = scanner.nextInt();
        String firstName = scanner.nextLine();
//        System.out.println("last name: ");
//        String lastName = scanner.nextLine();
//        System.out.println("username: ");
//        String username = scanner.nextLine();
//        System.out.println("password: ");
//        String password = scanner.nextLine();
        System.out.println("national code: ");
        String nationalCode = scanner.nextLine();
//        System.out.println("Date Of Birthdate (for ex 1998-07-26: ");
//        String dateOfBirth = scanner.nextLine();
//        System.out.println("phone number: ");
//        String phoneNumber = scanner.nextLine();
//        System.out.println("address: ");
//        String address = scanner.nextLine();

//        Customer customer = new Customer(id, firstName, lastName, username, password, nationalCode, phoneNumber, address);
        Student student=new Student(1L,"hosseindn1998","Aa12345","123456");
        Professor professor=new Professor();
        Professor saved=studentService.saveOrUpdate(professor);

        if (saved != null)
            System.out.println("signed up successfully!");
        else
            System.out.println("Something went wrong, Please try again.");
    }
    public void deleteStudentById(Long id){
//        Student student=new Student("123");
        Student student=new Student(1L,"hosseindn1998","Aa12345","123456");
        studentService.deleteById(id);
        System.out.println();
    }
    public void fetchStudent(){
//        Student student=studentService.findById(2L);
//        System.out.println(student);


    }

}
