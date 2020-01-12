package com.sparta.jk.engineering50;

public class ShapeFactory {
    double input1;
    double input2;

    public ShapeFactory(double input1, double input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    public ShapeFactory(double input1) {
        this.input1 = input1;
    }

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        String shapeType1 = shapeType.toLowerCase();
        switch (shapeType1) {
            case "circle":
                return new Circle(input1);
            case "rectangle":
                return new Rectangle(input1, input2);
            case "square":
                return new Square(input1, input1);
            case "triangle":
                return new Triangle(input1, input2);
            default:
                return null;
        }

    }
}
