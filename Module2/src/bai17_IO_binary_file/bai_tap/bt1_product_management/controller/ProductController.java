package bai17_IO_binary_file.bai_tap.bt1_product_management.controller;

import bai17_IO_binary_file.bai_tap.bt1_product_management.model.Product;
import bai17_IO_binary_file.bai_tap.bt1_product_management.service.IProductService;
import bai17_IO_binary_file.bai_tap.bt1_product_management.service.impl.ProductService;

import java.util.List;

public class ProductController {
    private final IProductService productService = new ProductService();

    public List<Product> showAllProduct() {
        return productService.showAllProduct();
    }


    public void createProduct(Product product) {
        productService.createProduct(product);
    }


    public Product findProduct(int id) {
        return productService.findProduct(id);
    }
}
