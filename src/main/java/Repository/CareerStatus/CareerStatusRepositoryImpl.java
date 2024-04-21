package Repository.CareerStatus;

import Model.CareerStatus;
import base.repository.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class CareerStatusRepositoryImpl extends BaseRepositoryImpl<CareerStatus,Long> implements CareerStatusRepository {

    public CareerStatusRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<CareerStatus> getEntityClass() {
        return CareerStatus.class;
    }
}
