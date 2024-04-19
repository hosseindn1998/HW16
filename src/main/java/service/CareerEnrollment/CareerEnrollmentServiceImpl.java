package service.CareerEnrollment;

import Model.CareerEnrollment;
import Model.Student;
import Repository.CareerEnrollment.CareerEnrollmentRepository;
import Repository.student.StudentRepository;
import base.service.BaseServiceImpl;

public class CareerEnrollmentServiceImpl extends BaseServiceImpl<CareerEnrollment,Long, CareerEnrollmentRepository>implements CareerEnrollmentService {

    public CareerEnrollmentServiceImpl(CareerEnrollmentRepository careerenrollmentrepossitory) {
        super(careerenrollmentrepossitory);
    }

}
