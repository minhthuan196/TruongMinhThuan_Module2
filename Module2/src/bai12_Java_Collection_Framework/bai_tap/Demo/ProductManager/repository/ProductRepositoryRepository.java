package bai12_Java_Collection_Framework.bai_tap.Demo.ProductManager.repository;


import bai12_Java_Collection_Framework.bai_tap.Demo.ProductManager.model.Product;

import java.util.ArrayList;
import java.util.List;


public class ProductRepositoryRepository implements IProductRepository {

    private final List<Product> productList = new ArrayList<>();


    {
        productList.add(new Product(1, "tao", 12.6));
        productList.add(new Product(2, "oi", 12.5));
        productList.add(new Product(3, "xoai", 12.2));
    }

    @Override
    public void createProduct(Product product) {
        this.productList.add(product);
    }

    @Override
    public List<Product> showProduct() {
        return this.productList;
    }

    @Override
    public void updateProduct(Product product) {
        for (Product p : productList) {
            if (p.getIdProduct() == product.getIdProduct()) {
                p.setNameProduct(product.getNameProduct());
                p.setPriceProduct(product.getPriceProduct());
            }
        }
    }

    @Override
    public void removeProduct(int idProduct) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getIdProduct() == idProduct) {
                this.productList.remove(productList.get(i));
            }
        }
    }

    @Override
    public Product findProduct(String nameProduct) {
        for (Product product : this.productList) {
            if (product.getNameProduct().equalsIgnoreCase(nameProduct)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void ascendingSortProduct() {
        productList.sort((o1, o2) -> {
            if (o1.getPriceProduct() > o2.getPriceProduct()) {
                return 1;
            } else if (o1.getPriceProduct() == o2.getPriceProduct()) {
                return 0;
            } else {
                return -1;
            }
        });
    }

    @Override
    public void descendingSortProduct() {
        productList.sort((o1, o2) -> {
            if (o1.getPriceProduct() < o2.getPriceProduct()) {
                return 1;
            } else if (o1.getPriceProduct() == o2.getPriceProduct()) {
                return 0;
            } else {
                return -1;
            }
        });
    }

}
