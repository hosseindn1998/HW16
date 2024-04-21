package Repository.EvaluationType;

import Model.EvaluationType;
import base.repository.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class EvaluationTypeRepositoryImpl extends BaseRepositoryImpl<EvaluationType,Long> implements EvaluationTypeRepository {

    public EvaluationTypeRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<EvaluationType> getEntityClass() {
        return EvaluationType.class;
    }
}
