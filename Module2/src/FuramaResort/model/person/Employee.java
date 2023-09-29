package FuramaResort.model.person;

public class Employee extends Person {
    private String idEmployee;
    private String academicLevelEmployee;
    private String positionEmployee;
    private int salary;

    public Employee(String name, String dateOfBirth, String gender, String identityCard, String phoneNumber, String mail, String idEmployee,
                    String academicLevelEmployee, String positionEmployee, int salary) {
        super(name, dateOfBirth, gender, identityCard, phoneNumber, mail);
        this.idEmployee = idEmployee;
        this.academicLevelEmployee = academicLevelEmployee;
        this.positionEmployee = positionEmployee;
        this.salary = salary;
    }

    public Employee(String idEmployee, String academicLevelEmployee, String positionEmployee, int salary) {
        this.idEmployee = idEmployee;
        this.academicLevelEmployee = academicLevelEmployee;
        this.positionEmployee = positionEmployee;
        this.salary = salary;
    }

    public Employee() {

    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getAcademicLevelEmployee() {
        return academicLevelEmployee;
    }

    public void setAcademicLevelEmployee(String academicLevelEmployee) {
        this.academicLevelEmployee = academicLevelEmployee;
    }

    public String getPositionEmployee() {
        return positionEmployee;
    }

    public void setPositionEmployee(String positionEmployee) {
        this.positionEmployee = positionEmployee;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id Employee = " + idEmployee +
                ", Name = " + getName() +
                ", Date Of Birth = " + getDateOfBirth() +
                ", Gender = " + getGender() +
                ", Identity Card = " + getIdentityCard() +
                ", Phone Number = " + getPhoneNumber() +
                ", Mail = " + getMail() +
                ", Academic Level Employee = " + academicLevelEmployee +
                ", Position Employee = " + positionEmployee +
                ", Salary = " + salary + "\n";
    }
}
