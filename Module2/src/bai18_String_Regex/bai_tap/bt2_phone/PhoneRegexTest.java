package bai18_String_Regex.bai_tap.bt2_phone;


import java.util.Scanner;

public class PhoneRegexTest {
    public static void main(String[] args) {
        PhoneRegex phoneRegex = new PhoneRegex();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phone: ");
        String phone = scanner.nextLine();
        System.out.println("Phone " + phone + " is valid: " + phoneRegex.validate(phone));
    }
}
