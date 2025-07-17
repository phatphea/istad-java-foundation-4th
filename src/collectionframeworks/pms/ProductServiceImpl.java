package collectionframeworks.pms;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductServices{

    static List<Product> products = new ArrayList<>();

    @Override
    public boolean create(Product product) {
        return products.add(product);
    }

    @Override
    public boolean updateById(Long id, Product product) {
        for(int i=0; i<products.size(); i++){
            Product foundProduct = products.get(i);
            if(foundProduct.getId().equals(id)){
                product.setId(id);
                products.set(i, product);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteById(Long id) {
        return products.removeIf(p -> p.getId().equals(id));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product getById(Long id) {
        for(Product product : products){
            if(product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }
}
