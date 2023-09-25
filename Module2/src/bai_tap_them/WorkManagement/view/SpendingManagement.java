package bai_tap_them.WorkManagement.view;

import bai_tap_them.WorkManagement.controller.SpendingController;
import bai_tap_them.WorkManagement.model.Spending;

import java.util.Scanner;

public class SpendingManagement {

    Scanner scanner = new Scanner(System.in);
    private final SpendingController spendingController = new SpendingController();

    public void showMenu() {
        System.out.println("=======MENU=======");
        System.out.println("1.Show spending");
        System.out.println("2.Create spending");
        System.out.println("3.Remove spending");
        System.out.println("4.Update spending");
        System.out.println("5.Find spending ID");
        System.out.println("6.Find spending char name");
        System.out.println("7.Exit");
    }

    public int chooseMenu() {
        this.showMenu();
        int choose;
        do {
            System.out.println("Enter number in Menu:");
            choose = Integer.parseInt(scanner.nextLine());
            if (choose > 0 && choose < 8) {
                break;
            } else {
                System.out.println("Not number in Menu!!!");
            }
        } while (true);
        return choose;
    }

    public boolean checkSpendingId(String spendingId) {
        for (Spending spending : this.spendingController.showSpending()) {
            if (spending.getSpendingId().equalsIgnoreCase(spendingId)) {
                return true;
            }
        }
        return false;
    }

    public String inputSpendingId() {
        System.out.println("Enter spending ID: ");
        return scanner.nextLine();
    }

    public Spending inputSpendingView() {
        Spending spending = new Spending();
        String spendingId;
        do {
            spendingId = this.inputSpendingId();
            if (this.checkSpendingId(spendingId)) {
                System.out.println("Spending ID already exists");
            } else {
                break;
            }
        } while (true);
        spending.setSpendingId(spendingId);
        System.out.println("Enter spending name: ");
        spending.setSpendingName(scanner.nextLine());
        System.out.println("Enter date of Spending: ");
        spending.setDateOfSpending(scanner.nextLine());
        System.out.println("Enter money spending: ");
        spending.setSpendingMoney(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter note spending: ");
        spending.setNoteSpending(scanner.nextLine());
        return spending;
    }

    public Spending updateSpendingView(String spendingId) {
        for (Spending spending : this.spendingController.showSpending()) {
            if (spending.getSpendingId().equalsIgnoreCase(spendingId)) {
                System.out.println("Enter spending name: ");
                spending.setSpendingName(scanner.nextLine());
                System.out.println("Enter date of Spending: ");
                spending.setDateOfSpending(scanner.nextLine());
                System.out.println("Enter money spending: ");
                spending.setSpendingMoney(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter note spending: ");
                spending.setNoteSpending(scanner.nextLine());
                return spending;
            }
        }
        return null;
    }

    public void managementSpending() {
        int choise = this.chooseMenu();
        switch (choise) {
            case 1:
                System.out.println(this.spendingController.showSpending());
                break;
            case 2:
                Spending spending = this.inputSpendingView();
                this.spendingController.createSpending(spending);
                System.out.println("Create done");
                break;
            case 3:
                String spendingIdDelete = this.inputSpendingId();
                if (this.checkSpendingId(spendingIdDelete)) {
                    this.spendingController.removeSpending(spendingIdDelete);
                    System.out.println("Remove done");
                } else {
                    System.out.println("Spending ID already exists");
                }
                break;
            case 4:
                String spendingIdUpdate = this.inputSpendingId();
                if (this.updateSpendingView(spendingIdUpdate) == null) {
                    System.out.println("Spending ID already exists");
                } else {
                    this.spendingController.findSpendingId(spendingIdUpdate);
                }
                break;
            case 5:
                String spendingIdFind = this.inputSpendingId();
                if (this.checkSpendingId(spendingIdFind)) {
                    System.out.println(this.spendingController.findSpendingId(spendingIdFind));
                } else {
                    System.out.println("Spending ID already exists");
                }
                break;
            case 6:
                System.out.println("Enter name spending: ");
                String spendingName = scanner.nextLine();
                System.out.println(this.spendingController.findSpendingName(spendingName));
                break;
            case 7:
                System.exit(7);
                break;
        }
        this.managementSpending();
    }
}
