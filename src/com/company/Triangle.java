package com.company;

public class Triangle extends Shape {
    int a = 8;
    int b = 10;
    int c = 9;
    int P;

    @Override
    public double getPerimeter() {
        P = a+b+c;
        return P;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", P=" + P +
                "} " + super.toString();
    }
}
