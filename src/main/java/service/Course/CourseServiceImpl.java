package service.Course;

import Model.Course;
import Repository.Course.CourseRepository;
import base.service.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class CourseServiceImpl extends BaseServiceImpl<Course,Long, CourseRepository>implements CourseService {

    public CourseServiceImpl(CourseRepository courserepository, SessionFactory sessionFactory) {
        super(courserepository, sessionFactory);
    }

}
