package FuramaResort.controller;

import FuramaResort.model.person.Employee;
import FuramaResort.service.IPersonService;
import FuramaResort.service.impl.EmployeeService;

import java.util.List;

public class EmployeeController {
    private final IPersonService<Employee> personService = new EmployeeService();

    public List<Employee> showEmployee() {
        return personService.showPerson();
    }


    public void createEmployee(Employee employee) {
        personService.createPerson(employee);
    }


    public void updateEmployee(Employee employee) {
        personService.updatePerson(employee);
    }


    public void removeEmployee(String id) {
        personService.removePerson(id);
    }

    public List<Employee> findEmployee(String name) {
        return personService.findPerson(name);
    }
}
