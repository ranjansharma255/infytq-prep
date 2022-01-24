package com.infytq.Introduction;
import java.util.Arrays;
public class Methods {
    public static void main(String[] args) {
        String name = "Ranjan Sharma";
        System.out.println(name.toCharArray());
        // output Ranjan Sharma
        System.out.println(Arrays.toString(name.toCharArray()));
        // output [R, a, n, j, a, n,  , S, h, a, r, m, a]
        System.out.println(name.indexOf('a'));
        System.out.println("    hello    ".trim());
        System.out.println(Arrays.toString(name.split(" ,")));
    }
}
