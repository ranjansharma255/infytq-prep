package JavaInterviewQuestions;
// NaN is not defined in c language
// in c++ it is defined
public class NotANumber {
    public static void main(String[] args) {
//        System.out.println(2 / 0); // arithmetic exception
//        System.out.println(2.0 / 0.0); // infinity
//        System.out.println(0.0 / 0.0); // NaN
//        System.out.println(0.0/0); // NaN
//        System.out.println(Math.sqrt(-1)); // NaN
//        System.out.println(Math.sqrt(-0)); // 0.0
//        System.out.println(Math.sqrt(1/0)); // Arithmetic Exception

//        System.out.println(Float.NaN == Float.NaN);
        double nan = 2.1 % 0; // NaN
        // I can't compare two NaN values because both are undefined numbers
        System.out.println((2.1 % 0) == nan);
        System.out.println(nan == nan);


    }
}
