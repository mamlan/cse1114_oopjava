package src.cse114;

import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of eggs you ordered: ");
        int eggs = scanner.nextInt();
        int dozenEggs = eggs / 12;
        int singleEggs = eggs % 12;

        double totalPrice = (dozenEggs*3.25)+(singleEggs*0.45);
        System.out.println("Your total price is: $" + totalPrice);
    }
}