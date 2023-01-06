package src.cse114;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(double a,double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return (Math.pow(b,2)-(4*a*c));
    }
    public double getRoot1(){
        if(getDiscriminant()<0)
            return 0;
        return ((-b+Math.sqrt(getDiscriminant()))/2*a);
    }
    public double getRoot2(){
        if(getDiscriminant()<0)
            return 0;
        return ((-b-Math.sqrt(getDiscriminant()))/2*a);
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        System.out.println("Enter value for a: ");
         double a = std.nextDouble();
        System.out.println("Enter value for b: ");
        double b = std.nextDouble();
        System.out.println("Enter value for c: ");
        double c = std.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a,b,c);
        if(qe.getDiscriminant()>0)
            System.out.println("The equation has two roots "+ qe.getRoot1()+" and "+ qe.getRoot2());
        else if(qe.getDiscriminant()==0)
            System.out.println("The equation has one root "+ qe.getRoot1());
        else{
            System.out.println("No roots");
        }

    }
}
