package Repository.CareerLevel;

import Model.CareerLevel;
import base.repository.BaseRepositoryImpl;
import org.hibernate.Session;

public class CareerLevelRepositoryImpl extends BaseRepositoryImpl<CareerLevel,Long> implements CareerLevelRepository {

    public CareerLevelRepositoryImpl(Session session) {
        super(session);
    }

    @Override
    public Class<CareerLevel> getEntityClass() {
        return CareerLevel.class;
    }
}
