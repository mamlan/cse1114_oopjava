package src.cse114;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in pounds: ");
        double weight = input.nextDouble()*0.45359237;
        System.out.println("Enter your height in inches: ");
        double height = input.nextDouble()* 0.0254;
        double bmi = weight/Math.pow(height, 2);
        System.out.println("BMI is " + bmi);

    }
}
