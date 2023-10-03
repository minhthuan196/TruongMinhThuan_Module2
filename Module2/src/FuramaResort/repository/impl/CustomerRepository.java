package FuramaResort.repository.impl;

import FuramaResort.model.person.Customer;
import FuramaResort.repository.IPersonRepository;
import FuramaResort.utils.FileUtil;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements IPersonRepository<Customer> {
    private static final String CUSTOMER_CSV = "D:\\Codegym\\module2\\Module2\\src\\FuramaResort\\data\\customer.csv";
    private static final String COMMA = ",";

    @Override
    public List<Customer> showPerson() {
        return readCustomerFromFile();
    }

    @Override
    public void createPerson(Customer customer) {
        //List<Customer> customers = readCustomerFromFile();
        List<Customer> customers = new ArrayList<>();
        customers.add(customer);
        writeCustomerToFile(customers, true);
    }

    @Override
    public void updatePerson(Customer customer) {
        List<Customer> customers = readCustomerFromFile();
        for (Customer customer1 : customers) {
            if (customer1.getIdCustomer().equalsIgnoreCase(customer.getIdCustomer())) {
                customer1.setName(customer.getName());
                customer1.setDateOfBirth(customer.getDateOfBirth());
                customer1.setGender(customer.getGender());
                customer1.setIdentityCard(customer.getIdentityCard());
                customer1.setPhoneNumber(customer.getPhoneNumber());
                customer1.setMail(customer.getMail());
                customer1.setCustomerType(customer.getCustomerType());
                customer1.setAddress(customer.getAddress());
                break;
            }
        }
        writeCustomerToFile(customers, false);
    }

    @Override
    public void removePerson(String id) {
        List<Customer> customers = readCustomerFromFile();
        for (Customer customer : customers) {
            if (customer.getIdCustomer().equalsIgnoreCase(id)) {
                customers.remove(customer);
                break;
            }
        }
        writeCustomerToFile(customers, false);
    }

    @Override
    public List<Customer> findPerson(String name) {
        List<Customer> customers = readCustomerFromFile();
        List<Customer> customers1 = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getName().contains(name)) {
                customers1.add(customer);
            }
        }
        return customers1;
    }

    private List<Customer> readCustomerFromFile() {
        List<String> data = FileUtil.readFile(CUSTOMER_CSV);
        return convertStringToCustomer(data);
    }

    private static List<Customer> convertStringToCustomer(List<String> data) {
        List<Customer> customers = new ArrayList<>();
        for (String str : data) {
            String[] splitStr = str.split(COMMA);
            customers.add(new Customer(splitStr[0], splitStr[1], splitStr[2], splitStr[3], splitStr[4], splitStr[5],
                    splitStr[6], splitStr[7], splitStr[8]));
        }
        return customers;
    }

    private void writeCustomerToFile(List<Customer> customers, boolean flag) {
        List<String> data = convertCustomerToString(customers);
        FileUtil.writeFile(CUSTOMER_CSV, data, flag);
    }

    private static List<String> convertCustomerToString(List<Customer> customers) {
        List<String> data = new ArrayList<>();
        for (Customer customer : customers) {
            data.add(customer.getName() + COMMA + customer.getDateOfBirth() + COMMA + customer.getGender()
                    + COMMA + customer.getIdentityCard() + COMMA + customer.getPhoneNumber() + COMMA + customer.getMail()
                    + COMMA + customer.getIdCustomer() + COMMA + customer.getCustomerType() + COMMA + customer.getAddress());
        }
        return data;
    }
}
