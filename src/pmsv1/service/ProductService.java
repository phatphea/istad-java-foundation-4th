package pmsv1.service;

import pmsv1.exception.ProductException;
import pmsv1.model.Product;

import java.util.List;

public interface ProductService {

    boolean createProduct(Product product) throws ProductException;

    boolean updateProductById(Long id, Product product) throws ProductException;

    boolean deleteProductById(Long id) throws ProductException;

    List<Product> getAlProducts() throws ProductException;

    Product getProductById(Long id) throws ProductException;

}
