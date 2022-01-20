package com.infytq;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "abccba";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        if(str == null || str.length() == 0)
            return true;
        str = str.toLowerCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(len - 1 - i);
            if(start != end)
                return false;
        }
        return true;
    }
}
