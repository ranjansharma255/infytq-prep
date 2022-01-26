package com.infytq.abstractDemo;

public class Daughter extends Parent {

    public Daughter(int age) {
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("i am going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love saafdsaf");
    }
}
