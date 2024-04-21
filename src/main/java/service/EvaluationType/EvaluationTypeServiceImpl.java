package service.EvaluationType;

import Model.EvaluationType;
import Repository.EvaluationType.EvaluationTypeRepository;
import base.service.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class EvaluationTypeServiceImpl extends BaseServiceImpl<EvaluationType,Long,EvaluationTypeRepository>implements EvaluationTypeService {

    public EvaluationTypeServiceImpl(EvaluationTypeRepository evaluationtyperepository, SessionFactory sessionFactory) {
        super(evaluationtyperepository, sessionFactory);
    }

}
