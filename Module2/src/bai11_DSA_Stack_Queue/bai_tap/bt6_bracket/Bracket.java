package bai11_DSA_Stack_Queue.bai_tap.bt6_bracket;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public boolean checkBracket(String str) {
        Stack<Character> stack = new Stack<>();
        String left = "";
        String strSym = "";
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equalsIgnoreCase("(")) {
                stack.push(str.charAt(i));
                left += str.charAt(i);
            }
            if (String.valueOf(str.charAt(i)).equalsIgnoreCase(")")) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    strSym += stack.pop();
                }
            }
        }
        if (!left.equalsIgnoreCase(strSym)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Bracket bracket = new Bracket();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sym: ");
        String sym = scanner.nextLine();
        if (bracket.checkBracket(sym)) {
            System.out.println("Well");
        } else {
            System.out.println("Wrong");
        }
        ;
    }
}
