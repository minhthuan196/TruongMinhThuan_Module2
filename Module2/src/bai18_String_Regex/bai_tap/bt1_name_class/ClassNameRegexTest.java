package bai18_String_Regex.bai_tap.bt1_name_class;

import java.util.Scanner;

public class ClassNameRegexTest {
    public static void main(String[] args) {
        ClassNameRegex classNameRegex = new ClassNameRegex();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter class name: ");
        String className = scanner.nextLine();
        System.out.println("Class name " + className + " is valid: " + classNameRegex.validate(className));
    }

}
