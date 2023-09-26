package bai17_IO_binary_file.bai_tap.bt1_product_management.repository;

import bai17_IO_binary_file.bai_tap.bt1_product_management.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> showAllProduct();

    void createProduct(Product product);

    Product findProduct(int id);
}
