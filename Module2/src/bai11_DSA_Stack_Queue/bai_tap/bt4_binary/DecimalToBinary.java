package bai11_DSA_Stack_Queue.bai_tap.bt4_binary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public String changeDecimalToBinary(int number) {
        String binary = "";
        Stack<Integer> stack = new Stack<Integer>();
        while (number != 0) {
            stack.push(number % 2);
            number = number / 2;
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            binary += stack.pop();
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        System.out.println("Enter number: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(number + " to binary: " + decimalToBinary.changeDecimalToBinary(number));
    }
}
