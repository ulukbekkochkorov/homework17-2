package com.company;

public class Square extends Shape {
    int d = 5;
    int P;

    @Override
    public double getPerimeter() {
        P=4*d;
        return P;
    }

    @Override
    public String toString() {
        return "Square{" +
                "d=" + d +
                ", P=" + P +
                "} " + super.toString();
    }
}
