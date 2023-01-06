package src.cse114;
import java.util.Scanner;
public class FuelEfficiency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the driving distance: ");
        double distance= scanner.nextDouble();

        System.out.println("Enter Miles per gallon: ");
        double milesPerGallon= scanner.nextDouble();

        System.out.println("Enter price per gallon: ");
        double pricePerGallon= scanner.nextDouble();

        double cost = ((distance/milesPerGallon)*pricePerGallon);
        System.out.println("The cost of driving is: " + cost);

    }
}
