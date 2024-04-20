package utility;

import Model.*;
import Repository.Career.CareerRepository;
import Repository.Career.CareerRepositoryImpl;
import Repository.CareerEnrollment.CareerEnrollmentRepositoryImpl;
import Repository.CareerLevel.CareerLevelRepositoryImpl;
import Repository.CareerStatus.CareerStatusRepositoryImpl;
import Repository.Course.CourseRepositoryImpl;
import Repository.CourseEnrollment.CourseEnrollmentRepository;
import Repository.CourseEnrollment.CourseEnrollmentRepositoryImpl;
import Repository.CourseEnrollmentEvaluation.CourseEnrollmentEvaluationRepositoryImpl;
import Repository.CourseOccurence.CourseOccurenceRepositoryImpl;
import Repository.EvaluationType.EvaluationTypeRepository;
import Repository.EvaluationType.EvaluationTypeRepositoryImpl;
import Repository.Professor.ProfessorRepositoryImpl;
import Repository.Schedule.ScheduleRepositoryImpl;
import Repository.room.RoomRepositoryImpl;
import Repository.student.StudentRepository;
import Repository.student.StudentRepositoryImpl;
import connection.SessionFactorySingleton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import service.Career.CareerServiceImpl;
import service.CareerEnrollment.CareerEnrollmentServiceImpl;
import service.CareerLevel.CareerLevelServiceImpl;
import service.CareerStatus.CareerStatusServiceImpl;
import service.Course.CourseServiceImpl;
import service.CourseEnrollment.CourseEnrollmentServiceImpl;
import service.CourseEnrollmentEvaluation.CourseEnrollmentEvaluationServiceImpl;
import service.CourseOccurence.CourseOccurenceServiceImpl;
import service.EvaluationType.EvaluationTypeServiceImpl;
import service.Professor.ProfessorServiceImpl;
import service.Schedule.ScheduleServiceImpl;
import service.room.RoomServiceImpl;
import service.student.StudentService;
import service.student.StudentServiceImpl;

public class ApplicationContext {
    static final SessionFactory SESSION_FACTORY;
    static final Session SESSION ;
    private static final StudentRepositoryImpl STUDENT_REPOSITORY;
    private static final StudentServiceImpl STUDENT_SERVICE;
    private static final ScheduleRepositoryImpl SCHEDULE_REPOSITORY;
    private static final ScheduleServiceImpl SCHEDULE_SERVICE;
    private static final RoomRepositoryImpl ROOM_REPOSITORY;
    private static final RoomServiceImpl ROOM_SERVICE;
    private static final ProfessorRepositoryImpl PROFESSOR_REPOSITORY;
    private static final ProfessorServiceImpl PROFESSOR_SERVICE;
    private static final EvaluationTypeRepositoryImpl EVALUATION_TYPE_REPOSITORY;
    private static final EvaluationTypeServiceImpl EVALUATION_TYPE_SERVICE;
    private static final CourseOccurenceRepositoryImpl COURSE_OCCURRENCE_REPOSITORY;
    private static final CourseOccurenceServiceImpl COURSE_OCCURRENCE_SERVICE;
    private static final CourseEnrollmentEvaluationRepositoryImpl COURSE_ENROLLMENT_EVALUATION_REPOSITORY;
    private static final CourseEnrollmentEvaluationServiceImpl COURSE_ENROLLMENT_EVALUATION_SERVICE;
    private static final CourseEnrollmentRepositoryImpl COURSE_ENROLLMENT_REPOSITORY;
    private static final CourseEnrollmentServiceImpl COURSE_ENROLLMENT_SERVICE;
    private static final CourseRepositoryImpl COURSE_REPOSITORY;
    private static final CourseServiceImpl COURSE_SERVICE;
    private static final CareerStatusRepositoryImpl CAREER_STATUS_REPOSITORY;
    private static final CareerStatusServiceImpl CAREER_STATUS_SERVICE;
    private static final CareerLevelRepositoryImpl CAREER_LEVEL_REPOSITORY;
    private static final CareerLevelServiceImpl CAREER_LEVEL_SERVICE;
    private static final CareerEnrollmentRepositoryImpl CAREER_ENROLLMENT_REPOSITORY;
    private static final CareerEnrollmentServiceImpl CAREER_ENROLLMENT_SERVICE;
    private static final CareerRepositoryImpl CAREER_REPOSITORY;
    private static final CareerServiceImpl CAREER_SERVICE;

