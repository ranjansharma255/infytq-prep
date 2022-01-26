package JavaInterviewQuestions;
import java.util.*;
// output numbers from 1...100 without using any numbers in your code.
public class PrintOneToHundred {
    public static void main(String[] args) {
        int one = 'A'/'A';
        String s1 = "..........";
        for(int i = one; i <= (s1.length() * s1.length()); i++) {
            System.out.println(i + " ");
        }

        // another approach by using the ascii value of d=100
        // a=97, b=98, c=99, d=100
        for(int i = one; i <= 'd'; i++) {
            System.out.println(i + " ");
        }
    }
}
