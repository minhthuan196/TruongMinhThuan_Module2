package FuramaResort.model.person;

public class Customer extends Person {
    private int idCustomer;
    private String customerType;
    private String address;

    public Customer(String name, String dateOfBirth, String gender, String identityCard, String phoneNumber, String mail, int idCustomer, String customerType, String address) {
        super(name, dateOfBirth, gender, identityCard, phoneNumber, mail);
        this.idCustomer = idCustomer;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(int idCustomer, String customerType, String address) {
        this.idCustomer = idCustomer;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer() {

    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Id Customer = " + idCustomer +
                ", Name = " + getName() +
                ", Date Of Birth = " + getDateOfBirth() +
                ", Gender = " + getGender() +
                ", Identity Card = " + getIdentityCard() +
                ", Phone Number = " + getPhoneNumber() +
                ", Mail = " + getMail() +
                ", Customer Type = " + customerType +
                ", Address = " + address + "\n";
    }
}
