package Repository.CourseOccurence;

import Model.CourseOccurrence;
import base.repository.BaseRepositoryImpl;
import org.hibernate.Session;

public class CourseOccurenceRepositoryImpl extends BaseRepositoryImpl<CourseOccurrence,Long> implements CourseOccurenceRepository {

    public CourseOccurenceRepositoryImpl(Session session) {
        super(session);
    }

    @Override
    public Class<CourseOccurrence> getEntityClass() {
        return CourseOccurrence.class;
    }
}
