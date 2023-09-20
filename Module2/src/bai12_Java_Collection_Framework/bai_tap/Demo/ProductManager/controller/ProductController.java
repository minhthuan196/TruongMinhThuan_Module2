package bai12_Java_Collection_Framework.bai_tap.Demo.ProductManager.controller;

import bai12_Java_Collection_Framework.bai_tap.Demo.ProductManager.model.Product;
import bai12_Java_Collection_Framework.bai_tap.Demo.ProductManager.service.impl.ProductServiceImpl;

import java.util.List;

public class ProductController {
    private final ProductServiceImpl productServiceImpl = new ProductServiceImpl();

    public void createProduct(Product product) {
        productServiceImpl.createProduct(product);
    }

    public List<Product> showProduct() {
        return productServiceImpl.showProduct();
    }

    public void updateProduct(Product product) {
        productServiceImpl.updateProduct(product);
    }

    public void removeProduct(int idProduct) {
        productServiceImpl.removeProduct(idProduct);
    }

    public Product findProduct(String nameProduct) {
        return productServiceImpl.findProduct(nameProduct);
    }


    public void ascendingSortProduct() {
        productServiceImpl.ascendingSortProduct();
    }


    public void descendingSortProduct() {
        productServiceImpl.descendingSortProduct();
    }

}
