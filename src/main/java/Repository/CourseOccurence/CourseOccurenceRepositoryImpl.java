package Repository.CourseOccurence;

import Model.CourseOccurrence;
import base.repository.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class CourseOccurenceRepositoryImpl extends BaseRepositoryImpl<CourseOccurrence,Long> implements CourseOccurenceRepository {

    public CourseOccurenceRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<CourseOccurrence> getEntityClass() {
        return CourseOccurrence.class;
    }
}
