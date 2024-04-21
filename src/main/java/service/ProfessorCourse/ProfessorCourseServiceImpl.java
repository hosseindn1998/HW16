package service.ProfessorCourse;

import Model.ProfessorCourse;
import Repository.ProfessorCourse.ProfessorCourseRepository;
import base.service.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class ProfessorCourseServiceImpl extends BaseServiceImpl<ProfessorCourse,Long, ProfessorCourseRepository>implements ProfessorCourseService {

    public ProfessorCourseServiceImpl(ProfessorCourseRepository professorcourserepository, SessionFactory sessionFactory) {
        super(professorcourserepository, sessionFactory);
    }

}
