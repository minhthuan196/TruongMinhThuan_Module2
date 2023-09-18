package bai11_DSA_Stack_Queue.bai_tap.bt1_reverse_stack;


import java.util.Stack;

public class StackReverse {
    public void stackReverseInteger(int[] arr) {
        Stack<Integer> stackInteger = new Stack<>();
        for (Integer integer : arr) {
            stackInteger.push(integer);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stackInteger.pop();
        }
    }

    public String stackReverseString(String mWord) {
        Stack<String> wStack = new Stack<>();
        String[] arrayMWord = mWord.split(" ");
        String mWordOut = "";
        for (String s : arrayMWord) {
            wStack.push(s);
        }
        for (int i = 0; i < arrayMWord.length; i++) {
            mWordOut += wStack.pop() + " ";
        }
        return mWordOut;
    }

    public static void main(String[] args) {
        StackReverse stackReverse = new StackReverse();
        int[] arrayInteger = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Array original: ");
        for (Integer integer : arrayInteger) {
            System.out.print(integer + "\t");
        }
        stackReverse.stackReverseInteger(arrayInteger);
        System.out.println("\nArray after retrieving from stack: ");
        for (Integer integer : arrayInteger) {
            System.out.print(integer + "\t");
        }

        String mWord = "Truong Minh Thuan";
        System.out.println("\n" + mWord);
        System.out.println(stackReverse.stackReverseString(mWord));

    }

}
