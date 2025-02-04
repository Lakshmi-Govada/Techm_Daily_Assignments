/*Create a package com.example.shapes. Inside this package, define a class Rectangle with instance 
variables length and width. Write methods to calculate the area and perimeter of the rectangle.*/

package com.example.shapes;

public class RectangleShapes {
    private double length;
    private double width;

    public RectangleShapes(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        RectangleShapes rectangle = new RectangleShapes(5.0, 10.0);

        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}
