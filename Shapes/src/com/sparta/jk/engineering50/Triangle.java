package com.sparta.jk.engineering50;

public class Triangle implements Shape {
    double height;
    double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
