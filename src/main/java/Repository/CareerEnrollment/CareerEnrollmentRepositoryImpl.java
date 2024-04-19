package Repository.CareerEnrollment;

import Model.Career;
import Model.CareerEnrollment;
import base.repository.BaseRepositoryImpl;
import org.hibernate.Session;

public class CareerEnrollmentRepositoryImpl extends BaseRepositoryImpl<CareerEnrollment,Long> implements CareerEnrollmentRepository {

    public CareerEnrollmentRepositoryImpl(Session session) {
        super(session);
    }

    @Override
    public Class<CareerEnrollment> getEntityClass() {
        return CareerEnrollment.class;
    }
}
