package com.infytq.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        System.out.println("Box weight Constructor");
    }
    BoxWeight(BoxWeight other){
    }
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

}
