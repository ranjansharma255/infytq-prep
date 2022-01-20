package com.infytq;

import java.lang.*;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        System.out.println(builder.lastIndexOf("w"));
        System.out.println(builder.toString());
    }
}
