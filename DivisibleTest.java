package src.cse114;

import java.util.Scanner;

public class DivisibleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int value = scanner.nextInt();

        if(value%5==0 && value%6==0){
            System.out.println("Your integer is divisible by both 5 and 6");

        }
        else if((value%5==0 && value/6!=0)||(value%5!=0 && value%6==0)){
            System.out.println("Your integer is divisible by 5 or 6");

        }
        if(value%5!=0 && value%6!=0){
            System.out.println("Your integer is divisible by nether 5 or 6");

        }


    }
}
