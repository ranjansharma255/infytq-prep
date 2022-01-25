package com.infytq.Inheritance;

public class BoxPrice extends BoxWeight {
    BoxPrice() {
        System.out.println("Box Price Constructor");
    }
    public static void main(String[] args) {
        BoxPrice bp = new BoxPrice();
    }
}
