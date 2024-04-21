package Repository.CareerLevel;

import Model.CareerLevel;
import base.repository.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class CareerLevelRepositoryImpl extends BaseRepositoryImpl<CareerLevel,Long> implements CareerLevelRepository {

    public CareerLevelRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<CareerLevel> getEntityClass() {
        return CareerLevel.class;
    }
}
