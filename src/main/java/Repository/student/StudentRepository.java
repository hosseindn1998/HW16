package Repository.student;

import Model.Student;
import base.repository.BaseRepository;

public interface StudentRepository extends BaseRepository<Student,Long> {
    boolean isExistsByUsername(String username);
}
