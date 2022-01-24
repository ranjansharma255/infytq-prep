package com.infytq.staticExample;

public class InnerClasses {
    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Hello");
        Test b = new Test("Rajan");
//        System.out.println(a.name);
//        System.out.println(b.name);
        System.out.println(a);
    }
}
