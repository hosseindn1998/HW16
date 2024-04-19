package service.CareerStatus;

import Model.CareerStatus;
import Repository.CareerStatus.CareerStatusRepository;
import base.service.BaseServiceImpl;

public class CareerStatusServiceImpl extends BaseServiceImpl<CareerStatus,Long, CareerStatusRepository>implements CareerStatusService {

    public CareerStatusServiceImpl(CareerStatusRepository careerstatusrepository) {
        super(careerstatusrepository);
    }

}
