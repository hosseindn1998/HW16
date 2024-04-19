package Repository.EvaluationType;

import Model.EvaluationType;
import base.repository.BaseRepositoryImpl;
import org.hibernate.Session;

public class EvaluationTypeRepositoryImpl extends BaseRepositoryImpl<EvaluationType,Long> implements EvaluationTypeRepository {

    public EvaluationTypeRepositoryImpl(Session session) {
        super(session);
    }

    @Override
    public Class<EvaluationType> getEntityClass() {
        return EvaluationType.class;
    }
}
