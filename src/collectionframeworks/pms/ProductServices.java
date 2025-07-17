package collectionframeworks.pms;

import java.util.List;

public interface ProductServices {

    boolean create(Product product);

    boolean updateById(Long id, Product product);

    boolean deleteById(Long id);

    List<Product> getAll();

    Product getById(Long id);

}
