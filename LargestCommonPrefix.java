package src.cse114;
import java.util.Scanner;
public class LargestCommonPrefix {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String a = std.nextLine();
        System.out.println("Enter the second string: ");
        String b = std.nextLine();

        String prefix="";
        for (int i = 0;i < a.length()&& i<b.length();i++) {
            char ac= a.charAt(i);
            char bc= b.charAt(i);

            if(a.charAt(0)==b.charAt(0)){

                if(ac==bc){
                    prefix+=ac;
                }
            }
        }
        if(prefix.length()>0){
            System.out.println("The longest common prefix is: "+ prefix);
        }
       else{
            System.out.println(a+" and " + b+ " have no common prefix");
        }
    }
}
