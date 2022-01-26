package JavaInterviewQuestions;

public class DivideNumberByZero {
    public static void main(String[] args) {
        // what will be the output when you divide a number by zero
        // Number = Integer, Double, Float
        // if we divide a double, float number with zero then infinity will be the answer.

        // infinity
        System.out.println(9.0 / 0);
        System.out.println(12.33f / 0);
        System.out.println(10 / 0.0);
        System.out.println(19.99999d / 0);
//        System.out.println(0/0); // Arithmetic Exception
        // NaN
        System.out.println(0.0 / 0);
        System.out.println(0.0 / 0.0);
    }
}
