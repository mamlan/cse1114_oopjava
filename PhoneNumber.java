package src.cse114;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the phone number : ");
        String s = in.nextLine();
        System.out.println("Formatted phone number : (" + s.substring(0, 3) + ")" + s.substring(3, 6) + "-" + s.substring(6));
    }
}
