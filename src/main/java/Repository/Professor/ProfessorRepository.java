package Repository.Professor;

import Model.Professor;
import Model.Student;
import base.repository.BaseRepository;

public interface ProfessorRepository extends BaseRepository<Professor,Long> {
    Professor authentication(String username, String password);

}
