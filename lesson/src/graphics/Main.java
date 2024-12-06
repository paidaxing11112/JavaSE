package graphics;

import java.util.Objects;
import java.util.Scanner;

abstract class Shape {
    String name;
    String color;
    public Shape() {}
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void getter() {
        System.out.print(name + " " + color);
    }
    public void setter(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public abstract double getPerimeter();
    public abstract double getArea();
}
class Rectangle extends Shape{
    double chang,kuan;
    public Rectangle(String name, String color, double chang, double kuan) {
        super(name, color);
        this.chang = chang;
        this.kuan = kuan;
    }
    @Override
    public double getPerimeter() {
        return 2 * (chang + kuan);
    }

    @Override
    public double getArea() {
        return chang * kuan;
    }
}
class Square  extends Rectangle{
    double bianchang;
    public Square(String name, String color, double bianchang) {
        super(name, color,bianchang,bianchang);
        this.bianchang = bianchang;
    }
    @Override
    public double getPerimeter() {
        return 4 * bianchang;
    }

    @Override
    public double getArea() {
        return bianchang * bianchang;
    }
}

class Circle extends Shape{

    double banjing;
    public Circle(String name, String color, double banjing) {
        super(name, color);
        this.banjing = banjing;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * banjing;
    }

    @Override
    public double getArea() {
        return Math.PI * banjing * banjing;
    }
}

public class Main {
    public static void main(String[] args) {
        String name, color;
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        color = sc.next();
        if (Objects.equals("graphics.Circle", name)) {
            double banjing = sc.nextDouble();
            Circle circle = new Circle(name, color, banjing);
            System.out.print(name + " " + color + " ");
            System.out.printf("%.1f %.2f %.2f",banjing,circle.getPerimeter(),circle.getArea());
        } else if (Objects.equals("graphics.Square", name)) {
            double bianchang = sc.nextDouble();
            Square square = new Square(name, color, bianchang);
            System.out.print(name + " " + color + " ");
            System.out.printf("%.1f %.2f %.2f",bianchang,square.getPerimeter(),square.getArea());
        } else {
            double chang = sc.nextDouble();
            double kuan = sc.nextDouble();
            Rectangle rectangle = new Rectangle(name, color, chang, kuan);
            System.out.print(name + " " + color + " ");
            System.out.printf("%.1f %.1f %.2f %.2f",chang,kuan,rectangle.getPerimeter(),rectangle.getArea());
        }

    }
}

