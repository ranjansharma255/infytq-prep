package com.infytq.staticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    // will only run once, when first obj is created
    // i.e when class is loaded.
    static {
        System.out.println("I'm in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
