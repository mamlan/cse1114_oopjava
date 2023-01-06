package src.cse114;

import java.util.Scanner;

public class Polygon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of sides: ");
        int s = scanner.nextInt();

        System.out.println("Enter the side: ");
        double n = scanner.nextDouble();
        double area = ((s*Math.pow(n,2))/(4*Math.tan(Math.PI/s)));
        System.out.println("The area is: "+area);
    }
}
