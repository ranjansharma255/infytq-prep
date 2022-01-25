package com.infytq.Polymorphism;

public class EarlyBinding {
    public static class SuperClass {
        public static void print() {
            System.out.println("print in super class");
        }
    }
    public static class SubClass extends SuperClass {
        public static void print() {
            System.out.println("print in sub class");
        }
    }

    public static void main(String[] args) {
        SuperClass A = new SuperClass();
        SuperClass B = new SubClass();
        A.print(); B.print();
    }
}
