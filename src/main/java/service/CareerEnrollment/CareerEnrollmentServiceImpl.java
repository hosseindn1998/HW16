package service.CareerEnrollment;

import Model.CareerEnrollment;
import Repository.CareerEnrollment.CareerEnrollmentRepository;
import base.service.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class CareerEnrollmentServiceImpl extends BaseServiceImpl<CareerEnrollment,Long, CareerEnrollmentRepository>implements CareerEnrollmentService {

    public CareerEnrollmentServiceImpl(CareerEnrollmentRepository careerenrollmentrepossitory, SessionFactory sessionFactory) {
        super(careerenrollmentrepossitory, sessionFactory);
    }

}
