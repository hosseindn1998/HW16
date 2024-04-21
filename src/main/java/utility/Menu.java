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

import java.sql.SQLException;
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
    public void publicMenu()  {

        System.out.println("HELLO WELCOME TO YOUR LMS");
        System.out.println("1-SignIn User");
        System.out.println("0-Exit");

        int number = scanner.nextInt();
        scanner.nextLine();

        switch (number) {
            case 1 -> signIn();
            case 0 -> System.out.println("Thank you for use,Nice to meet you");
            default -> System.out.println("Fake input,please Enter Number 1-6 ");
        }
    }
        public void signIn () {
            System.out.println("***   User Menu   ***");
            System.out.println("1- add User");
            System.out.println("2- delete User");
            System.out.println("3- edit user");
            System.out.println("0- Back to previous Menu");
        }

}
