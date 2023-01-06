package src.cse114;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates x1 and y1: ");
        double x1= scanner.nextDouble();
        double y1= scanner.nextDouble();

        if(10> Math.pow((Math.pow(x1,2)+Math.pow(y1,2)),.5)) {
            System.out.println("Point (" + x1+", "+y1+") is in the circle");
        }
        else{
            System.out.println("Point(" + x1+", "+y1+") is not in the circle.");
        }

    }
}
