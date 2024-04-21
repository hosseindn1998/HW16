package Repository.Course;

import Model.Course;
import base.repository.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class CourseRepositoryImpl extends BaseRepositoryImpl<Course,Long> implements CourseRepository {

    public CourseRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Course> getEntityClass() {
        return Course.class;
    }
}
