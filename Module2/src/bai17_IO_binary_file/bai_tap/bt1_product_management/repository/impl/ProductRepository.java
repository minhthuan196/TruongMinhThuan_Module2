package bai17_IO_binary_file.bai_tap.bt1_product_management.repository.impl;

import bai17_IO_binary_file.bai_tap.bt1_product_management.model.Product;
import bai17_IO_binary_file.bai_tap.bt1_product_management.repository.AbstractRepository;
import bai17_IO_binary_file.bai_tap.bt1_product_management.repository.IProductRepository;

import java.util.List;

public class ProductRepository extends AbstractRepository<Product> implements IProductRepository {


    public static final String PRODUCT_DAT = "D:\\Codegym\\module2\\Module2\\src\\bai17_IO_binary_file\\bai_tap\\bt1_product_management\\repository\\product.dat";

    @Override
    public List<Product> showAllProduct() {
        return readByByteStream(PRODUCT_DAT);
    }

    @Override
    public void createProduct(Product product) {
        List<Product> products = showAllProduct();
        products.add(product);
        writeByByteStream(PRODUCT_DAT, products);

    }

    @Override
    public Product findProduct(int id) {
        List<Product> products = showAllProduct();
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
