package Repository.Career;

import Model.Career;
import base.repository.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class CareerRepositoryImpl extends BaseRepositoryImpl<Career,Long> implements CareerRepository {

    public CareerRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Career> getEntityClass() {
        return Career.class;
    }
}
