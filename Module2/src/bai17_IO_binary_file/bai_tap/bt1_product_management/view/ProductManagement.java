package bai17_IO_binary_file.bai_tap.bt1_product_management.view;

import bai17_IO_binary_file.bai_tap.bt1_product_management.controller.ProductController;
import bai17_IO_binary_file.bai_tap.bt1_product_management.model.Product;

import java.util.Scanner;

public class ProductManagement {
    private final ProductController productController = new ProductController();
    private final Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("========MENU========");
        System.out.println("1,Create product");
        System.out.println("2,Show product");
        System.out.println("3,Find product by Id");
        System.out.println("4, Exit");
    }

    public int chooseMenu() {
        int choose;
        do {
            try {
                this.showMenu();
                System.out.println("Enter number Menu: ");
                choose = Integer.parseInt(scanner.nextLine());
                checkChoose(choose);
                return choose;
            } catch (NumberFormatException e) {
                System.out.println("Enter a number in Menu");
            }
        } while (true);
    }

    public int inputIdProduct() {
        System.out.println("Enter Id product: ");
        return Integer.parseInt(scanner.nextLine());

    }

    public boolean checkIdProduct(int id) {
        for (Product product : productController.showAllProduct()) {
            if (product.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public Product inputProduct() {
        Product product = new Product();
        int id;
        do {
            try {
                id = inputIdProduct();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter number");
            }
        } while (true);
        product.setId(id);
        String name;
        do {
            System.out.println("Enter name product: ");
            name = scanner.nextLine();
            if (name.equalsIgnoreCase("")) {
                System.out.println("Enter name again");
            } else {
                break;
            }
        } while (true);
        product.setName(name);
        double price;
        do {
            try {
                System.out.println("Enter price product: ");
                price = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter number");
            }
        } while (true);
        product.setPrice(price);
        String manufacture;
        do {
            System.out.println("Enter manufacture product: ");
            manufacture = scanner.nextLine();
            if (manufacture.equalsIgnoreCase("")) {
                System.out.println("Enter manufacture again");
            } else {
                break;
            }
        } while (true);
        product.setManufacturer(manufacture);
        String note;
        do {
            System.out.println("Enter note product: ");
            note = scanner.nextLine();
            if (note.equalsIgnoreCase("")) {
                System.out.println("Enter note again");
            } else {
                break;
            }
        } while (true);
        product.setNote(note);
        return product;
    }

    public void managementProduct() {
        int choose = this.chooseMenu();
        switch (choose) {
            case 1:
                productController.createProduct(inputProduct());
                System.out.println("Create done");
                break;
            case 2:
                System.out.println(productController.showAllProduct());
                break;
            case 3:
                int id = inputIdProduct();
                if (checkIdProduct(id)) {
                    System.out.println(productController.findProduct(id));
                } else {
                    System.out.println("Not find product with id " + id);
                }
                break;
            case 4:
                System.exit(4);
                break;
        }
        this.managementProduct();
    }

    public void checkChoose(int choose) throws NumberFormatException {
        if (choose <= 0 || choose > 4) {
            System.out.println("Enter number in Menu (1 => 4)");
        }
    }
}
