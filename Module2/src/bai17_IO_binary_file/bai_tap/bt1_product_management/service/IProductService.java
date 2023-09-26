package bai17_IO_binary_file.bai_tap.bt1_product_management.service;

import bai17_IO_binary_file.bai_tap.bt1_product_management.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> showAllProduct();

    void createProduct(Product product);

    Product findProduct(int id);
}
