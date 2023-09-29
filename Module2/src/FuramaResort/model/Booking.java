package FuramaResort.model;


import FuramaResort.model.facility.Facility;
import FuramaResort.model.person.Customer;

public class Booking {

    private int idBooking;
    private String dateOfBooking;
    private String rentalStartDate;
    private String rentalEndDate;
    private Customer customer;
    private Facility facility;

    public Booking(int idBooking, String dateOfBooking, String rentalStartDate, String rentalEndDate, Customer customer, Facility facility) {
        this.idBooking = idBooking;
        this.dateOfBooking = dateOfBooking;
        this.rentalStartDate = rentalStartDate;
        this.rentalEndDate = rentalEndDate;
        this.customer = customer;
        this.facility = facility;
    }

    public Booking() {

    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public String getRentalStartDate() {
        return rentalStartDate;
    }

    public void setRentalStartDate(String rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    public String getRentalEndDate() {
        return rentalEndDate;
    }

    public void setRentalEndDate(String rentalEndDate) {
        this.rentalEndDate = rentalEndDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Id Booking = " + idBooking +
                ", Date Of Booking = " + dateOfBooking +
                ", Rental Start Date = " + rentalStartDate +
                ", Rental End Date= " + rentalEndDate +
                ", Customer = " + customer +
                ", Facility = " + facility + "\n";
    }
}
