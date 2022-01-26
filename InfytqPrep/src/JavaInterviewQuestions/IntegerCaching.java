package JavaInterviewQuestions;

public class IntegerCaching {
    public static void main(String[] args) {
        // This Integer Cache works only on "autoboxing"
        // which means Conversion from a primitive type to an object reference is called autoboxing.
        // integer caching range is -128 to 127


        // Initializing variable a and b.
        // Java keeps a integer cache of integer
        // instances in range of -128 to 127.
        // Integer Cache works only on autoboxing.
        // Conversion from primitive type to object
        // reference is called autoboxing.

        //This is applicable for Integer values in the range between –128 to +127.
        //This Integer caching works only on auto-boxing.
        //Integer objects will not be cached when they are built using the constructor.***

        Integer a = 200;
        Integer b = 200;

        // when a integer value is in range of -128 to 127 then it will be stored in integer cache only in the
        // case of autoboxing and both the references point to the same object reference
        // if the value is out of the range of
        // integer cache then both the reference point to different memory locations
        if(a == b) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }
    }
}
