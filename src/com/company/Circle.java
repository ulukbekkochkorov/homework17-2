package com.company;

public class Circle extends Shape {
    int r = 4;
    final double PI = 3.14159d;
    double P;

    @Override
    public double getPerimeter() {
        P = 2*r*PI;
        return P;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", PI=" + PI +
                ", P=" + P +
                "} " + super.toString();
    }
}
