package service.Career;

import Model.Career;
import Model.Student;
import Repository.Career.CareerRepository;
import Repository.student.StudentRepository;
import base.service.BaseServiceImpl;

public class CareerServiceImpl extends BaseServiceImpl<Career,Long, CareerRepository>implements CareerService {

    public CareerServiceImpl(CareerRepository careerrepository) {
        super(careerrepository);
    }

}
