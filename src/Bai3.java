import java.util.Scanner;

public class Bai3 {
    public static String FizzBuzz(int n) {
        if(n%3==0&&n%5==0) return "FizzBuzz";
        else if(n%5==0) return "Buzz";
        else if(n%3==0) return "Fizz";
        else return n+"";
    }
}