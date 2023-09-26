package bai17_IO_binary_file.bai_tap.bt1_product_management.service.impl;

import bai17_IO_binary_file.bai_tap.bt1_product_management.model.Product;
import bai17_IO_binary_file.bai_tap.bt1_product_management.repository.IProductRepository;
import bai17_IO_binary_file.bai_tap.bt1_product_management.repository.impl.ProductRepository;
import bai17_IO_binary_file.bai_tap.bt1_product_management.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {

    private final IProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> showAllProduct() {
        return productRepository.showAllProduct();
    }

    @Override
    public void createProduct(Product product) {
        productRepository.createProduct(product);
    }

    @Override
    public Product findProduct(int id) {
        return productRepository.findProduct(id);
    }
}
