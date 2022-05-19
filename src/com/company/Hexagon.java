package com.company;

public class Hexagon extends Shape {
    int k = 4;
    int P;

    @Override
    public double getPerimeter() {
        P = 4 * 6;
        return P;
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "k=" + k +
                ", P=" + P +
                "} " + super.toString();
    }
}
