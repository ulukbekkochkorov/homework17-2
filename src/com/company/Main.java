package com.company;

public class Main {

    public static void main(String[] args) {
	Triangle triangle = new Triangle();
    Circle circle = new Circle();
    Square square = new Square();
    Pentagon pentagon = new Pentagon();
    Hexagon hexagon = new Hexagon();
        System.out.println("Perimetr of triangle = " + triangle.getPerimeter());
        System.out.println("Length of circle = " + circle.getPerimeter());
        System.out.println("Perimetr of square = " + square.getPerimeter());
        System.out.println("Perimetr of pentagon = " + pentagon.getPerimeter());
        System.out.println("Perimetr of hexagon = " + hexagon.getPerimeter());
    }
}
