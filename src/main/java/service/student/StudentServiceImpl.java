package service.student;

import Model.Student;
import Repository.student.StudentRepository;
import base.service.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class StudentServiceImpl extends BaseServiceImpl<Student,Long,StudentRepository>implements StudentService {

    public StudentServiceImpl(StudentRepository studentrepository, SessionFactory sessionFactory) {
        super(studentrepository, sessionFactory);
    }

}
