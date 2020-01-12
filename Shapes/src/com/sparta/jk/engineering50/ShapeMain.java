package com.sparta.jk.engineering50;

public class ShapeMain {

    public static void main(String[] args) {
        ShapeFactory shapeFactory1 = new ShapeFactory(10, 12);
        ShapeFactory shapeFactory2 = new ShapeFactory(13);

        Shape shape1 = shapeFactory2.getShape("circle");
        System.out.println(shape1.getArea());

        Shape shape2 = shapeFactory1.getShape("rectangle");
        System.out.println(shape2.getArea());

        Shape shape3 = shapeFactory2.getShape("square");
        System.out.println(shape3.getArea());

        Shape shape4 = shapeFactory1.getShape("triangle");
        System.out.println(shape4.getArea());

    }
}
