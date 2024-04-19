package Repository.Career;

import Model.Career;
import Model.Student;
import base.repository.BaseRepositoryImpl;
import org.hibernate.Session;

public class CareerRepositoryImpl extends BaseRepositoryImpl<Career,Long> implements CareerRepository {

    public CareerRepositoryImpl(Session session) {
        super(session);
    }

    @Override
    public Class<Career> getEntityClass() {
        return Career.class;
    }
}
