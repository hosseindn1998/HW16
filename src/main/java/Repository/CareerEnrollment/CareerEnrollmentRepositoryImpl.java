package Repository.CareerEnrollment;

import Model.CareerEnrollment;
import base.repository.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class CareerEnrollmentRepositoryImpl extends BaseRepositoryImpl<CareerEnrollment,Long> implements CareerEnrollmentRepository {

    public CareerEnrollmentRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<CareerEnrollment> getEntityClass() {
        return CareerEnrollment.class;
    }
}
