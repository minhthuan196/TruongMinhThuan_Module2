package bai12_Java_Collection_Framework.bai_tap.ProductManager.repository;

import bai12_Java_Collection_Framework.bai_tap.ProductManager.model.Product;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepositoryRepository implements IProductRepository {

    private final List<Product> productList = new ArrayList<>();


    {
        productList.add(new Product(1, "tao", 12.6));
        productList.add(new Product(2, "oi", 12.5));
        productList.add(new Product(3, "xoai", 12.2));
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void createProduct(Product product) {
        this.productList.add(product);
    }

    @Override
    public List<Product> showProduct() {
        return this.productList;
    }

    @Override
    public void updateProduct(int idProduct) {
        boolean flag = true;
        for (Product product : this.productList) {
            if (product.getIdProduct() == idProduct) {
                flag = false;
                System.out.println("Are you sure you want to update it? (Yes/No)");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Yes")) {
                    System.out.println("Enter new name product: ");
                    product.setNameProduct(scanner.nextLine());
                    System.out.println("Enter new price product: ");
                    product.setPriceProduct(Double.parseDouble(scanner.nextLine()));
                    System.out.println("update successfully");
                    return;
                } else if (confirm.equalsIgnoreCase("No")) {
                    System.out.println("Cancel update");
                    return;
                }
            }
        }
        if (flag) {
            System.out.println("No find ID!!!");
        }
    }

    @Override
    public void removeProduct(int idProduct) {
        boolean flag = true;
        for (Product product : productList) {
            if (product.getIdProduct() == idProduct) {
                flag = false;
                System.out.println("Are you sure you want to delete it? (Yes/No)");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Yes")) {
                    this.productList.remove(product);
                    System.out.println("Remove successfully");
                    return;
                } else if (confirm.equalsIgnoreCase("No")) {
                    System.out.println("Cancel remove");
                    return;
                }
            }
        }
        if (flag) {
            System.out.println("No find ID!!!");
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
