package generics.generic_interface;

import java.util.List;

public class StudentServiceImpl implements CrudService<Long, Student> {


    @Override
    public boolean create(Student student) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean update(Long id, Student student) {
        return false;
    }

    @Override
    public List<Student> getAll() {
        return List.of();
    }

    @Override
    public Student getById(Long id) {
        return null;
    }
}
