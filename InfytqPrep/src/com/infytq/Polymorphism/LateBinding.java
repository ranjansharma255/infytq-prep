package com.infytq.Polymorphism;

public class LateBinding {
    public static class SuperClass {
        public void print() {
            System.out.println("print in super class");
        }
    }
    public static class SubClass extends SuperClass{
        public void print() {
            System.out.println("print in sub class");
        }
    }

    public static void main(String[] args) {
        SuperClass a = new SuperClass();
        SuperClass b = new SubClass();
        a.print();
        b.print();
    }
}
