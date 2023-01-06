package src.cse114;
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String s = input.nextLine();
        s = s.replaceAll(" ", "");
        s = s.toLowerCase();

        System.out.println(palindrome(s));
    }

    public static boolean palindrome(String s) {
        for (int i = 0, j = s.length()-1; i <= (s.length() / 2)+1&&j> s.length() / 2;i++,j-- )
                if ((s.charAt(i))!=(s.charAt(j))) {
                    return false;
                }

        return true;
    }
}

