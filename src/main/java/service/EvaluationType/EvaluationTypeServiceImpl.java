package service.EvaluationType;

import Model.EvaluationType;
import Model.Student;
import Repository.EvaluationType.EvaluationTypeRepository;
import Repository.student.StudentRepository;
import base.service.BaseServiceImpl;

public class EvaluationTypeServiceImpl extends BaseServiceImpl<EvaluationType,Long,EvaluationTypeRepository>implements EvaluationTypeService {

    public EvaluationTypeServiceImpl(EvaluationTypeRepository evaluationtyperepository) {
        super(evaluationtyperepository);
    }

}
