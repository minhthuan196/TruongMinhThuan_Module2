package FuramaResort.view;

import FuramaResort.controller.EmployeeController;
import FuramaResort.model.person.Employee;
import FuramaResort.utils.RegexUtil;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class FuramaManagement {
    private final Scanner scanner = new Scanner(System.in);
    private final EmployeeController employeeController = new EmployeeController();
    private static final String ID_EMPLOYEE = "^NV-[0-9]{4}$";
    private static final String NAME_EMPLOYEE = "^[A-Z][a-z]{0,10}$";
    private static final String IDENTITY_CARD_EMPLOYEE = "^([0-9]{9}|[0-9]{12})$";
    private static final String PHONE_NUMBER_EMPLOYEE = "^0[0-9]{9}$";
    private static final String EMAIL_EMPLOYEE = "(^.*@gmail.com$)|(^.*@outlook.com$)";

    private final RegexUtil regexUtil = new RegexUtil();

    public void displayMainMenu() {
        System.out.println("==========MENU==========");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
    }

    public void displayEmployee() {
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Delete employee");
        System.out.println("5. Search by name employee");
        System.out.println("6. Return main menu");
    }

    public void displayCustomer() {
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Delete customer");
        System.out.println("5. Search by name customer");
        System.out.println("6. Return main menu");
    }

    public void displayFacility() {
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Delete facility");
        System.out.println("5. Return main menu");
    }

    public void displayBooking() {
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new contracts");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
    }

    public void displayPromotion() {
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get voucher");
        System.out.println("3. Return main menu");
    }

    public int chooseMenu() {
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

    public int chooseMenuEmployee() {
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

    public int chooseMenuCustomer() {
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

    public int chooseMenuFacility() {
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

    public int chooseMenuBooking() {
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

    public int chooseMenuPromotion() {
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

    public boolean checkIdEmployee(String idEmployee) {
        for (Employee employee : this.employeeController.showEmployee()) {
            if (employee.getIdEmployee().equalsIgnoreCase(idEmployee)) {
                return true;
            }
        }
        return false;
    }

    public String inputIdEmployee() {
        String idEmployee;
        do {
            System.out.println("Enter ID Employee (NV-XXXX): ");
            idEmployee = scanner.nextLine();
            if (regexUtil.validateString(idEmployee, ID_EMPLOYEE)) {
                return idEmployee;
            } else {
                System.out.println("ID format is not correct!!!");
            }
        } while (true);
    }

    public Employee createEmployee() {
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

    public Employee createEmployeeEdit1() {
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
                        String name = inputName();
                        employee.setName(name);
                        break;
                    case 2:
                        String dateOfBirth = inputDateOfBirth();
                        employee.setDateOfBirth(dateOfBirth);
                        break;
                    case 3:
                        String gender = inputGender();
                        employee.setGender(gender);
                        break;
                    case 4:
                        String identityCard = inputIdentityCard();
                        employee.setIdentityCard(identityCard);
                        break;
                    case 5:
                        String phoneNumber = inputPhoneNumber();
                        employee.setPhoneNumber(phoneNumber);
                        break;
                    case 6:
                        String mail = inputEmail();
                        employee.setMail(mail);
                        break;
                    case 7:
                        String academicLevelEmployee = inputAcademicLevelEmployee();
                        employee.setAcademicLevelEmployee(academicLevelEmployee);
                        break;
                    case 8:
                        String positionEmployee = inputPositionEmployee();
                        employee.setPositionEmployee(positionEmployee);
                        break;
                    case 9:
                        int salary = inputSalaryEmployee();
                        employee.setSalary(salary);
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
        String name = inputName();
        employee.setName(name);
        String dateOfBirth = inputDateOfBirth();
        employee.setDateOfBirth(dateOfBirth);
        String gender = inputGender();
        employee.setGender(gender);
        String identityCard = inputIdentityCard();
        employee.setIdentityCard(identityCard);
        String phoneNumber = inputPhoneNumber();
        employee.setPhoneNumber(phoneNumber);
        String mail = inputEmail();
        employee.setMail(mail);
        String academicLevelEmployee = inputAcademicLevelEmployee();
        employee.setAcademicLevelEmployee(academicLevelEmployee);
        String positionEmployee = inputPositionEmployee();
        employee.setPositionEmployee(positionEmployee);
        int salary = inputSalaryEmployee();
        employee.setSalary(salary);
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
            System.out.println("Enter name Employee (Nguyen Van A): ");
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

    public void managementEmployee() {
        int chooseMenuEmployee = this.chooseMenuEmployee();
        switch (chooseMenuEmployee) {
            case 1:
                System.out.println(this.employeeController.showEmployee());
                break;
            case 2:
                this.employeeController.createEmployee(createEmployee());
                System.out.println("Create employee done");
                break;
            case 3:
                Employee employeeEdit = this.createEmployeeEdit1();
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
                System.out.println("Enter name need find: ");
                String name = scanner.nextLine();
                System.out.println(this.employeeController.findEmployee(name));
                break;
            case 6:
                this.managementFurama();
                break;
        }
        this.managementEmployee();
    }

    public void managementCustomer() {
        int chooseMenuCustomer = this.chooseMenuCustomer();
        switch (chooseMenuCustomer) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                break;
            case 6:
                this.managementFurama();
                break;
        }
        this.managementCustomer();
    }

    public void managementFacility() {
        int chooseMenuFacility = this.chooseMenuFacility();
        switch (chooseMenuFacility) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                this.managementFurama();
                break;
        }
        this.managementFacility();

    }

    public void managementBooking() {
        int chooseMenuBooking = this.chooseMenuBooking();
        switch (chooseMenuBooking) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                break;
            case 6:
                this.managementFurama();
                break;
        }
        this.managementBooking();
    }

    public void managementPromotion() {
        int chooseMenuPromotion = this.chooseMenuPromotion();
        switch (chooseMenuPromotion) {
            case 1:
            case 2:
                break;
            case 3:
                this.managementFurama();
                break;
        }
        this.managementPromotion();
    }

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
}
