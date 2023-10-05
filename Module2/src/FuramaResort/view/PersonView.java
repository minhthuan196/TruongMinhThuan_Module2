package FuramaResort.view;

import FuramaResort.model.person.Person;
import FuramaResort.utils.RegexUtil;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class PersonView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String NAME_EMPLOYEE = "^[A-Z][a-z]{0,10}$";
    private static final String IDENTITY_CARD_EMPLOYEE = "^([0-9]{9}|[0-9]{12})$";
    private static final String PHONE_NUMBER_EMPLOYEE = "^0[0-9]{9}$";
    private static final String EMAIL_EMPLOYEE = "(^.*@gmail.com$)|(^.*@outlook.com$)";

    public static String inputNameNeedFind() {
        String name;
        do {
            System.out.println("Enter name need find: ");
            name = scanner.nextLine();
            if (name.equalsIgnoreCase("")) {
                System.out.println("Not be empty. Enter again!!!");
            } else {
                break;
            }
        } while (true);
        return name;
    }

    public static void inputInformationPerson(Person person) {
        person.setName(inputName());
        person.setDateOfBirth(inputDateOfBirth());
        person.setGender(inputGender());
        person.setIdentityCard(inputIdentityCard());
        person.setPhoneNumber(inputPhoneNumber());
        person.setMail(inputEmail());
    }

    public static String inputName() {
        String name;
        do {
            System.out.println("Enter name (Nguyen Van A): ");
            name = scanner.nextLine();
            if (checkName(name)) {
                break;
            } else {
                System.out.println("Invalid!!!");
            }
        } while (true);
        return name;
    }

    public static String inputEmail() {
        String mail;
        do {
            System.out.println("Enter mail(x@gmail.com/x@outlook.com):");
            mail = scanner.nextLine();
            if (RegexUtil.validateString(mail, EMAIL_EMPLOYEE)) {
                break;
            } else {
                System.out.println("Invalid!!!");
            }
        } while (true);
        return mail;
    }

    public static String inputGender() {
        int choiceGender;
        do {
            try {
                System.out.println("Choose gender (Male/Female/Other): ");
                System.out.println("1.Male");
                System.out.println("2.Female");
                System.out.println("3.Other");
                choiceGender = Integer.parseInt(scanner.nextLine());
                if (choiceGender <= 0 || choiceGender > 3) {
                    System.out.println("Invalid.Choose again!!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid!!!");
            }
        } while (true);
        if (choiceGender == 1) {
            return "Male";
        } else if (choiceGender == 2) {
            return "Female";
        } else {
            return "Other";
        }
    }

    public static String inputPhoneNumber() {
        String phoneNumber;
        do {
            System.out.println("Enter phone Number (0XXXXXXXXX):");
            phoneNumber = scanner.nextLine();
            if (RegexUtil.validateString(phoneNumber, PHONE_NUMBER_EMPLOYEE)) {
                break;
            } else {
                System.out.println("Phone number 10 and start 0.Enter again!!!");
            }
        } while (true);
        return phoneNumber;
    }

    public static String inputIdentityCard() {
        String identityCard;
        do {
            System.out.println("Enter identity Card (9 or 12 number:)");
            identityCard = scanner.nextLine();
            if (RegexUtil.validateString(identityCard, IDENTITY_CARD_EMPLOYEE)) {
                break;
            } else {
                System.out.println("Identity card 9 or 12 number. Enter again!!!");
            }
        } while (true);
        return identityCard;
    }

    public static String inputDateOfBirth() {
        String dateOfBirth;
        do {
            System.out.println("Enter date of birth (yy/MM/yyyy): ");
            dateOfBirth = scanner.nextLine();
            try {
                if (checkDateOfBirth(dateOfBirth)) {
                    break;
                } else {
                    System.out.println("age >= 18 And <= 60. Enter again!!!");
                }
            } catch (DateTimeParseException e) {
                System.out.println("date of birth yy/MM/yyyy. Enter again!!!");
            }
        } while (true);
        return dateOfBirth;
    }

    public static boolean checkName(String str) {
        str = str.trim();
        String[] arrayStr = str.split(" ");
        for (String s : arrayStr) {
            if (!RegexUtil.validateString(s, NAME_EMPLOYEE)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkDateOfBirth(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.parse(date, dateTimeFormatter);
        LocalDate today = LocalDate.now();
        Period period = Period.between(date1, today);
        return (period.getYears() >= 18 && period.getYears() <= 60);
    }
}
