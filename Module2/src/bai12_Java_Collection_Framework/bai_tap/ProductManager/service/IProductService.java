package bai12_Java_Collection_Framework.bai_tap.ProductManager.service;

import bai12_Java_Collection_Framework.bai_tap.ProductManager.model.Product;

import java.util.List;

public interface IProductService {
    void createProduct(Product product);

    List<Product> showProduct();

    void updateProduct(int idProduct);

    void removeProduct(int idProduct);

    Product findProduct(String nameProduct);

    void ascendingSortProduct();

    void descendingSortProduct();
}
