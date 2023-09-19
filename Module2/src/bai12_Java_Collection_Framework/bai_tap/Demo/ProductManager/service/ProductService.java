package bai12_Java_Collection_Framework.bai_tap.Demo.ProductManager.service;

import bai12_Java_Collection_Framework.bai_tap.Demo.ProductManager.model.Product;
import bai12_Java_Collection_Framework.bai_tap.Demo.ProductManager.repository.ProductRepositoryRepository;

import java.util.List;

public class ProductService implements IProductService {
    private final ProductRepositoryRepository productRepository = new ProductRepositoryRepository();

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
