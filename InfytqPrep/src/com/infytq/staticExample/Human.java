package com.infytq.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        // static variables should be refered by class name.
        Human.population += 1;
    }
}
