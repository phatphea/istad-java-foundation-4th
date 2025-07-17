package generics.generic_interface;

import java.util.List;

public interface CrudService<K, T> {

    boolean create(T t);

    boolean delete(K id);

    boolean update(Long id, T t);

    List<T> getAll();

    T getById(K id);

}
