package bai11_DSA_Stack_Queue.bai_tap.bt5_palindrome;


import java.util.*;

public class Palindrome {
    public boolean checkPalindrome(String str) {
        str = str.toLowerCase();
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        String[] arrayStr = str.split("");
        for (String s : arrayStr) {
            queue.add(s);
            stack.push(s);
        }
        int size = stack.size();
        String elementStack;
        String elementQueue;
        for (int i = 0; i < size; i++) {
            elementStack = stack.pop();
            elementQueue = queue.remove();
            if (!(elementStack.equalsIgnoreCase(elementQueue))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.checkPalindrome("Able was I ere I saw Elba thuan"));
    }
}
