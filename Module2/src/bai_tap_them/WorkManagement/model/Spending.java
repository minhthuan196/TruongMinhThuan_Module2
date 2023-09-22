package bai_tap_them.WorkManagement.model;

public class Spending {
    private String spendingId;
    private String spendingName;
    private String dateOfSpending;
    private int spendingMoney;
    private String noteSpending;

    public Spending(String spendingId, String spendingName, String dateOfSpending, int spendingMoney, String noteSpending) {
        this.spendingId = spendingId;
        this.spendingName = spendingName;
        this.dateOfSpending = dateOfSpending;
        this.spendingMoney = spendingMoney;
        this.noteSpending = noteSpending;
    }

    public Spending() {

    }

    public String getSpendingId() {
        return spendingId;
    }

    public void setSpendingId(String spendingId) {
        this.spendingId = spendingId;
    }

    public String getSpendingName() {
        return spendingName;
    }

    public void setSpendingName(String spendingName) {
        this.spendingName = spendingName;
    }

    public String getDateOfSpending() {
        return dateOfSpending;
    }

    public void setDateOfSpending(String dateOfSpending) {
        this.dateOfSpending = dateOfSpending;
    }

    public int getSpendingMoney() {
        return spendingMoney;
    }

    public void setSpendingMoney(int spendingMoney) {
        this.spendingMoney = spendingMoney;
    }

    public String getNoteSpending() {
        return noteSpending;
    }

    public void setNoteSpending(String noteSpending) {
        this.noteSpending = noteSpending;
    }

    @Override
    public String toString() {
        return "spendingId = " + spendingId +
                ", spendingName = " + spendingName +
                ", dateOfSpending = " + dateOfSpending +
                ", spendingMoney = " + spendingMoney +
                ", noteSpending = " + noteSpending + "\n";
    }
}
