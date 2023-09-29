package FuramaResort.service.impl;

import FuramaResort.model.person.Employee;
import FuramaResort.repository.IPersonRepository;
import FuramaResort.repository.impl.EmployeeRepository;
import FuramaResort.service.IPersonService;


import java.util.List;

public class EmployeeService implements IPersonService<Employee> {
    private final IPersonRepository<Employee> personRepository = new EmployeeRepository();


    @Override
    public List<Employee> showPerson() {
        return personRepository.showPerson();
    }

    @Override
    public void createPerson(Employee employee) {
        personRepository.createPerson(employee);
    }

    @Override
    public void updatePerson(Employee employee) {
        personRepository.updatePerson(employee);
    }

    @Override
    public void removePerson(String id) {
        personRepository.removePerson(id);
    }

    @Override
    public List<Employee> findPerson(String name) {
        return personRepository.findPerson(name);
    }
}
