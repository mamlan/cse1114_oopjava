package src.cse114;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int upLimit;
        int lowLimit;
        int a;
        System.out.println("Enter the upper limit:");
        Scanner stnd = new Scanner(System.in);

        upLimit = stnd.nextInt();
        System.out.println("Enter the lower limit: ");
        lowLimit = stnd.nextInt();

        if(lowLimit > upLimit || lowLimit == upLimit) {
            System.out.println("Error ");
        }
        else {
            for(int i = lowLimit; i <= upLimit; i++) {

                String b = Integer.toString(i);
                a = 0;
                int c = 0;

                for(int j =0; j < b.length(); j++) {
                    char b1 = b.charAt(j);
                    c = Character.getNumericValue(b1);
                    a = a+ (int) (Math.pow(c, b.length()));

                }
                if(Integer.parseInt(b) == a) {
                    System.out.println("The armstrong numbers are " + a);
                }
            }
        }

}
}
