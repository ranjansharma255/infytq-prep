package JavaInterviewQuestions;
// what will be the output when you use a long number with L and without L suffix
public class LongNumbers {
    public static void main(String[] args) {
        long longNumberWithoutL = 1000*60*60*24*365;
        long longNumberWithL = 1000*60*60*24*365L;
        System.out.println(longNumberWithoutL); //1471228928
        System.out.println(longNumberWithL);
        //31,53,60,00,000 - 36 bits.

        // max limit of 32 bit int : 2147783647
        // from 36 bits java will finaly remove first 4 bits MSB to accomodate the 32 bit integer


    }
}
