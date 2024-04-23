import Model.*;
import utility.ApplicationContext;
import utility.Menu;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu menu=new Menu();
        menu.publicMenu();
//        System.out.println(ApplicationContext.getStudentService().isExistsByUsername("hosseindn1998"));
//        if(ApplicationContext.getStudentService().authentication("hosseindn1998","Aa12345")!=null){
//            Student student=ApplicationContext.getStudentService().authentication("hosseindn1998", "Aa12345");
//            System.out.println(student);
//        }
//        ApplicationContext.getProfessorService().saveOrUpdate(new Professor());
//        if(ApplicationContext.getProfessorService().authentication("hossein","aaa")!=null) {
//            Professor professor = ApplicationContext.getProfessorService().authentication("hossein", "aaa");
//            System.out.println(professor);
////        }
//        ApplicationContext.getEmployeeService().saveOrUpdate(new Employee());
//        if(ApplicationContext.getProfessorService().authentication("hossein","aaa")!=null) {
//            Employee employee = ApplicationContext.getEmployeeService().authentication("hossein", "aaa");
//            employee.setSalary(7000);
//            System.out.println(employee);
//        }
//        System.out.println(ApplicationContext.getCourseOccurrenceService().findUnitProfessor(1,403,1));
//        CourseEnrollment courseEnrollment=new CourseEnrollment();
//        courseEnrollment.setStudent(ApplicationContext.getStudentService().findById(1L));
//        courseEnrollment.setCourseOccurrence(ApplicationContext.getCourseOccurrenceService().findById(3L));
//        ApplicationContext.getCourseEnrollmentService().saveOrUpdate(courseEnrollment);

//        System.out.println(ApplicationContext.getCourseEnrollmentService().isEnrollment(1, 1));
//        System.out.println(ApplicationContext.getCourseEnrollmentService().isCoursePassed(1, 1));
//        System.out.println(ApplicationContext.getCourseEnrollmentService().isAverageMorThan18(1, 403,1));
//        Integer unit = ApplicationContext.getCourseService().findById(1L).getUnit();
//        System.out.println(unit);

//        System.out.println(ApplicationContext.getCourseOccurrenceService().findUnitStudent(1, 403, 1));
//        List<String> results = ApplicationContext.getCourseOccurrenceService().showScores(1, 403, 1);
//        System.out.println(results); kkkkkkkkkar nakard

        System.out.println(ApplicationContext.getCourseEnrollmentService().showAll(CourseEnrollment.class));


    }}
