package service.Course;

import Model.Course;
import Repository.Course.CourseRepository;
import base.service.BaseServiceImpl;

public class CourseServiceImpl extends BaseServiceImpl<Course,Long, CourseRepository>implements CourseService {

    public CourseServiceImpl(CourseRepository courserepository) {
        super(courserepository);
    }

}
