package src.cse114;

import java.util.Scanner;

public class Roots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for a: ");
        double a = scanner.nextInt();
        System.out.println("Enter the value for b: ");
        double b = scanner.nextInt();
        System.out.println("Enter the value for c: ");
        double c = scanner.nextInt();
        double quadratic1= ((-b + Math.sqrt((Math.pow(b,2))-(4*a*c)))/2*a);
        double quadratic2= ((-b - Math.sqrt((Math.pow(b,2))-(4*a*c)))/2*a);

        int roots = 0;
        if(((Math.pow(b,2))-(4*a*c))>0){
            System.out.println("The equation has two roots " + quadratic1+ " and" + quadratic2);
        }
        else if(((Math.pow(b,2))-(4*a*c))==0){
            System.out.println("The equation has two roots " + quadratic1);
        }
        else{
            System.out.println("There are no real roots");
        }
    }
    }


