package bai12_Java_Collection_Framework.bai_tap.ProductManager.view;

import bai12_Java_Collection_Framework.bai_tap.ProductManager.controller.ProductController;
import bai12_Java_Collection_Framework.bai_tap.ProductManager.model.Product;

import java.util.Scanner;

public class ProductManagement {
    Scanner scanner = new Scanner(System.in);
    private final ProductController productController = new ProductController();

    public void showMenu() {
        System.out.println("=============MENU=============");
        System.out.println("1: Create new product");
        System.out.println("2: Update product");
        System.out.println("3: Remove product");
        System.out.println("4: Show product");
        System.out.println("5: Find product");
        System.out.println("6: Ascending sort product");
        System.out.println("7: Descending sort product");
        System.out.println("8: Exit");
    }

    public int choose() {
        int choiceOption;
        this.showMenu();
        do {
            System.out.println("Please choose number MENU");
            choiceOption = Integer.parseInt(scanner.nextLine());
            if (choiceOption <= 0 || choiceOption > 8) {
                System.out.println("Not Menu.Enter again!!");
                this.showMenu();
            } else {
                break;
            }
        } while (true);
        return choiceOption;
    }

    public Product inputProduct() {
        Product product = new Product();
        System.out.println("Enter ID product: ");
        product.setIdProduct(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter name product: ");
        product.setNameProduct(scanner.nextLine());
        System.out.println("Enter price product: ");
        product.setPriceProduct(Double.parseDouble(scanner.nextLine()));
        return product;
    }

    public void managementProduct() {
        int option = this.choose();
        switch (option) {
            case 1:
                this.productController.createProduct(inputProduct());
                break;
            case 2:
                System.out.println("Enter ID need update: ");
                this.productController.updateProduct(Integer.parseInt(scanner.nextLine()));
                break;
            case 3:
                System.out.println("Enter ID need remove: ");
                this.productController.removeProduct(Integer.parseInt(scanner.nextLine()));
                break;
            case 4:
                System.out.println(this.productController.showProduct());
                break;
            case 5:
                System.out.println("Enter name product need find: ");
                Product product = this.productController.findProduct(scanner.nextLine());
                if (product == null) {
                    System.out.println("Not find product!!!");
                } else {
                    System.out.println(product);
                }
                break;
            case 6:
                System.out.println("Ascending sort product!!");
                this.productController.ascendingSortProduct();
                System.out.println(this.productController.showProduct());
                break;
            case 7:
                System.out.println("Descending sort product!!!");
                this.productController.descendingSortProduct();
                System.out.println(this.productController.showProduct());
                break;
            case 8:
                System.exit(8);
                break;
        }
        this.managementProduct();
    }

}
