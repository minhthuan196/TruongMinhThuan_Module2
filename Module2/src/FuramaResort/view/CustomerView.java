package FuramaResort.view;

import FuramaResort.controller.CustomerController;
import FuramaResort.model.person.Customer;
import FuramaResort.utils.RegexUtil;
import FuramaResort.utils.ConfirmUtil;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private final CustomerController customerController = new CustomerController();
    private final Scanner scanner = new Scanner(System.in);
    private static final String ID_CUSTOMER = "^KH-[0-9]{4}$";

    public void managementCustomer() {
        do {
            switch (chooseMenuCustomer()) {
                case 1:
                    displayListCustomer(customerController.showCustomer());
                    break;
                case 2:
                    this.customerController.createCustomer(createCustomerNew());
                    System.out.println("Create customer done");
                    break;
                case 3:
                    String idCustomerEdit = inputIdCustomer();
                    Customer customerEdit = createCustomerEdit(idCustomerEdit);
                    if (customerEdit == null) {
                        System.out.println("Id " + idCustomerEdit + " not find");
                    } else {
                        this.customerController.updateCustomer(customerEdit);
                        System.out.println("Update customer with Id customer " + customerEdit.getIdCustomer() + " done");
                    }
                    break;
                case 4:
                    String idCustomerDelete = inputIdCustomer();
                    Customer customer = getCustomerDetail(idCustomerDelete);
                    if (customer != null) {
                        System.out.println(customer);
                        deleteCustomer(idCustomerDelete);
                    } else {
                        System.out.println("Id " + idCustomerDelete + " not find");
                    }
                    break;
                case 5:
                    List<Customer> customers = customerController.findCustomer(PersonView.inputNameNeedFind());
                    if (customers.size() == 0) {
                        System.out.println("Name not found!!!");
                    } else {
                        displayListCustomer(customers);
                    }
                    break;
                case 6:
                    return;
            }
        } while (true);
    }

    private void displayListCustomer(List<Customer> customers) {
        System.out.println("=============LIST CUSTOMER=============");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n"
                , "Id Customer", "Name", "Date Of Birth", "Gender", "Identity Card",
                "Phone Number", "Mail", "Customer Type", "Address");
        for (Customer customer : customers) {
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n",
                    customer.getIdCustomer(), customer.getName(), customer.getDateOfBirth()
                    , customer.getGender(), customer.getIdentityCard(), customer.getPhoneNumber()
                    , customer.getMail(), customer.getCustomerType(), customer.getAddress());
        }
    }

    private Customer getCustomerDetail(String idCustomer) {
        for (Customer customer : this.customerController.showCustomer()) {
            if (customer.getIdCustomer().equalsIgnoreCase(idCustomer)) {
                return customer;
            }
        }
        return null;
    }

    private int chooseMenuCustomer() {
        int chooseMenuEmployee;
        do {
            try {
                this.displayCustomer();
                System.out.println("Choose option in Menu Customer:");
                chooseMenuEmployee = Integer.parseInt(scanner.nextLine());
                if (chooseMenuEmployee <= 0 || chooseMenuEmployee > 6) {
                    System.out.println("Not in Menu. Choose again!!!!");
                } else {
                    return chooseMenuEmployee;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid.Choose again!!!!");
            }
        } while (true);
    }

    private void deleteCustomer(String idCustomer) {
        int confirm = ConfirmUtil.getConfirm(idCustomer);
        switch (confirm) {
            case 1:
                this.customerController.removeCustomer(idCustomer);
                System.out.println("Remove customer with ID " + idCustomer + " done");
                break;
            case 2:
                System.out.println("Cancel delete!!!");
                break;
        }
    }

    private void displayCustomer() {
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Delete customer");
        System.out.println("5. Search by name customer");
        System.out.println("6. Return main menu");
    }

    private Customer createCustomerNew() {
        Customer customer = new Customer();
        String idCustomer;
        do {
            idCustomer = inputIdCustomer();
            if (checkIdCustomer(idCustomer)) {
                System.out.println("id already exists");
            }
        } while (checkIdCustomer(idCustomer));
        customer.setIdCustomer(idCustomer);
        inputCustomer(customer);
        return customer;
    }

    private void inputCustomer(Customer customer) {
        PersonView.inputInformationPerson(customer);
        String customerType = inputCustomerType();
        customer.setCustomerType(customerType);
        String address = inputAddressCustomer();
        customer.setAddress(address);
    }

    private String inputAddressCustomer() {
        String address;
        do {
            System.out.println("Enter address customer: ");
            address = scanner.nextLine();
            if (address.equalsIgnoreCase("")) {
                System.out.println("Not be empty. Enter again!!!");
            } else {
                break;
            }
        } while (true);
        return address;
    }

    private String inputCustomerType() {
        int choiceCustomerType;
        do {
            try {
                System.out.println("Choose customer type (Diamond/Platinum/Gold/Silver/Member): ");
                System.out.println("1.Diamond");
                System.out.println("2.Platinum");
                System.out.println("3.Gold");
                System.out.println("4.Silver");
                System.out.println("5.Member");
                choiceCustomerType = Integer.parseInt(scanner.nextLine());
                if (choiceCustomerType <= 0 || choiceCustomerType > 5) {
                    System.out.println("Not in Menu.Choose again!!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid.Choose again!!!");
            }

        } while (true);
        if (choiceCustomerType == 1) {
            return "Diamond";
        } else if (choiceCustomerType == 2) {
            return "Platinum";
        } else if (choiceCustomerType == 3) {
            return "Gold";
        } else if (choiceCustomerType == 4) {
            return "Silver";
        } else {
            return "Member";
        }
    }

    private String inputIdCustomer() {
        String idCustomer;
        do {
            System.out.println("Enter ID Customer (KH-1234): ");
            idCustomer = scanner.nextLine();
            if (RegexUtil.validateString(idCustomer, ID_CUSTOMER)) {
                return idCustomer;
            } else {
                System.out.println("Invalid!!!");
            }
        } while (true);
    }

    private boolean checkIdCustomer(String idCustomer) {
        for (Customer customer : this.customerController.showCustomer()) {
            if (customer.getIdCustomer().equalsIgnoreCase(idCustomer)) {
                return true;
            }
        }
        return false;
    }

    private Customer createCustomerEdit(String idCustomerEdit) {
        Customer customer = getCustomerDetail(idCustomerEdit);
        if (customer != null) {
            do {
                int choiceEditAttribute;
                do {
                    try {
                        System.out.println("Choose information Customer need update: ");
                        System.out.println("1.Name: " + customer.getName());
                        System.out.println("2.Date of birth: " + customer.getDateOfBirth());
                        System.out.println("3.Gender: " + customer.getGender());
                        System.out.println("4.Identity Card: " + customer.getIdentityCard());
                        System.out.println("5.Phone Number: " + customer.getPhoneNumber());
                        System.out.println("6.Email: " + customer.getMail());
                        System.out.println("7.Customer type: " + customer.getIdCustomer());
                        System.out.println("8.Address: " + customer.getAddress());
                        System.out.println("9.Done edit");
                        choiceEditAttribute = Integer.parseInt(scanner.nextLine());
                        if (choiceEditAttribute <= 0 || choiceEditAttribute > 9) {
                            System.out.println("Not in Menu.Choose again!!");
                        } else {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid.Choose again!!!");
                    }
                } while (true);
                switch (choiceEditAttribute) {
                    case 1:
                        customer.setName(PersonView.inputName());
                        break;
                    case 2:
                        customer.setDateOfBirth(PersonView.inputDateOfBirth());
                        break;
                    case 3:
                        customer.setGender(PersonView.inputGender());
                        break;
                    case 4:
                        customer.setIdentityCard(PersonView.inputIdentityCard());
                        break;
                    case 5:
                        customer.setPhoneNumber(PersonView.inputPhoneNumber());
                        break;
                    case 6:
                        customer.setMail(PersonView.inputEmail());
                        break;
                    case 7:
                        customer.setCustomerType(inputCustomerType());
                        break;
                    case 8:
                        customer.setAddress(inputAddressCustomer());
                        break;
                    case 9:
                        return customer;
                }
            } while (true);
        } else {
            return null;
        }
    }
}
