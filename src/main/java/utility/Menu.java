package utility;

import Model.*;
import lombok.NoArgsConstructor;
import service.AssistantProfessor.AssistantProfessorServiceImpl;
import service.Career.CareerService;
import service.Career.CareerServiceImpl;
import service.CareerEnrollment.CareerEnrollmentServiceImpl;
import service.CareerLevel.CareerLevelServiceImpl;
import service.CareerStatus.CareerStatusServiceImpl;
import service.Course.CourseServiceImpl;
import service.CourseDependency.CourseDependencyServiceImpl;
import service.CourseEnrollment.CourseEnrollmentServiceImpl;
import service.CourseEnrollmentEvaluation.CourseEnrollmentEvaluationServiceImpl;
import service.CourseOccurence.CourseOccurenceService;
import service.Department.DepartmentService;
import service.Department.DepartmentServiceImpl;
import service.Employee.EmployeeService;
import service.EvaluationType.EvaluationTypeService;
import service.Professor.ProfessorService;
import service.ProfessorCourse.ProfessorCourseService;
import service.Schedule.ScheduleService;
import service.room.RoomService;
import service.student.StudentService;
import service.student.StudentServiceImpl;

import java.util.Scanner;
@NoArgsConstructor
public class Menu {
    private final ScheduleService scheduleService=ApplicationContext.getScheduleService();
    private final RoomService roomService=ApplicationContext.getRoomService();
    private final ProfessorCourseService professorCourseService=ApplicationContext.getProfessorCourseService();
    private final ProfessorService professorService =  ApplicationContext.getProfessorService();
    private final EvaluationTypeService evaluationTypeService=ApplicationContext.getEvaluationTypeService();
    private final EmployeeService employeeService=ApplicationContext.getEmployeeService();
    private final DepartmentService departmentService=ApplicationContext.getDepartmentService();
    private final CourseOccurenceService courseOccurrenceService=ApplicationContext.getCourseOccurrenceService();
    private final CourseEnrollmentEvaluationServiceImpl courseEnrollmentEvaluationService=ApplicationContext.getCourseEnrollmentEvaluationService();
    private final CourseEnrollmentServiceImpl courseEnrollmentService=ApplicationContext.getCourseEnrollmentService();
    private final CourseDependencyServiceImpl courseDependencyService=ApplicationContext.getCourseDependencyService();
    private final CourseServiceImpl courseService=ApplicationContext.getCourseService();
    private final StudentServiceImpl studentService=ApplicationContext.getStudentService();
    private final CareerStatusServiceImpl careerStatusService=ApplicationContext.getCareerStatusService();
    private final AssistantProfessorServiceImpl assistantProfessorService=ApplicationContext.getAssistantProfessorService();
    private final CareerLevelServiceImpl careerLevelService=ApplicationContext.getCareerLevelService();
    private final CareerEnrollmentServiceImpl careerEnrollmentService=ApplicationContext.getCareerEnrollmentService();
    private final CareerServiceImpl careerService=ApplicationContext.getCareerService();



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
        Room room = new Room();
//        Student saved=studentService.saveOrUpdate(student);
        Student saved=studentService.saveOrUpdate(student);
        System.out.println(studentService.findById(2L));

        if (saved != null)
            System.out.println("signed up successfully!");
        else
            System.out.println("Something went wrong, Please try again.");
    }
    public void deleteStudentById(Long id){
//        Student student=new Student("123");
        Student student=new Student(1L,"hosseindn1998","Aa12345","123456");
//        studentService.deleteById(id);
        System.out.println();
    }
    public void fetchStudent(){
//        Student student=studentService.findById(2L);
//        System.out.println(student);


    }

}
