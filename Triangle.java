package src.cse114;

import java.util.Scanner;

public class Triangle extends GeometricObject {
    private double side1 =1.0;
    private double side2 =1.0;
    private double side3 =1.0;

    public Triangle(){}

    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    public double getArea(){
        double s=(getSide1()+getSide2()+getSide3())/2;
        return Math.sqrt(s*(s-getSide1())*(s-getSide2())*(s-getSide3()));
    }
    public double getPerimeter(){
        return getSide1()+getSide2()+getSide3();
    }
    public String toString() {
        return  super.toString()+ "\nTriangle {" +
                "side1=" + side1 +
                ", side2= " + side2 +
                ", side3= " + side3 +
                '}' +
                "\nPerimeter: " + getPerimeter()+
                "\nArea: "+ getArea();
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle: ");
        double side1 = std.nextDouble();
        double side2 = std.nextDouble();
        double side3 = std.nextDouble();
        Triangle triangle = new Triangle(side1, side2, side3);

        System.out.println("Enter the color of the triangle: ");
        triangle.setColor(std.next());

        System.out.println("Is the triangle filled? Enter 'yes' or 'no: ");
        String s= std.next();
        boolean b = (s.equals("yes")? true: false);
        triangle.setFilled(b);

        System.out.println(triangle.toString());
    }
}
