package Repository.Course;

import Model.Course;
import base.repository.BaseRepositoryImpl;
import org.hibernate.Session;

public class CourseRepositoryImpl extends BaseRepositoryImpl<Course,Long> implements CourseRepository {

    public CourseRepositoryImpl(Session session) {
        super(session);
    }

    @Override
    public Class<Course> getEntityClass() {
        return Course.class;
    }
}
