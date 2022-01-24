package com.infytq.Introduction;

class A {
    final int num = 10;
    String name;
    public A(String name) {
        this.name = name;
    }
}
public class finalKeyword {
    public static void main(String[] args) {
        final A obj = new A("Hello");
        obj.name = "other name";
        // cannot do below operation as object is final.
       // obj = new A("new object");
    }
}
