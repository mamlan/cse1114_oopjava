package src.cse114;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a temperature between -58 and 41 degreees Fahrenheit: ");
        int temperature = scanner.nextInt();
        System.out.println("Enter a wind speed greater than or equal to 2: ");
        int windSpeed = scanner.nextInt();

        double windChillTemp = 35.74 + (0.6215*(temperature))-(35.75*Math.pow(windSpeed, 0.16))
                +(0.4275*temperature*Math.pow(windSpeed, 0.16));
        System.out.println("The wind-chill temperature is: " + windChillTemp);


    }
}
