package src.cse114;

import java.util.Scanner;

public class ShippingWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weight of the package: ");
        double w = scanner.nextDouble();
        double price;
        if(w<0){
            System.out.println("Invalid input.");
        }
         if(0.0 < w && w <= 1.0){
            price = 3.5;
             System.out.println("The price is: " + price);
         }
        else if(1<w && w<=3){
            price = 5.5;
             System.out.println("The price is: " + price);
         }
        else if(3<w && w<=10){
            price = 8.5;
             System.out.println("The price is: " + price);
         }
        else if(10<w &&w <=20){
            price = 10.5;
             System.out.println("The price is: " + price);
         }
        else{
             System.out.println("The package cannot be shipped");
         }
    }
}
