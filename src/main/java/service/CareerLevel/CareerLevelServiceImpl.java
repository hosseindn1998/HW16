package service.CareerLevel;

import Model.CareerLevel;
import Model.Student;
import Repository.CareerLevel.CareerLevelRepository;
import Repository.student.StudentRepository;
import base.service.BaseServiceImpl;

public class CareerLevelServiceImpl extends BaseServiceImpl<CareerLevel,Long, CareerLevelRepository>implements CareerLevelService {

    public CareerLevelServiceImpl(CareerLevelRepository careerLevelRepository) {
        super(careerLevelRepository);
    }

}
