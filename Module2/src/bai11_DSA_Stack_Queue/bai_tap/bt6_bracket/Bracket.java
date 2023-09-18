package bai11_DSA_Stack_Queue.bai_tap.bt6_bracket;

import java.util.Stack;

public class Bracket {
    public boolean checkBracket(String str) {
        Stack<Character> stack = new Stack<>();
        String strRight = "";
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equalsIgnoreCase("(")) {
                stack.push(str.charAt(i));
            }
            if (String.valueOf(str.charAt(i)).equalsIgnoreCase(")")) {
                strRight += str.charAt(i);
            }
        }
        if (stack.size() == strRight.length()) {
            return true;
        } else {
            return false;
        }
    }
}
