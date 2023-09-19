package bai12_Java_Collection_Framework.bai_tap.Demo.ProductManager.view;

import bai12_Java_Collection_Framework.bai_tap.Demo.ProductManager.controller.ProductController;
import bai12_Java_Collection_Framework.bai_tap.Demo.ProductManager.model.Product;

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

    public Product inputProductView() {
        Product product = new Product();
        System.out.println("Enter ID product: ");
        product.setIdProduct(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter name product: ");
        product.setNameProduct(scanner.nextLine());
        System.out.println("Enter price product: ");
        product.setPriceProduct(Double.parseDouble(scanner.nextLine()));
        return product;
    }

    public Product updateProductView() {
        int idProduct = this.inputIdProduct();
        for (Product product : productController.showProduct()) {
            if (product.getIdProduct() == idProduct) {
                System.out.println("Enter new name: ");
                product.setNameProduct(scanner.nextLine());
                System.out.println("Enter new price: ");
                product.setPriceProduct(Double.parseDouble(scanner.nextLine()));
                return product;
            }
        }
        return null;
    }


    public int inputIdProduct() {
        System.out.println("Enter ID: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public boolean checkIdProduct(int idProduct) {
        for (Product product : this.productController.showProduct()) {
            if (product.getIdProduct() == idProduct) {
                return true;
            }
        }
        return false;
    }


    public void managementProduct() {
        int option = this.choose();
        switch (option) {
            case 1:
                this.productController.createProduct(inputProductView());
                System.out.println("Create successfully");
                break;
            case 2:
                Product product = this.updateProductView();
                if (product == null) {
                    System.out.println("Not find ID!!!");
                } else {
                    this.productController.updateProduct(product);
                    System.out.println("update successfully");
                }
                break;
            case 3:
                int idProduct = this.inputIdProduct();
                if (this.checkIdProduct(idProduct)) {
                    System.out.println("Are you sure you want to update it? (Yes/No)");
                    String confirm = scanner.nextLine();
                    if (confirm.equalsIgnoreCase("Yes")) {
                        this.productController.removeProduct(idProduct);
                        System.out.println("Delete successfully");
                    } else if (confirm.equalsIgnoreCase("No")) {
                        System.out.println("Cancel remove");
                    }
                } else {
                    System.out.println("Not find ID !!!");
                }
                break;
            case 4:
                System.out.println(this.productController.showProduct());
                break;
            case 5:
                System.out.println("Enter name product need find: ");
                Product product1 = this.productController.findProduct(scanner.nextLine());
                if (product1 == null) {
                    System.out.println("Not find product");
                } else {
                    System.out.println(product1);
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
