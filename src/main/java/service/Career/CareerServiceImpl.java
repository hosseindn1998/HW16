package service.Career;

import Model.Career;
import Repository.Career.CareerRepository;
import base.service.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class CareerServiceImpl extends BaseServiceImpl<Career,Long, CareerRepository>implements CareerService {

    public CareerServiceImpl(CareerRepository careerrepository, SessionFactory sessionFactory) {
        super(careerrepository, sessionFactory);
    }

}
