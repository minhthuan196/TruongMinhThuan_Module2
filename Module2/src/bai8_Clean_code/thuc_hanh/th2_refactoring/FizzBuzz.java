package bai8_Clean_code.thuc_hanh.th2_refactoring;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isFizz)
            return "Buzz";

        return number + "";
    }
}