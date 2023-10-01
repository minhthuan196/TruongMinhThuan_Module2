package FuramaResort.controller;

import FuramaResort.model.person.Customer;
import FuramaResort.service.IPersonService;
import FuramaResort.service.impl.CustomerService;

import java.util.List;

public class CustomerController {
    private final IPersonService<Customer> personService = new CustomerService();

    public List<Customer> showCustomer() {
        return personService.showPerson();
    }

    public void createCustomer(Customer customer) {
        personService.createPerson(customer);
    }

    public void updateCustomer(Customer customer) {
        personService.updatePerson(customer);
    }

    public void removeCustomer(String id) {
        personService.removePerson(id);
    }

    public List<Customer> findCustomer(String name) {
        return personService.findPerson(name);
    }
}
