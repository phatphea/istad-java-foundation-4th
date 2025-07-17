package generics.generic_interface;

import java.util.List;

public class ProductServiceImpl implements CrudService<Long, Product>{

    @Override
    public boolean create(Product product) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean update(Long id, Product product) {
        return false;
    }

    @Override
    public List<Product> getAll() {
        return List.of();
    }

    @Override
    public Product getById(Long id) {
        return null;
    }
}
