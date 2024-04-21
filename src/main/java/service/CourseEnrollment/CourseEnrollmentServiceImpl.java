package service.CourseEnrollment;

import Model.CourseEnrollment;
import Repository.CourseEnrollment.CourseEnrollmentRepository;
import base.service.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class CourseEnrollmentServiceImpl extends BaseServiceImpl<CourseEnrollment,Long, CourseEnrollmentRepository>implements CourseEnrollmentService {

    public CourseEnrollmentServiceImpl(CourseEnrollmentRepository courseenrollmentrepository, SessionFactory sessionFactory) {
        super(courseenrollmentrepository, sessionFactory);
    }

}
