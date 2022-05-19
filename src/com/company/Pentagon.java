package com.company;

public class Pentagon extends Shape {
    int e = 2;
    int f = 3;
    int g = 1;
    int h = 5;
    int j = 7;
    int P;

    @Override
    public double getPerimeter() {
        P=e+f+g+h+j;
        return P;
    }

    @Override
    public String toString() {
        return "Pentagon{" +
                "e=" + e +
                ", f=" + f +
                ", g=" + g +
                ", h=" + h +
                ", j=" + j +
                ", P=" + P +
                "} " + super.toString();
    }
}
