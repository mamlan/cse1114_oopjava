package src.cse114;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three sides: ");
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();

        if ((s1 + s2 < s3)||(s1+s3<s2)||(s2+s3<s1)) {
            System.out.println("Invalid input!");
        }
        else if(s1+s2+s3==9) {
            System.out.println("Equilateral");
        }
}
}