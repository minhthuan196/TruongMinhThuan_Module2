package FuramaResort.view;

import FuramaResort.controller.CustomerController;
import FuramaResort.controller.EmployeeController;
import FuramaResort.controller.FacilityController;
import FuramaResort.model.facility.Facility;
import FuramaResort.model.facility.House;
import FuramaResort.model.facility.Room;
import FuramaResort.model.facility.Villa;
import FuramaResort.model.person.Customer;
import FuramaResort.model.person.Employee;
import FuramaResort.model.person.Person;
import FuramaResort.utils.RegexUtil;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FuramaManagement {
    private final Scanner scanner = new Scanner(System.in);
    private final EmployeeController employeeController = new EmployeeController();
    private final CustomerController customerController = new CustomerController();
    private final FacilityController facilityController = new FacilityController();
    private static final String ID_EMPLOYEE = "^NV-[0-9]{4}$";
    private static final String ID_CUSTOMER = "^KH-[0-9]{4}$";
    private static final String ID_VILLA = "^SVVL-[0-9]{4}$";
    private static final String ID_HOUSE = "^SVHO-[0-9]{4}$";
    private static final String ID_ROOM = "^SVRO-[0-9]{4}$";
    private static final String NAME_EMPLOYEE = "^[A-Z][a-z]{0,10}$";
    private static final String IDENTITY_CARD_EMPLOYEE = "^([0-9]{9}|[0-9]{12})$";
    private static final String PHONE_NUMBER_EMPLOYEE = "^0[0-9]{9}$";
    private static final String EMAIL_EMPLOYEE = "(^.*@gmail.com$)|(^.*@outlook.com$)";
    private final RegexUtil regexUtil = new RegexUtil();

    public void managementFurama() {
        int chooseMenu = this.chooseMenu();
        switch (chooseMenu) {
            case 1:
                this.managementEmployee();
                break;
            case 2:
                this.managementCustomer();
                break;
            case 3:
                this.managementFacility();
                break;
            case 4:
                this.managementBooking();
                break;
            case 5:
                this.managementPromotion();
                break;
            case 6:
                System.exit(6);
                break;
        }
        this.managementFurama();
    }

    private void managementEmployee() {
        int chooseMenuEmployee = this.chooseMenuEmployee();
        switch (chooseMenuEmployee) {
            case 1:
                System.out.println(this.employeeController.showEmployee());
                break;
            case 2:
                this.employeeController.createEmployee(createEmployeeView());
                System.out.println("Create employee done");
                break;
            case 3:
                Employee employeeEdit = this.createEmployeeEdit();
                if (employeeEdit == null) {
                    System.out.println("Id not find need update");
                } else {
                    this.employeeController.updateEmployee(employeeEdit);
                    System.out.println("Update employee done");
                }
                break;
            case 4:
                String idEmployee = this.inputIdEmployee();
                if (checkIdEmployee(idEmployee)) {
                    this.employeeController.removeEmployee(idEmployee);
                    System.out.println("Remove employee done");
                } else {
                    System.out.println("Id not find need remove");
                }
                break;
            case 5:
                String name = inputNameNeedFind();
                List<Employee> employees = this.employeeController.findEmployee(name);
                if (employees.size() == 0) {
                    System.out.println("Name not found!!!");
                } else {
                    System.out.println(employees);
                }
                break;
            case 6:
                return;
        }
        this.managementEmployee();
    }

    private void managementCustomer() {
        int chooseMenuCustomer = this.chooseMenuCustomer();
        switch (chooseMenuCustomer) {
            case 1:
                System.out.println(this.customerController.showCustomer());
                break;
            case 2:
                this.customerController.createCustomer(createCustomerView());
                System.out.println("Create customer done");
                break;
            case 3:
                Customer customerEdit = this.createCustomerEdit();
                if (customerEdit == null) {
                    System.out.println("Id not find need update");
                } else {
                    this.customerController.updateCustomer(customerEdit);
                    System.out.println("Update customer done");
                }
                break;
            case 4:
                String idCustomer = this.inputIdCustomer();
                if (checkIdCustomer(idCustomer)) {
                    this.customerController.removeCustomer(idCustomer);
                    System.out.println("Remove customer done");
                } else {
                    System.out.println("Id not find need remove");
                }
                break;
            case 5:
                String name = inputNameNeedFind();
                List<Customer> customers = this.customerController.findCustomer(name);
                if (customers.size() == 0) {
                    System.out.println("Name not found!!!");
                } else {
                    System.out.println(customers);
                }
                break;
            case 6:
                return;
        }
        this.managementCustomer();
    }

    private void managementFacility() {
        int chooseMenuFacility = this.chooseMenuFacility();
        switch (chooseMenuFacility) {
            case 1:
                System.out.println("key: " + this.facilityController.showFacility().keySet() + "value: " + this.facilityController.showFacility().values());
                break;
            case 2:
                Facility facility = createFacilityView();
                if (facility != null) {
                    this.facilityController.createFacility(facility);
                    System.out.println("Create Facility done");
                }
                break;
            case 3:
                LinkedHashMap<Facility, Integer> facilities = this.facilityController.showFacilityMaintenance();
                if (facilities.size() == 0) {
                    System.out.println("There are no services that require maintenance");
                } else {
                    System.out.println(facilities);
                }
                break;
            case 4:
                Facility facilityRemove = getFacilityRemove();
                if (facilityRemove == null) {
                    System.out.println("Facility not find");
                } else {
                    this.facilityController.removeFacility(facilityRemove);
                    System.out.println("Facility with ID: " + facilityRemove.getIdService() + " remove done!!!");
                }
                break;
            case 5:
                return;
        }
        this.managementFacility();

    }

    private void managementBooking() {
        int chooseMenuBooking = this.chooseMenuBooking();
        switch (chooseMenuBooking) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                break;
            case 6:
                return;
        }
        this.managementBooking();
    }

    private void managementPromotion() {
        int chooseMenuPromotion = this.chooseMenuPromotion();
        switch (chooseMenuPromotion) {
            case 1:
            case 2:
                break;
            case 3:
                return;
        }
        this.managementPromotion();
    }

    private void displayMainMenu() {
        System.out.println("==========MENU==========");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
    }

    private void displayEmployee() {
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Delete employee");
        System.out.println("5. Search by name employee");
        System.out.println("6. Return main menu");
    }

    private void displayCustomer() {
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Delete customer");
        System.out.println("5. Search by name customer");
        System.out.println("6. Return main menu");
    }

    private void displayFacility() {
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Delete facility");
        System.out.println("5. Return main menu");
    }

    private void displayBooking() {
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new contracts");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
    }

    private void displayPromotion() {
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get voucher");
        System.out.println("3. Return main menu");
    }

    private int chooseMenu() {
        int chooseOption;
        do {
            try {
                this.displayMainMenu();
                System.out.println("Choose option in Menu:");
                chooseOption = Integer.parseInt(scanner.nextLine());
                if (chooseOption <= 0 || chooseOption > 6) {
                    System.out.println("Enter number in Menu. Enter again!!!!");
                } else {
                    return chooseOption;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter number in Menu. Enter again!!!!");
            }
        } while (true);
    }

    private int chooseMenuEmployee() {
        int chooseOptionEmployee;
        do {
            try {
                this.displayEmployee();
                System.out.println("Choose option in Menu Employee:");
                chooseOptionEmployee = Integer.parseInt(scanner.nextLine());
                if (chooseOptionEmployee <= 0 || chooseOptionEmployee > 6) {
                    System.out.println("Enter number in Menu Employee. Enter again!!!!");
                } else {
                    return chooseOptionEmployee;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter number in Menu Employee. Enter again!!!!");
            }
        } while (true);
    }

    private int chooseMenuCustomer() {
        int chooseMenuEmployee;
        do {
            try {
                this.displayCustomer();
                System.out.println("Choose option in Menu Customer:");
                chooseMenuEmployee = Integer.parseInt(scanner.nextLine());
                if (chooseMenuEmployee <= 0 || chooseMenuEmployee > 6) {
                    System.out.println("Enter number in Menu Customer. Enter again!!!!");
                } else {
                    return chooseMenuEmployee;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter number in Menu Customer. Enter again!!!!");
            }
        } while (true);
    }

    private int chooseMenuFacility() {
        int chooseMenuFacility;
        do {
            try {
                this.displayFacility();
                System.out.println("Choose option in Menu Facility:");
                chooseMenuFacility = Integer.parseInt(scanner.nextLine());
                if (chooseMenuFacility <= 0 || chooseMenuFacility > 5) {
                    System.out.println("Enter number in Menu Facility. Enter again!!!!");
                } else {
                    return chooseMenuFacility;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter number in Menu Facility. Enter again!!!!");
            }
        } while (true);
    }

    private int chooseMenuBooking() {
        int chooseMenuBooking;
        do {
            try {
                this.displayBooking();
                System.out.println("Choose option in Menu Booking:");
                chooseMenuBooking = Integer.parseInt(scanner.nextLine());
                if (chooseMenuBooking <= 0 || chooseMenuBooking > 6) {
                    System.out.println("Enter number in Menu Booking. Enter again!!!!");
                } else {
                    return chooseMenuBooking;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter number in Menu Booking. Enter again!!!!");
            }
        } while (true);
    }

    private int chooseMenuPromotion() {
        int chooseMenuPromotion;
        do {
            try {
                this.displayPromotion();
                System.out.println("Choose option in Menu Promotion:");
                chooseMenuPromotion = Integer.parseInt(scanner.nextLine());
                if (chooseMenuPromotion <= 0 || chooseMenuPromotion > 3) {
                    System.out.println("Enter number in Menu Promotion. Enter again!!!!");
                } else {
                    return chooseMenuPromotion;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter number in Menu Promotion. Enter again!!!!");
            }
        } while (true);
    }

    private boolean checkIdEmployee(String idEmployee) {
        for (Employee employee : this.employeeController.showEmployee()) {
            if (employee.getIdEmployee().equalsIgnoreCase(idEmployee)) {
                return true;
            }
        }
        return false;
    }

    private String inputIdEmployee() {
        String idEmployee;
        do {
            System.out.println("Enter ID Employee (NV-1234): ");
            idEmployee = scanner.nextLine();
            if (regexUtil.validateString(idEmployee, ID_EMPLOYEE)) {
                return idEmployee;
            } else {
                System.out.println("ID format is not correct!!!");
            }
        } while (true);
    }

    private Employee createEmployeeView() {
        Employee employee = new Employee();
        String idEmployee;
        do {
            idEmployee = inputIdEmployee();
            if (checkIdEmployee(idEmployee)) {
                System.out.println("id already exists");
            }
        } while (checkIdEmployee(idEmployee));
        employee.setIdEmployee(idEmployee);
        inputEmployee(employee);
        return employee;
    }

    private Employee createEmployeeEdit() {
        Employee employee = new Employee();
        String idEmployee = inputIdEmployee();
        boolean flag = false;
        for (Employee employeeEdit : this.employeeController.showEmployee()) {
            if (employeeEdit.getIdEmployee().equalsIgnoreCase(idEmployee)) {
                employee = employeeEdit;
                flag = true;
                break;
            }
        }
        if (flag) {
            do {
                int choiceEditAttribute;
                do {
                    try {
                        System.out.println("Choose information Employee need update: ");
                        System.out.println("1.Name");
                        System.out.println("2.Date of birth");
                        System.out.println("3.Gender");
                        System.out.println("4.Identity Card");
                        System.out.println("5.Phone Number");
                        System.out.println("6.Email");
                        System.out.println("7.Academic Level");
                        System.out.println("8.Position");
                        System.out.println("9.Salary");
                        System.out.println("10.Done edit");
                        choiceEditAttribute = Integer.parseInt(scanner.nextLine());
                        if (choiceEditAttribute <= 0 || choiceEditAttribute > 10) {
                            System.out.println("Not in Menu.Choose again!!");
                        } else {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Not in Menu.Choose again!!!");
                    }
                } while (true);
                switch (choiceEditAttribute) {
                    case 1:
                        employee.setName(inputName());
                        break;
                    case 2:
                        employee.setDateOfBirth(inputDateOfBirth());
                        break;
                    case 3:
                        employee.setGender(inputGender());
                        break;
                    case 4:
                        employee.setIdentityCard(inputIdentityCard());
                        break;
                    case 5:
                        employee.setPhoneNumber(inputPhoneNumber());
                        break;
                    case 6:
                        employee.setMail(inputEmail());
                        break;
                    case 7:
                        employee.setAcademicLevelEmployee(inputAcademicLevelEmployee());
                        break;
                    case 8:
                        employee.setPositionEmployee(inputPositionEmployee());
                        break;
                    case 9:
                        employee.setSalary(inputSalaryEmployee());
                        break;
                    case 10:
                        return employee;
                }
            } while (true);
        } else {
            return null;
        }
    }

    private void inputEmployee(Employee employee) {
        inputInformationPerson(employee);
        employee.setAcademicLevelEmployee(inputAcademicLevelEmployee());
        employee.setPositionEmployee(inputPositionEmployee());
        employee.setSalary(inputSalaryEmployee());
    }

    private void inputInformationPerson(Person person) {
        person.setName(inputName());
        person.setDateOfBirth(inputDateOfBirth());
        person.setGender(inputGender());
        person.setIdentityCard(inputIdentityCard());
        person.setPhoneNumber(inputPhoneNumber());
        person.setMail(inputEmail());
    }

    private String inputPositionEmployee() {
        int choicePositionEmployee;
        do {
            try {
                System.out.println("Choose position Employee (Receptionist/Serve/Expert/Supervisor/Manager/Principal): ");
                System.out.println("1.Receptionist");
                System.out.println("2.Serve");
                System.out.println("3.Expert");
                System.out.println("4.Supervisor");
                System.out.println("5.Manager");
                System.out.println("6.Principal");
                choicePositionEmployee = Integer.parseInt(scanner.nextLine());
                if (choicePositionEmployee <= 0 || choicePositionEmployee > 6) {
                    System.out.println("Not in Menu.Choose again!!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Not in Menu.Choose again!!!");
            }

        } while (true);
        if (choicePositionEmployee == 1) {
            return "Receptionist";
        } else if (choicePositionEmployee == 2) {
            return "Serve";
        } else if (choicePositionEmployee == 3) {
            return "Expert";
        } else if (choicePositionEmployee == 4) {
            return "Supervisor";
        } else if (choicePositionEmployee == 5) {
            return "Manager";
        } else {
            return "Principal";
        }
    }

    private String inputAcademicLevelEmployee() {
        int choiceAcademicLevelEmployee;
        do {
            try {
                System.out.println("Choose academic Level Employee (Intermediate/College/University/After university): ");
                System.out.println("1.Intermediate");
                System.out.println("2.College");
                System.out.println("3.University");
                System.out.println("4.After University");
                choiceAcademicLevelEmployee = Integer.parseInt(scanner.nextLine());
                if (choiceAcademicLevelEmployee <= 0 || choiceAcademicLevelEmployee > 4) {
                    System.out.println("Not in Menu.Choose again!!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Not in Menu.Choose again!!!");
            }

        } while (true);
        if (choiceAcademicLevelEmployee == 1) {
            return "Intermediate";
        } else if (choiceAcademicLevelEmployee == 2) {
            return "College";
        } else if (choiceAcademicLevelEmployee == 3) {
            return "University";
        } else {
            return "After University";
        }
    }

    private String inputEmail() {
        String mail;
        do {
            System.out.println("Enter mail(x@gmail.com/x@outlook.com):");
            mail = scanner.nextLine();
            if (this.regexUtil.validateString(mail, EMAIL_EMPLOYEE)) {
                break;
            } else {
                System.out.println("Email is not in correct format.Enter again!!!");
            }
        } while (true);
        return mail;
    }

    private String inputGender() {
        int choiceGender;
        do {
            try {
                System.out.println("Choose gender (Male/Female/Other): ");
                System.out.println("1.Male");
                System.out.println("2.Female");
                System.out.println("3.Other");
                choiceGender = Integer.parseInt(scanner.nextLine());
                if (choiceGender <= 0 || choiceGender > 3) {
                    System.out.println("Not in Menu.Choose again!!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Not in Menu.Choose again!!!");
            }
        } while (true);
        if (choiceGender == 1) {
            return "Male";
        } else if (choiceGender == 2) {
            return "Female";
        } else {
            return "Other";
        }
    }


    private int inputSalaryEmployee() {
        int salary;
        do {
            try {
                System.out.println("Enter salary (>0):");
                salary = Integer.parseInt(scanner.nextLine());
                if (salary <= 0) {
                    System.out.println("Salary >0.Enter again!!!!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Salary number >0. Enter again!!!");
            }
        } while (true);
        return salary;
    }

    private String inputPhoneNumber() {
        String phoneNumber;
        do {
            System.out.println("Enter phone Number (0XXXXXXXXX):");
            phoneNumber = scanner.nextLine();
            if (regexUtil.validateString(phoneNumber, PHONE_NUMBER_EMPLOYEE)) {
                break;
            } else {
                System.out.println("Phone number 10 and start 0.Enter again!!!");
            }
        } while (true);
        return phoneNumber;
    }

    private String inputIdentityCard() {
        String identityCard;
        do {
            System.out.println("Enter identity Card (9 - 12 number:)");
            identityCard = scanner.nextLine();
            if (regexUtil.validateString(identityCard, IDENTITY_CARD_EMPLOYEE)) {
                break;
            } else {
                System.out.println("identity card 9 or 12 number. Enter again!!!");
            }
        } while (true);
        return identityCard;
    }

    private String inputDateOfBirth() {
        String dateOfBirth;
        do {
            System.out.println("Enter date of birth (yy/MM/yyyy): ");
            dateOfBirth = scanner.nextLine();
            try {
                if (checkDateOfBirth(dateOfBirth)) {
                    break;
                } else {
                    System.out.println("age over 18. Enter again!!!");
                }
            } catch (DateTimeParseException e) {
                System.out.println("date of birth yy/MM/yyyy. Enter again!!!");
            }
        } while (true);
        return dateOfBirth;
    }

    private String inputName() {
        String name;
        do {
            System.out.println("Enter name (Nguyen Van A): ");
            name = scanner.nextLine();
            if (checkName(name)) {
                break;
            } else {
                System.out.println("Enter name again!!!");
            }
        } while (true);
        return name;
    }

    public boolean checkName(String str) {
        str = str.trim();
        String[] arrayStr = str.split(" ");
        for (String s : arrayStr) {
            if (!regexUtil.validateString(s, NAME_EMPLOYEE)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkDateOfBirth(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.parse(date, dateTimeFormatter);
        LocalDate today = LocalDate.now();
        Period period = Period.between(date1, today);
        return period.getYears() >= 18;
    }

    private String inputNameNeedFind() {
        String name;
        do {
            System.out.println("Enter name need find: ");
            name = scanner.nextLine();
            if (name.equalsIgnoreCase("")) {
                System.out.println("Not be empty. Enter again!!!");
            } else {
                break;
            }
        } while (true);
        return name;
    }

    private Customer createCustomerView() {
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
        this.inputInformationPerson(customer);
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
                System.out.println("Not in Menu.Choose again!!!");
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
            if (regexUtil.validateString(idCustomer, ID_CUSTOMER)) {
                return idCustomer;
            } else {
                System.out.println("ID format is not correct!!!");
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

    private Customer createCustomerEdit() {
        Customer customer = new Customer();
        String idCustomer = inputIdCustomer();
        boolean flagCustomer = false;
        for (Customer customerEdit : this.customerController.showCustomer()) {
            if (customerEdit.getIdCustomer().equalsIgnoreCase(idCustomer)) {
                customer = customerEdit;
                flagCustomer = true;
                break;
            }
        }
        if (flagCustomer) {
            do {
                int choiceEditAttribute;
                do {
                    try {
                        System.out.println("Choose information Customer need update: ");
                        System.out.println("1.Name");
                        System.out.println("2.Date of birth");
                        System.out.println("3.Gender");
                        System.out.println("4.Identity Card");
                        System.out.println("5.Phone Number");
                        System.out.println("6.Email");
                        System.out.println("7.Customer type");
                        System.out.println("8.Address");
                        System.out.println("9.Done edit");
                        choiceEditAttribute = Integer.parseInt(scanner.nextLine());
                        if (choiceEditAttribute <= 0 || choiceEditAttribute > 9) {
                            System.out.println("Not in Menu.Choose again!!");
                        } else {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Not in Menu.Choose again!!!");
                    }
                } while (true);
                switch (choiceEditAttribute) {
                    case 1:
                        customer.setName(inputName());
                        break;
                    case 2:
                        customer.setDateOfBirth(inputDateOfBirth());
                        break;
                    case 3:
                        customer.setGender(inputGender());
                        break;
                    case 4:
                        customer.setIdentityCard(inputIdentityCard());
                        break;
                    case 5:
                        customer.setPhoneNumber(inputPhoneNumber());
                        break;
                    case 6:
                        customer.setMail(inputEmail());
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

    private void menuAddFacility() {
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back to menu");
    }

    private int chooseAddFacility() {
        int choose;
        do {
            try {
                this.menuAddFacility();
                System.out.println("Choose option in Menu Add Facility:");
                choose = Integer.parseInt(scanner.nextLine());
                if (choose <= 0 || choose > 4) {
                    System.out.println("Not in Menu. Choose again!!!");
                } else {
                    return choose;
                }
            } catch (NumberFormatException e) {
                System.out.println("Not in Menu. Choose again!!!");
            }
        } while (true);
    }

    private String inputIdServiceVilla() {
        String idServiceVilla;
        do {
            System.out.println("Enter ID service Villa (SVVl-1234):");
            idServiceVilla = scanner.nextLine();
            if (this.regexUtil.validateString(idServiceVilla, ID_VILLA)) {
                return idServiceVilla;
            } else {
                System.out.println("ID format is not correct!!!");
            }
        } while (true);
    }


    private String inputIdServiceHouse() {
        String idServiceHouse;
        do {
            System.out.println("Enter ID service House (SVHO-1234):");
            idServiceHouse = scanner.nextLine();
            if (this.regexUtil.validateString(idServiceHouse, ID_HOUSE)) {
                return idServiceHouse;
            } else {
                System.out.println("ID format is not correct!!!");
            }
        } while (true);
    }

    private String inputNameService() {
        String name;
        do {
            System.out.println("Enter name service (Special):");
            name = scanner.nextLine();
            if (checkName(name)) {
                break;
            } else {
                System.out.println("Name service format not correct. Enter name again!!!");
            }
        } while (true);
        return name;
    }

    private double inputUsableArea() {
        double usableArea;
        do {
            try {
                System.out.println("Enter usable area (>=30m2):");
                usableArea = Double.parseDouble(scanner.nextLine());
                if (usableArea > 30) {
                    return usableArea;
                } else {
                    System.out.println("Usable area >=30m2. Enter again!!1");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a number. Enter again!!!");
            }
        } while (true);
    }

    private int inputRentalCosts() {
        int rentalCosts;
        do {
            try {
                System.out.println("Enter rental costs (>0): ");
                rentalCosts = Integer.parseInt(scanner.nextLine());
                if (rentalCosts > 0) {
                    break;
                } else {
                    System.out.println("Rental costs >0. Enter again!!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a number. Enter again");
            }
        } while (true);
        return rentalCosts;
    }

    private int inputMaximumPeople() {
        int maximumPeople;
        do {
            try {
                System.out.println("Enter maximum People (>0 && <20): ");
                maximumPeople = Integer.parseInt(scanner.nextLine());
                if (maximumPeople <= 0 || maximumPeople >= 20) {
                    System.out.println("Maximum people (>0 &&<20). Enter again!!!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a number. Enter again!!!");
            }
        } while (true);
        return maximumPeople;
    }

    private String inputRentalTypeFacility() {
        int choiceRentalType;
        do {
            try {
                System.out.println("Choose rental type (Year/Month/Date/Hours): ");
                System.out.println("1.Year");
                System.out.println("2.Month");
                System.out.println("3.Date");
                System.out.println("4.Hours");
                choiceRentalType = Integer.parseInt(scanner.nextLine());
                if (choiceRentalType <= 0 || choiceRentalType > 4) {
                    System.out.println("Not in Menu.Choose again!!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Not in Menu.Choose again!!!");
            }

        } while (true);
        if (choiceRentalType == 1) {
            return "Year";
        } else if (choiceRentalType == 2) {
            return "Month";
        } else if (choiceRentalType == 3) {
            return "Date";
        } else {
            return "Hours";
        }
    }

    private String inputRoomStandards() {
        String name;
        do {
            System.out.println("Enter room standards (Special):");
            name = scanner.nextLine();
            if (checkName(name)) {
                break;
            } else {
                System.out.println("Room standards format not correct. Enter name again!!!");
            }
        } while (true);
        return name;
    }

    private int inputNumberFloors() {
        int numberFloors;
        do {
            try {
                System.out.println("Enter number of floors (>0): ");
                numberFloors = Integer.parseInt(scanner.nextLine());
                if (numberFloors > 0) {
                    return numberFloors;
                } else {
                    System.out.println("Floors >0. Enter again!!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a number.Enter again!!!");
            }
        } while (true);
    }

    private void inputPropertyFacility(Facility facility) {
        facility.setNameService(inputNameService());
        facility.setUsableArea(inputUsableArea());
        facility.setRentalCosts(inputRentalCosts());
        facility.setMaximumNumberOfPeople(inputMaximumPeople());
        facility.setRentalType(inputRentalTypeFacility());
    }

    private double inputPoolArea() {
        double poolArea;
        do {
            try {
                System.out.println("Enter pool area (>30m2): ");
                poolArea = Double.parseDouble(scanner.nextLine());
                if (poolArea > 30) {
                    break;
                } else {
                    System.out.println("Pool Area >30 m2. Enter again!!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a number. Enter again!!!");
            }
        } while (true);
        return poolArea;
    }

    private String inputIdServiceRoom() {
        String idServiceRoom;
        do {
            System.out.println("Enter ID service Room (SVRO-1234):");
            idServiceRoom = scanner.nextLine();
            if (this.regexUtil.validateString(idServiceRoom, ID_ROOM)) {
                return idServiceRoom;
            } else {
                System.out.println("ID format is not correct!!!");
            }
        } while (true);
    }

    private String inputFreeService() {
        String freeService;
        do {
            System.out.println("Enter free Service Included: ");
            freeService = scanner.nextLine();
            if (freeService.equalsIgnoreCase("")) {
                System.out.println("Not be empty. Enter again!!!");
            } else {
                break;
            }
        } while (true);
        return freeService;
    }

    private Facility createVilla() {
        Villa villa = new Villa();
        villa.setIdService(inputIdServiceVilla());
        inputPropertyFacility(villa);
        villa.setRoomStandards(inputRoomStandards());
        villa.setNumberOfFloors(inputNumberFloors());
        villa.setPoolArea(inputPoolArea());
        return villa;
    }

    private Facility createHouse() {
        House house = new House();
        house.setIdService(inputIdServiceHouse());
        inputPropertyFacility(house);
        house.setRoomStandards(inputRoomStandards());
        house.setNumberOfFloors(inputNumberFloors());
        return house;
    }

    private Facility createRoom() {
        Room room = new Room();
        room.setIdService(inputIdServiceRoom());
        inputPropertyFacility(room);
        room.setFreeServiceIncluded(inputFreeService());
        return room;
    }

    private Facility createFacilityView() {
        int chooseOption = this.chooseAddFacility();
        switch (chooseOption) {
            case 1:
                return this.createVilla();
            case 2:
                return this.createHouse();
            case 3:
                return this.createRoom();
            case 4:
                return null;
        }
        return null;
    }

    private String inputIdFacilityRemove() {
        String idFacility;
        do {
            System.out.println("Enter id Facility need remove (SVVL-1234 or SVHO-1234 or SVRO-1234): ");
            idFacility = scanner.nextLine();
            if (regexUtil.validateString(idFacility, ID_VILLA) || regexUtil.validateString(idFacility, ID_HOUSE) || regexUtil.validateString(idFacility, ID_ROOM)) {
                return idFacility;
            } else {
                System.out.println("ID format not correct. Enter again!!!");
            }
        } while (true);
    }

    private Facility getFacilityRemove() {
        Facility facility = null;
        String idFacility = inputIdFacilityRemove();
        for (Map.Entry<Facility, Integer> entry : this.facilityController.showFacility().entrySet()) {
            if (entry.getKey().getIdService().equalsIgnoreCase(idFacility)) {
                facility = entry.getKey();
                break;
            }
        }
        return facility;
    }
}
