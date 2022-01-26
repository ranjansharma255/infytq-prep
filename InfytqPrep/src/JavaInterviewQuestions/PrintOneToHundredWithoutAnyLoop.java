package JavaInterviewQuestions;

import java.util.stream.IntStream;

public class PrintOneToHundredWithoutAnyLoop {
    // to ways to do
    // 1. recursive function
    // 2. java streams - introduced in java se 8
    public static void main(String[] args) {
//        printNum(50, 100);
        //  using java stream and also lambda functions
        IntStream.range(1, 101).forEach(value -> System.out.println(value));
    }

    public static void printNum(int num) {
        if(num <= 100) {
            System.out.print(num + " ");
            num++;
            printNum(num);
        }
    }
    public static void printNum(int startNum, int endNum) {
        if(startNum <= endNum) {
            System.out.print(startNum + " ");
            startNum++;
            printNum(startNum, endNum);
        }
    }
}
