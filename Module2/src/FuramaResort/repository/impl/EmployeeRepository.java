package FuramaResort.repository.impl;

import FuramaResort.model.person.Employee;
import FuramaResort.repository.IPersonRepository;
import FuramaResort.utils.FileUtil;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IPersonRepository<Employee> {
    public static final String EMPLOYEE_CSV = "D:\\Codegym\\module2\\Module2\\src\\FuramaResort\\data\\employee.csv";
    public static final String COMMA = ",";

    @Override
    public List<Employee> showPerson() {
        return readEmployeeFromFile();
    }

    @Override
    public void createPerson(Employee employee) {
        List<Employee> employees = readEmployeeFromFile();
        employees.add(employee);
        writeEmployeeToFile(employees);
    }

    @Override
    public void updatePerson(Employee employee) {
        List<Employee> employees = readEmployeeFromFile();
        for (Employee employee1 : employees) {
            if (employee1.getIdEmployee() == employee.getIdEmployee()) {
                employee1.setName(employee.getName());
                employee1.setDateOfBirth(employee.getDateOfBirth());
                employee1.setGender(employee.getGender());
                employee1.setIdentityCard(employee.getIdentityCard());
                employee1.setPhoneNumber(employee.getPhoneNumber());
                employee1.setMail(employee.getMail());
                employee1.setAcademicLevelEmployee(employee.getAcademicLevelEmployee());
                employee1.setPositionEmployee(employee.getPositionEmployee());
                employee1.setSalary(employee.getSalary());
                break;
            }
        }
        writeEmployeeToFile(employees);
    }

    @Override
    public void removePerson(String id) {
        List<Employee> employees = readEmployeeFromFile();
        for (Employee employee : employees) {
            if (employee.getIdEmployee().equalsIgnoreCase(id)) {
                employees.remove(employee);
                break;
            }
        }
        writeEmployeeToFile(employees);
    }

    @Override
    public List<Employee> findPerson(String name) {
        List<Employee> employees = readEmployeeFromFile();
        List<Employee> employees1 = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().contains(name)) {
                employees1.add(employee);
            }
        }
        return employees1;
    }

    private List<Employee> readEmployeeFromFile() {
        List<String> data = FileUtil.readFile(EMPLOYEE_CSV);
        return convertStringToEmployee(data);
    }

    private static List<Employee> convertStringToEmployee(List<String> data) {
        List<Employee> employees = new ArrayList<>();
        for (String str : data) {
            String[] splitStr = str.split(COMMA);
            employees.add(new Employee(splitStr[0], splitStr[1], splitStr[2], splitStr[3], splitStr[4], splitStr[5],
                    splitStr[6], splitStr[7], splitStr[8], Integer.parseInt(splitStr[9])));
        }
        return employees;
    }

    private void writeEmployeeToFile(List<Employee> employees) {
        List<String> data = convertEmployeeToString(employees);
        FileUtil.writeFile(EMPLOYEE_CSV, data);
    }

    private static List<String> convertEmployeeToString(List<Employee> employees) {
        List<String> data = new ArrayList<>();
        for (Employee employee : employees) {
            data.add(employee.getName() + COMMA + employee.getDateOfBirth() + COMMA + employee.getGender()
                    + COMMA + employee.getIdentityCard() + COMMA + employee.getPhoneNumber() + COMMA + employee.getMail()
                    + COMMA + employee.getIdEmployee() + COMMA + employee.getAcademicLevelEmployee() + COMMA + employee.getPositionEmployee()
                    + COMMA + employee.getSalary());
        }
        return data;
    }
}
