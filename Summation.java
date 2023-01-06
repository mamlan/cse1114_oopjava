package src.cse114;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your n value: ");
        int n = input.nextInt();
        double value = 0.0;
        System.out.println(value);
        for (int i = 1; i <= n; i++) {
            value +=((double)i/((2*i)+1));
            System.out.print(value + " ");
        }
    }

}