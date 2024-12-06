package Graphic;

import java.util.Scanner;

/**
 * 图形类Graphic包括两个私有属性：线条的颜色lineColor与填充颜色fillColor，方法包括：
 * 无参构造方法——用于初始化lineColor与fillColor分别为黑色与红色；
 * 带两个参数的构造方法——用形参给成员变量进行初始化；
 * getter/setter方法——用于获取和修改属性值；
 * toString方法——用于返回属性值。
 */
class Graphic {
    private String lineColor, fillColor;

    public Graphic() {
        lineColor = "black";
        fillColor = "red";
    }

    public Graphic(String lineColor, String fillColor) {
        this.lineColor = lineColor;
        this.fillColor = fillColor;
    }

    public void getter() {
        System.out.println("lineColor: " + lineColor + " fillColor: " + fillColor);
    }

    public void setter(String lineColor, String fillColor) {
        this.lineColor = lineColor;
        this.fillColor = fillColor;
    }

    @Override
    public String toString() {
        return "的线条颜色为" + lineColor + "，填充颜色为" + fillColor;
    }
}

/**
 * 矩形类Rectangle继承自Graphic类，包括矩形的长度length和宽度width两个私有属性，方法包括：
 * 构造方法。在构造方法中调用父类Graphic的构造方法初始化父类的两个属性，并初始化本类定义的属性。
 * getter/setter方法
 * toString()方法(要求在本类的toString 调用父类的toString())
 * 计算周长与面积的方法
 */
class Rectangle extends Graphic {
    private double length, width;

    public Rectangle(String lineColor, String fillColor, double length, double width) {
        super(lineColor, fillColor);
        this.length = length;
        this.width = width;
    }

    @Override
    public void getter() {
        super.getter();
        System.out.println("length: " + length + " width: " + width);
    }

    @Override
    public void setter(String lineColor, String fillColor) {
        super.setter(lineColor, fillColor);
    }

    public String getArea() {
        double area = length * width;
        String formattedArea = String.format("%.2f", area);
        return formattedArea;
    }

    public String getPerimeter() {
        double perimeter = (length + width) * 2;
        String formattedPerimeter = String.format("%.2f", perimeter);
        return formattedPerimeter;
    }

    @Override
    public String toString() {
        return super.toString() + "，周长为" + getPerimeter() + "，面积为" + getArea();
    }

}

/**
 * 三角形类Triangle继承自Graphic类，包括三角形的三条边a、b、c三个私有属性，方法包括：
 * 构造方法。在构造方法中调用父类Graphic的构造方法初始化父类的两个属性，并初始化本类定义的属性。
 * getter/setter方法
 * toString()方法(要求在本类的toString 调用父类的toString())
 * 计算周长与面积的方法
 */
class Triangle extends Graphic {
    private double a, b, c;

    public Triangle(String lineColor, String fillColor, double a, double b, double c) {
        super(lineColor, fillColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void getter() {
        super.getter();
        System.out.println("a: " + a + " b: " + b + " c: " + c);
    }

    @Override
    public void setter(String lineColor, String fillColor) {
        super.setter(lineColor, fillColor);
    }

    public String getArea() {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        String formattedArea = String.format("%.2f", area);
        return formattedArea;
    }

    public String getPerimeter() {
        double p = a + b + c;
        String formattedP = String.format("%.2f", p);
        return formattedP;
    }

    @Override
    public String toString() {
        return super.toString() + "，周长为" + getPerimeter() + "，面积为" + getArea();
    }

}

/**
 * 正方形类Square继承自Rectangle类，重写了父类的构造方法、计算面积和周长的方法以及toString方法。
 */
class Square extends Rectangle {
    public Square(String lineColor, String fillColor, double edgeLength) {
        super(lineColor, fillColor, edgeLength, edgeLength);
    }

    @Override
    public String getArea() {
        return super.getArea();
    }

    @Override
    public String getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

/**
 * 主类Main包含main方法，用于根据用户输入创建不同类型的图形对象，并输出其属性。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lineColor, fillColor;
        int n = sc.nextInt();
        switch (n) {
            case 1:
                lineColor = sc.next();
                fillColor = sc.next();
                Graphic g = new Graphic(lineColor, fillColor);
                System.out.println("图形" + g + "。");
                break;
            case 2:
                lineColor = sc.next();
                fillColor = sc.next();
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                Rectangle r = new Rectangle(lineColor, fillColor, length, width);
                System.out.println("矩形" + r + "。");
                break;
            case 3:
                lineColor = sc.next();
                fillColor = sc.next();
                double edgeLength = sc.nextDouble();
                Square s = new Square(lineColor, fillColor, edgeLength);
                System.out.println("正方形" + s + "。");
                break;
            case 4:
                lineColor = sc.next();
                fillColor = sc.next();
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                Triangle t = new Triangle(lineColor, fillColor, a, b, c);
                System.out.println("三角形" + t + "。");
                break;
        }
    }
}
