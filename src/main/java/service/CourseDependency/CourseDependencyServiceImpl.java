package service.CourseDependency;

import Model.CourseDependency;
import Repository.CourseDependency.CourseDependencyRepository;
import base.service.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class CourseDependencyServiceImpl extends BaseServiceImpl<CourseDependency,Long, CourseDependencyRepository>implements CourseDependencyService {

    public CourseDependencyServiceImpl(CourseDependencyRepository coursedependencyrepository, SessionFactory sessionFactory) {
        super(coursedependencyrepository, sessionFactory);
    }

}
