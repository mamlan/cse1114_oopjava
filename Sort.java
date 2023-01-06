package src.cse114;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] s = new String[10];
        System.out.println("Enter 10 Strings: ");
        for (int i = 0; i < 10;i++) {
            s[i]= input.nextLine();
        }
        sort(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+", ");
        }

    }
    public static void sort(String[] s){
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length-1; j++) {
                if(s[j].compareTo(s[i])>0){
                    String temp = s[j];
                    s[j]=s[i];
                    s[i]=temp;
                }
            }
        }
    }
}
