package service.CareerLevel;

import Model.CareerLevel;
import Repository.CareerLevel.CareerLevelRepository;
import base.service.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class CareerLevelServiceImpl extends BaseServiceImpl<CareerLevel,Long, CareerLevelRepository>implements CareerLevelService {

    public CareerLevelServiceImpl(CareerLevelRepository careerLevelRepository, SessionFactory sessionFactory) {
        super(careerLevelRepository, sessionFactory);
    }

}
