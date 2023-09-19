package bai12_Java_Collection_Framework.bai_tap.Demo.ProductManager.controller;

import bai12_Java_Collection_Framework.bai_tap.Demo.ProductManager.model.Product;
import bai12_Java_Collection_Framework.bai_tap.Demo.ProductManager.service.ProductService;

import java.util.List;

public class ProductController {
    private final ProductService productService = new ProductService();

    public void createProduct(Product product) {
        productService.createProduct(product);
    }

    public List<Product> showProduct() {
        return productService.showProduct();
    }

    public void updateProduct(Product product) {
        productService.updateProduct(product);
    }

    public void removeProduct(int idProduct) {
        productService.removeProduct(idProduct);
    }

    public Product findProduct(String nameProduct) {
        return productService.findProduct(nameProduct);
    }


    public void ascendingSortProduct() {
        productService.ascendingSortProduct();
    }


    public void descendingSortProduct() {
        productService.descendingSortProduct();
    }

}
