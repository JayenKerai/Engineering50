package com.sparta.jk.engineering50;

public class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }
}
