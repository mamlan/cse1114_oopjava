package src.cse114;

import java.util.Scanner;

public class Rational {
    private int numerator, denominator;
    public Rational(){}

    public Rational(int numerator, int denominator){
    int gcd = gcd(numerator, denominator);
    this.numerator = numerator/gcd;
    this.denominator = denominator / gcd;
    }
    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public Rational add(Rational r) {
        int  num = numerator * r.denominator + r.numerator * denominator;
        int denom = denominator * r.denominator;
        return new Rational(num, denom);
    }
    public Rational subtract(Rational r) {
        int num = numerator * r.denominator - r.numerator * denominator;
        int denom = denominator  * r.denominator;
        return new Rational(num, denom);
    }
    public Rational multiply(Rational r) {
        int num = numerator * r.numerator;
        int denom = denominator * r.denominator;
        return  new Rational(num, denom);
    }
    public Rational divide(Rational r) {
        int num = numerator * r.denominator;
        int denom = denominator * r.numerator;
        return new Rational(num, denom);
    }

    public static int gcd(int a, int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }

    public String toString() {
        return "(" + numerator + "/" + denominator + ")";
    }
}
class RationalTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rational a= new Rational();
        Rational b= new Rational();

        System.out.println("Enter numerator for the first rational number: ");
        a.setNumerator(input.nextInt());
        System.out.println("Enter a non-zero denominator for the first rational number: ");
        a.setDenominator(input.nextInt());
        System.out.println("Enter a numerator for the second rational number: ");
        b.setNumerator(input.nextInt());
        System.out.println("Enter a non-zero denominator for the second rational number: ");
        b.setDenominator(input.nextInt());

        System.out.println("First rational number is: " + a);
        System.out.println("Second rational number is: " + b);
        System.out.println("Addition of the rational number is: " + a.add(b));
        System.out.println("Subtraction of the rational number is: " + a.subtract(b));
        System.out.println("Multiplication of the rational number is: " + a.multiply(b));
        System.out.println("Division of the rational number is: " + a.divide(b));
    }
}
