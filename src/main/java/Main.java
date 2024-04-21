import Model.Student;
import utility.ApplicationContext;
import utility.Menu;

public class Main {
    public static void main(String[] args) {
//        System.out.println(ApplicationContext.getStudentService().isExistsByUsername("hosseindn1998"));
        if(ApplicationContext.getStudentService().authentication("hosseindn1998","A12345")!=null){
            Student student=ApplicationContext.getStudentService().authentication("hosseindn1998", "Aa12345");
            System.out.println(student);
        }

    }

}
