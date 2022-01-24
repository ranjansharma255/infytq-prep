package com.infytq.Introduction;

import java.sql.SQLOutput;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1234f;
        System.out.printf("Formatted number is %.2f", a);
        System.out.println();
        System.out.println(Math.PI);
        System.out.printf("%.3f",Math.PI);
        System.out.println();
        System.out.printf("Hello my name is %s and i am %s", "Ranjan", "cool");
    }
}