    static {
        SESSION_FACTORY = SessionFactorySingleton.getInstance();
        SESSION=SESSION_FACTORY.openSession();
        STUDENT_REPOSITORY=new StudentRepositoryImpl(SESSION);
        STUDENT_SERVICE=new StudentServiceImpl(STUDENT_REPOSITORY);
        SCHEDULE_REPOSITORY=new ScheduleRepositoryImpl(SESSION);
        SCHEDULE_SERVICE=new ScheduleServiceImpl(SCHEDULE_REPOSITORY);
        ROOM_REPOSITORY=new RoomRepositoryImpl(SESSION);
        ROOM_SERVICE=new RoomServiceImpl(ROOM_REPOSITORY);
        PROFESSOR_REPOSITORY=new ProfessorRepositoryImpl(SESSION);
        PROFESSOR_SERVICE=new ProfessorServiceImpl(PROFESSOR_REPOSITORY);
        EVALUATION_TYPE_REPOSITORY=new EvaluationTypeRepositoryImpl(SESSION);
        EVALUATION_TYPE_SERVICE=new EvaluationTypeServiceImpl(EVALUATION_TYPE_REPOSITORY);
        COURSE_OCCURRENCE_REPOSITORY =new CourseOccurenceRepositoryImpl(SESSION);
        COURSE_OCCURRENCE_SERVICE=new CourseOccurenceServiceImpl(COURSE_OCCURRENCE_REPOSITORY);
        COURSE_ENROLLMENT_EVALUATION_REPOSITORY=new CourseEnrollmentEvaluationRepositoryImpl(SESSION);
        COURSE_ENROLLMENT_EVALUATION_SERVICE=new CourseEnrollmentEvaluationServiceImpl(COURSE_ENROLLMENT_EVALUATION_REPOSITORY);
        COURSE_ENROLLMENT_REPOSITORY=new CourseEnrollmentRepositoryImpl(SESSION);
        COURSE_ENROLLMENT_SERVICE=new CourseEnrollmentServiceImpl(COURSE_ENROLLMENT_REPOSITORY);
        COURSE_REPOSITORY=new CourseRepositoryImpl(SESSION);
        COURSE_SERVICE=new CourseServiceImpl(COURSE_REPOSITORY);
        CAREER_STATUS_REPOSITORY=new CareerStatusRepositoryImpl(SESSION);
        CAREER_STATUS_SERVICE=new CareerStatusServiceImpl(CAREER_STATUS_REPOSITORY);
        CAREER_LEVEL_REPOSITORY=new CareerLevelRepositoryImpl(SESSION);
        CAREER_LEVEL_SERVICE=new CareerLevelServiceImpl(CAREER_LEVEL_REPOSITORY);
        CAREER_ENROLLMENT_REPOSITORY=new CareerEnrollmentRepositoryImpl(SESSION);
        CAREER_ENROLLMENT_SERVICE=new CareerEnrollmentServiceImpl(CAREER_ENROLLMENT_REPOSITORY);
        CAREER_REPOSITORY=new CareerRepositoryImpl(SESSION);
        CAREER_SERVICE=new CareerServiceImpl(CAREER_REPOSITORY);

    }
    public static StudentServiceImpl getStudentService() {
        return STUDENT_SERVICE;
    }
    public static ScheduleServiceImpl getScheduleService() {
        return SCHEDULE_SERVICE;
    }
    public static RoomServiceImpl getRoomService() {
        return ROOM_SERVICE;
    }
    public static ProfessorServiceImpl getProfessorService() {
        return PROFESSOR_SERVICE;
    }
    public static EvaluationTypeServiceImpl getEvaluationTypeService(){
        return EVALUATION_TYPE_SERVICE;
    }
    public static CourseOccurenceServiceImpl getCourseOccurrenceService(){
        return COURSE_OCCURRENCE_SERVICE;
    }
    public static CourseEnrollmentEvaluationServiceImpl getCourseEnrollmentEvaluationService(){
        return COURSE_ENROLLMENT_EVALUATION_SERVICE;
    }
    public static CourseEnrollmentServiceImpl getCourseEnrollmentService(){
        return COURSE_ENROLLMENT_SERVICE;
    }
    public static CourseServiceImpl getCourseService(){
        return COURSE_SERVICE;
    }
    public static CareerStatusServiceImpl getCareerStatusService(){
        return CAREER_STATUS_SERVICE;
    }
    public static CareerLevelServiceImpl getCareerLevelService(){
        return CAREER_LEVEL_SERVICE;
    }
    public static CareerEnrollmentServiceImpl getCareerEnrollmentService(){
        return CAREER_ENROLLMENT_SERVICE;
    }
    public static CareerServiceImpl getCareerService(){
        return CAREER_SERVICE;
    }
}
