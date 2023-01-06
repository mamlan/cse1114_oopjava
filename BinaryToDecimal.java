package src.cse114;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your value in binary number: ");
    String binary = input.nextLine();
    System.out.println("Your answer in decimal is: "+ bin2Dec(binary));
    }
    public static int bin2Dec(String binaryString){
        int answer=0;
        int exponent=0;
        for(int i=binaryString.length() - 1; i >= 0; i--){
            char c= binaryString.charAt(i);
            answer+=Integer.parseInt(String.valueOf(c))*Math.pow(2,exponent);
            exponent++;
        }
        return answer;
    }
}
