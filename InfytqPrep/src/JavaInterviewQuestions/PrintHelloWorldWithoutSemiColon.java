package JavaInterviewQuestions;

public class PrintHelloWorldWithoutSemiColon {
    public static void main(String[] args) {
        //1. using if condition
        if(System.out.printf("Hello World" + "\n") == null) {

        }
        // 2.
        if(System.out.append("Hello World" + "\n") == null) {

        }

        // 3.
        if(System.out.append("Hello World" + "\n").equals(null)) {

        }

        // 4 using for loop
        for(int i = 0; i < 1; System.out.println("Hello World" + "\n")) {
            i++;
        }
    }
}
