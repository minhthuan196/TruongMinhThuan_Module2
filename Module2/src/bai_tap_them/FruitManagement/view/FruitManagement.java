package bai_tap_them.FruitManagement.view;

import bai_tap_them.FruitManagement.controller.FruitController;
import bai_tap_them.FruitManagement.model.Fruit;

import java.util.Scanner;

public class FruitManagement {

    Scanner scanner = new Scanner(System.in);

    private final FruitController fruitController = new FruitController();

    public void menuFruit() {
        System.out.println("========MENU========");
        System.out.println("1. Show list Fruit");
        System.out.println("2. Create a fruit");
        System.out.println("3. Remove a fruit");
        System.out.println("4. Find a fruit");
        System.out.println("5. Update a fruit");
        System.out.println("6. sort by price fruit");
        System.out.println("7. exit!!");
    }

    public int choose() {
        int choiceOption;
        do {
            this.menuFruit();
            System.out.println("Enter choose the Menu: ");
            choiceOption = Integer.parseInt(scanner.nextLine());
            if (choiceOption > 0 && choiceOption < 8) {
                break;
            } else {
                System.out.println("number not in menu. Enter again!!");
            }
        } while (true);
        return choiceOption;
    }

    public boolean checkNameFruit(String nameFruit) {
        for (Fruit fruit : this.fruitController.showFruit()) {
            if (nameFruit.equalsIgnoreCase(fruit.getNameFruit())) {
                return true;
            }
        }
        return false;
    }

    public String inputNameFruit() {
        System.out.println("Enter name fruit: ");
        String nameFruit = scanner.nextLine();
        return nameFruit;
    }

    public Fruit inputFruit() {
        Fruit fruit = new Fruit();
        String nameFruit;
        do {
            nameFruit = this.inputNameFruit();
            if (this.checkNameFruit(nameFruit)) {
                System.out.println("Fruit already exists!! Enter again");
            } else {
                break;
            }
        } while (true);
        fruit.setNameFruit(nameFruit);
        System.out.println("Enter type fruit: ");
        fruit.setTypeFruit(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter date of manufacture: ");
        fruit.setDateOfManufacture(scanner.nextLine());
        System.out.println("Enter expiry: ");
        fruit.setExpiry(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter origin: ");
        fruit.setOrigin(scanner.nextLine());
        System.out.println("Enter price: ");
        fruit.setPrice(Double.parseDouble(scanner.nextLine()));
        return fruit;
    }

    public Fruit updateFruitView(String nameFruitUpdate) {
        for (Fruit fruit : this.fruitController.showFruit()) {
            if (fruit.getNameFruit().equalsIgnoreCase(nameFruitUpdate)) {
                System.out.println("Enter type fruit: ");
                fruit.setTypeFruit(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter date of manufacture: ");
                fruit.setDateOfManufacture(scanner.nextLine());
                System.out.println("Enter expiry: ");
                fruit.setExpiry(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter origin: ");
                fruit.setOrigin(scanner.nextLine());
                System.out.println("Enter price: ");
                fruit.setPrice(Double.parseDouble(scanner.nextLine()));
                return fruit;
            }
        }
        return null;
    }

    public void managementFruit() {
        int choose = this.choose();
        switch (choose) {
            case 1:
                System.out.println("List of Fruit: ");
                System.out.println(this.fruitController.showFruit());
                break;
            case 2:
                this.fruitController.creatFruit(this.inputFruit());
                System.out.println("Create done!!!");
                break;
            case 3:
                String nameFruitDelete = this.inputNameFruit();
                if (this.checkNameFruit(nameFruitDelete)) {
                    System.out.println("Do you want delete ? (Y/N)");
                    String confirm = scanner.nextLine();
                    if (confirm.equalsIgnoreCase("Y")) {
                        this.fruitController.removeFruit(nameFruitDelete);
                        System.out.println("delete done!!!");
                    } else {
                        System.out.println("Cancel delete!!!");
                    }
                } else {
                    System.out.println("Not find name Fruit");
                }
                break;
            case 4:
                String nameFruitFind = this.inputNameFruit();
                if (this.checkNameFruit(nameFruitFind)) {
                    System.out.println(this.fruitController.findFruit(nameFruitFind));
                } else {
                    System.out.println("Not find Fruit!!!");
                }
                break;
            case 5:
                String nameFruitUpdate = this.inputNameFruit();
                Fruit fruit = this.updateFruitView(nameFruitUpdate);
                if (fruit == null) {
                    System.out.println("Not Find name Fruit");
                } else {
                    this.fruitController.updateFruit(fruit);
                    System.out.println("Update done!!!");
                }
                break;
            case 6:
                this.fruitController.arrangeFruit();
                System.out.println(this.fruitController.showFruit());
                break;
            case 7:
                System.exit(7);
                break;
        }
        this.managementFruit();
    }
}
