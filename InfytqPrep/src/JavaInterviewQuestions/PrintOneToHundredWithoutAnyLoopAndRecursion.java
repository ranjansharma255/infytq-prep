package JavaInterviewQuestions;

import java.util.Arrays;
import java.util.BitSet;

public class PrintOneToHundredWithoutAnyLoopAndRecursion {
    public static void main(String[] args) {
        // 1.Arrays fill method
        Object num = new Object[100];
        Arrays.fill((Object[]) num, new Object() {
            int count = 0;
            @Override
            public String toString() {
                return Integer.toString(++count);
            }
        });

//        System.out.println(Arrays.toString((Object[])num));


        // 2. bitset
//        String set = new BitSet() {{set(1, 101);}}.toString();
//        System.out.append(set, 1, set.length());
        // 3. another bitset approach
        BitSet bset = new BitSet();
        bset.set(1, 101);
        System.out.println(bset);
    }
}
