package src.cse114;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the upper limit: ");
        int limit = scanner.nextInt();

        int temp=0;
        for(int i = limit;i>=6;i--){
            int value=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    value+=j;
                }
            }
            if(value==i){
                System.out.print("the perfect numbers below " + limit + " are: ");
                System.out.println(value+" ");
                temp++;
            }
        }

    }
}
