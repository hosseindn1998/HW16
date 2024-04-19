package service.CourseEnrollment;

import Model.CourseEnrollment;
import Repository.CourseEnrollment.CourseEnrollmentRepository;
import base.service.BaseServiceImpl;

public class CourseEnrollmentServiceImpl extends BaseServiceImpl<CourseEnrollment,Long, CourseEnrollmentRepository>implements CourseEnrollmentService {

    public CourseEnrollmentServiceImpl(CourseEnrollmentRepository courseenrollmentrepository) {
        super(courseenrollmentrepository);
    }

}
