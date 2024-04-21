package service.CareerStatus;

import Model.CareerStatus;
import Repository.CareerStatus.CareerStatusRepository;
import base.service.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class CareerStatusServiceImpl extends BaseServiceImpl<CareerStatus,Long, CareerStatusRepository>implements CareerStatusService {

    public CareerStatusServiceImpl(CareerStatusRepository careerstatusrepository, SessionFactory sessionFactory) {
        super(careerstatusrepository, sessionFactory);
    }

}
