package bai12_Java_Collection_Framework.bai_tap.Demo.ProductManager.service.impl;

import bai12_Java_Collection_Framework.bai_tap.Demo.ProductManager.model.Product;
import bai12_Java_Collection_Framework.bai_tap.Demo.ProductManager.repository.impl.ProductRepositoryRepositoryImpl;
import bai12_Java_Collection_Framework.bai_tap.Demo.ProductManager.service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private final ProductRepositoryRepositoryImpl productRepository = new ProductRepositoryRepositoryImpl();

    @Override
    public void createProduct(Product product) {
        productRepository.createProduct(product);
    }

    @Override
    public List<Product> showProduct() {
        return productRepository.showProduct();
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.updateProduct(product);
    }

    @Override
    public void removeProduct(int idProduct) {
        productRepository.removeProduct(idProduct);
    }

    @Override
    public Product findProduct(String nameProduct) {
        return productRepository.findProduct(nameProduct);
    }

    @Override
    public void ascendingSortProduct() {
        productRepository.ascendingSortProduct();
    }

    @Override
    public void descendingSortProduct() {
        productRepository.descendingSortProduct();
    }
}
