package src.cse114;
import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = std.nextLine();
        System.out.println("Enter char you wish to find: ");
        String temp = std.next();
        char c= temp.charAt(0);
        System.out.println(count(s,c));
    }
    public static int count(String str, char a){
        int value = 0;
        for (int i = 0; i < str.length();i++) {
            if(str.charAt(i)==a){
                value++;
            }
        }
        return value;
    }
}
