package FuramaResort.model;

public class Contract {
    private int contractNumber;
    private Booking booking;
    private int advanceDepositAmount;
    private int totalPaymentAmount;

    public Contract(int contractNumber, Booking booking, int advanceDepositAmount, int totalPaymentAmount) {
        this.contractNumber = contractNumber;
        this.booking = booking;
        this.advanceDepositAmount = advanceDepositAmount;
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public Contract() {

    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public int getAdvanceDepositAmount() {
        return advanceDepositAmount;
    }

    public void setAdvanceDepositAmount(int advanceDepositAmount) {
        this.advanceDepositAmount = advanceDepositAmount;
    }

    public int getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(int totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    @Override
    public String toString() {
        return "Contract Number = " + contractNumber +
                ", Booking = " + booking +
                ", Advance Deposit Amount = " + advanceDepositAmount +
                ", Total Payment Amount = " + totalPaymentAmount + "\n";
    }
}
