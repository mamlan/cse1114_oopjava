package src.cse114;

import java.util.Scanner;

public class Complex {
    private double realPart, imaginaryPart;
    private final double i= Math.sqrt(-1);

    public Complex(double realPart, double imaginaryPart){
        this.realPart=realPart;
        this.imaginaryPart=imaginaryPart;
    }
    public Complex(){}

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getI() {
        return i;
    }
    public Complex add(Complex a){
        double r = this.realPart+ a.getRealPart();
        double i = this.imaginaryPart+a.imaginaryPart;
        return new Complex(r,i);
    }
    public Complex subtract(Complex a){
        double r = this.realPart- a.getRealPart();
        double i = this.imaginaryPart-a.imaginaryPart;
        return new Complex(r,i);
    }
    public String toString(){
        return "(" + realPart + "," + imaginaryPart + ")";
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        Complex a = new Complex();
        Complex b = new Complex();
        System.out.println("Enter real part of the first complex number: ");
        a.realPart= std.nextDouble();
        System.out.println("Enter imaginary part of the first complex number: 6");
        a.imaginaryPart = std.nextDouble();

        System.out.println("Enter real part of the secondary complex number: ");
        b.realPart= std.nextDouble();
        System.out.println("Enter imaginary part of the secondary complex number: 6");
        b.imaginaryPart = std.nextDouble();

        System.out.println("First complex number is: "+ a.toString());
        System.out.println("First complex number is: "+ b.toString());

        System.out.println("Addition of the complex numbers is: "+ a.add(b).toString());
        System.out.println("Addition of the complex numbers is: "+ a.subtract(b).toString());


    }
}
