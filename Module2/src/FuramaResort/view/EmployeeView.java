package FuramaResort.view;

import FuramaResort.controller.EmployeeController;
import FuramaResort.model.person.Employee;
import FuramaResort.utils.RegexUtil;
import FuramaResort.utils.ConfirmUtil;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private final EmployeeController employeeController = new EmployeeController();
    private final Scanner scanner = new Scanner(System.in);
    private static final String ID_EMPLOYEE = "^NV-[0-9]{4}$";


    public void managementEmployee() {
        do {
            switch (chooseMenuEmployee()) {
                case 1:
                    displayListEmployee(employeeController.showEmployee());
                    break;
                case 2:
                    this.employeeController.createEmployee(createEmployeeNew());
                    System.out.println("Create employee done");
                    break;
                case 3:
                    String idEmployeeEdit = inputIdEmployee();
                    Employee employeeEdit = this.createEmployeeEdit(idEmployeeEdit);
                    if (employeeEdit == null) {
                        System.out.println("Id " + idEmployeeEdit + " not find ");
                    } else {
                        this.employeeController.updateEmployee(employeeEdit);
                        System.out.println("Update employee with ID employee " + employeeEdit.getIdEmployee() + " done");
                    }
                    break;
                case 4:
                    String idEmployeeDelete = this.inputIdEmployee();
                    Employee employee = getEmployeeDetail(idEmployeeDelete);
                    if (employee != null) {
                        System.out.println(employee);
                        deleteEmployee(idEmployeeDelete);
                    } else {
                        System.out.println("Id " + idEmployeeDelete + " not find");
                    }
                    break;
                case 5:
                    List<Employee> employees = employeeController.findEmployee(PersonView.inputNameNeedFind());
                    if (employees.size() == 0) {
                        System.out.println("Name not found!!!");
                    } else {
                        displayListEmployee(employees);
                    }
                    break;
                case 6:
                    return;
            }
        } while (true);
    }

    private void displayListEmployee(List<Employee> employees) {
        System.out.println("=============LIST EMPLOYEE=============");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n"
                , "Id Employee", "Name", "Date Of Birth", "Gender", "Identity Card",
                "Phone Number", "Mail", "Academic Level", "Position", "Salary");
        for (Employee employee : employees) {
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n",
                    employee.getIdEmployee(), employee.getName(), employee.getDateOfBirth()
                    , employee.getGender(), employee.getIdentityCard(), employee.getPhoneNumber(), employee.getMail()
                    , employee.getAcademicLevelEmployee(), employee.getPositionEmployee(), employee.getSalary());
        }
    }

    private Employee createEmployeeNew() {
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

    private int chooseMenuEmployee() {
        int chooseOptionEmployee;
        do {
            try {
                displayEmployee();
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

    private void displayEmployee() {
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Delete employee");
        System.out.println("5. Search by name employee");
        System.out.println("6. Return main menu");
    }

    private boolean checkIdEmployee(String idEmployee) {
        for (Employee employee : employeeController.showEmployee()) {
            if (employee.getIdEmployee().equalsIgnoreCase(idEmployee)) {
                return true;
            }
        }
        return false;
    }

    private void inputEmployee(Employee employee) {
        PersonView.inputInformationPerson(employee);
        employee.setAcademicLevelEmployee(inputAcademicLevelEmployee());
        employee.setPositionEmployee(inputPositionEmployee());
        employee.setSalary(inputSalaryEmployee());
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

    private String inputIdEmployee() {
        String idEmployee;
        do {
            System.out.println("Enter ID Employee (NV-1234): ");
            idEmployee = scanner.nextLine();
            if (RegexUtil.validateString(idEmployee, ID_EMPLOYEE)) {
                return idEmployee;
            } else {
                System.out.println("ID format is not correct!!!");
            }
        } while (true);
    }

    private Employee createEmployeeEdit(String idEmployee) {
        Employee employee = getEmployeeDetail(idEmployee);
        if (employee != null) {
            do {
                int choiceEditAttribute;
                do {
                    try {
                        System.out.println("Choose information Employee need update: ");
                        System.out.println("1.Name: " + employee.getName());
                        System.out.println("2.Date of birth: " + employee.getDateOfBirth());
                        System.out.println("3.Gender: " + employee.getGender());
                        System.out.println("4.Identity Card: " + employee.getIdentityCard());
                        System.out.println("5.Phone Number: " + employee.getPhoneNumber());
                        System.out.println("6.Email: " + employee.getMail());
                        System.out.println("7.Academic Level: " + employee.getAcademicLevelEmployee());
                        System.out.println("8.Position: " + employee.getPositionEmployee());
                        System.out.println("9.Salary: " + employee.getSalary());
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
                        employee.setName(PersonView.inputName());
                        break;
                    case 2:
                        employee.setDateOfBirth(PersonView.inputDateOfBirth());
                        break;
                    case 3:
                        employee.setGender(PersonView.inputGender());
                        break;
                    case 4:
                        employee.setIdentityCard(PersonView.inputIdentityCard());
                        break;
                    case 5:
                        employee.setPhoneNumber(PersonView.inputPhoneNumber());
                        break;
                    case 6:
                        employee.setMail(PersonView.inputEmail());
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

    private Employee getEmployeeDetail(String idEmployee) {
        for (Employee employee : this.employeeController.showEmployee()) {
            if (employee.getIdEmployee().equalsIgnoreCase(idEmployee)) {
                return employee;
            }
        }
        return null;
    }

    private void deleteEmployee(String idEmployee) {
        int confirm = ConfirmUtil.getConfirm(idEmployee);
        switch (confirm) {
            case 1:
                this.employeeController.removeEmployee(idEmployee);
                System.out.println("Remove employee with ID employee " + idEmployee + " done");
                break;
            case 2:
                System.out.println("Cancel delete!!!");
                break;
        }
    }
}
