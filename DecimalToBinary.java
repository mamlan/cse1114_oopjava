package src.cse114;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int value=input.nextInt();
        System.out.println("Your number in binary is: "+ dec2Bin(value));
    }
    public static String dec2Bin(int value){
        String answer="";
        while (value > 0) {
            answer+=Integer.toString(value%2);
            value/=2;
        }
        String result="";
        for(int i=answer.length()-1;i>=0;i--){
            result+=answer.charAt(i);
        }
        return result;
    }
}
