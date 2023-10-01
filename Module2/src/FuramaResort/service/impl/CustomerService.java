package FuramaResort.service.impl;

import FuramaResort.model.person.Customer;
import FuramaResort.repository.IPersonRepository;
import FuramaResort.repository.impl.CustomerRepository;
import FuramaResort.service.IPersonService;

import java.util.List;

public class CustomerService implements IPersonService<Customer> {
    private final IPersonRepository<Customer> personRepository = new CustomerRepository();

    @Override
    public List<Customer> showPerson() {
        return personRepository.showPerson();
    }

    @Override
    public void createPerson(Customer customer) {
        personRepository.createPerson(customer);
    }

    @Override
    public void updatePerson(Customer customer) {
        personRepository.updatePerson(customer);
    }

    @Override
    public void removePerson(String id) {
        personRepository.removePerson(id);
    }

    @Override
    public List<Customer> findPerson(String name) {
        return personRepository.findPerson(name);
    }
}
