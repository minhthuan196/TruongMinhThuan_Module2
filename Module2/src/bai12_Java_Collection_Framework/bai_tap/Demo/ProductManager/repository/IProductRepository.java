package bai12_Java_Collection_Framework.bai_tap.Demo.ProductManager.repository;

import bai12_Java_Collection_Framework.bai_tap.Demo.ProductManager.model.Product;

import java.util.List;

public interface IProductRepository {
    void createProduct(Product product);

    List<Product> showProduct();

    void updateProduct(Product product);

    void removeProduct(int idProduct);

    Product findProduct(String nameProduct);

    void ascendingSortProduct();

    void descendingSortProduct();


}
