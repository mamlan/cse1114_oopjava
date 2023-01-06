package src.cse114;
import java.util.Scanner;

public class Energy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms: ");
        double kilo = scanner.nextDouble();
        System.out.println("Enter the initial temperature: ");
        double initialTemp = scanner.nextDouble();
        System.out.println("Enter the final temperature: ");
        double finalTemp = scanner.nextDouble();


        double answer = kilo*(finalTemp-initialTemp)*4184;
        System.out.println("The energy needed is: " + answer);


    }
}