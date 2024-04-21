package Repository.CourseDependency;

import Model.CourseDependency;
import base.repository.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class CourseDependencyRepositoryImpl extends BaseRepositoryImpl<CourseDependency,Long> implements CourseDependencyRepository {

    public CourseDependencyRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<CourseDependency> getEntityClass() {
        return CourseDependency.class;
    }
}
