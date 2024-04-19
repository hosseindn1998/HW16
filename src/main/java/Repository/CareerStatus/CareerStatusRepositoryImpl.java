package Repository.CareerStatus;

import Model.CareerStatus;
import base.repository.BaseRepositoryImpl;
import org.hibernate.Session;

public class CareerStatusRepositoryImpl extends BaseRepositoryImpl<CareerStatus,Long> implements CareerStatusRepository {

    public CareerStatusRepositoryImpl(Session session) {
        super(session);
    }

    @Override
    public Class<CareerStatus> getEntityClass() {
        return CareerStatus.class;
    }
}
