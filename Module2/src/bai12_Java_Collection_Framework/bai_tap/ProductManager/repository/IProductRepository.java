package bai12_Java_Collection_Framework.bai_tap.ProductManager.repository;

import bai12_Java_Collection_Framework.bai_tap.ProductManager.model.Product;

import java.util.List;

public interface IProductRepository {
    void createProduct(Product product);

    List<Product> showProduct();

    void updateProduct(int IdProduct);

    void removeProduct(int idProduct);

    Product findProduct(String nameProduct);

    void ascendingSortProduct();

    void descendingSortProduct();


}
