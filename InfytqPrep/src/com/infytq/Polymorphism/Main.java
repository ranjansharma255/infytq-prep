package com.infytq.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
//        Square square = new Square();
        Shapes square = new Square();
        square.area();
    }
}
