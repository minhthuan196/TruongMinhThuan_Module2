package FuramaResort.model.person;

public abstract class Person {
    private String name;
    private String dateOfBirth;
    private String Gender;
    private String identityCard;
    private String phoneNumber;
    private String mail;

    public Person(String name, String dateOfBirth, String gender, String identityCard, String phoneNumber, String mail) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        Gender = gender;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Name = " + name +
                ", Date Of Birth = " + dateOfBirth +
                ", Gender = " + Gender +
                ", Identity Card = " + identityCard +
                ", Phone Number = " + phoneNumber +
                ", Mail = " + mail + "\n";
    }
}
