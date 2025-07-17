package pmsv1.service;

import pmsv1.exception.ProductException;
import pmsv1.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements  ProductService{

    static List<Product> productDB = new ArrayList<>();

    @Override
    public boolean createProduct(Product product) throws ProductException {

        if(product.getName().isBlank()){
            throw new ProductException("!!Product can not be black!");
        }

        if(product.getPrice() < 0){
            throw new ProductException("!!Product price can not be negative!");
        }

        if(product.getQty() < 0){
            throw new ProductException("!!Product qty can not be negative!");
        }


        return productDB.add(product);
    }

    @Override
    public boolean updateProductById(Long id, Product product) throws ProductException {

        if(product.getName().isBlank()){
            throw new ProductException("!!Product can not be black!");
        }

        if(product.getPrice() < 0){
            throw new ProductException("!!Product price can not be negative!");
        }

        if(product.getQty() < 0){
            throw new ProductException("!!Product qty can not be negative!");
        }

        for(Product p : productDB){
            if(p.getId().equals(id)){
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                p.setQty(product.getQty());
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean deleteProductById(Long id) throws ProductException {
        return productDB.removeIf(p -> p.getId().equals(id));
    }

    @Override
    public List<Product> getAlProducts() throws ProductException {
        return new ArrayList<>(productDB);
    }

    @Override
    public Product getProductById(Long id) throws ProductException {

        for(Product p : productDB){
            if(p.getId().equals(id)){
                return p;
            }
        }

        return null;
    }
}
