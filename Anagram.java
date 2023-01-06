package src.cse114;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String first = std.nextLine();

        System.out.println("Enter the second string: ");
        String second = std.nextLine();

        if(isAnagram(first, second))
            System.out.println(first+" and "+ second +" are anagrams");
        else
            System.out.println(first+ " and "+ second +" are NOT anagrams");
    }

    public static boolean isAnagram(String first, String second) {
        first=first.toLowerCase();
        second=second.toLowerCase();;
        for(int i = 0; i <first.length(); i++) {
            int j = 0;
            boolean found = false;
            while (j < second.length()) {
                if (first.charAt(i) == second.charAt(j)) {
                    found = true;
                    break;
                }
                j++;
            }
            if(!found)
                return false;
        }
        for(int i = 0; i <second.length(); i++) {
            int j = 0;
            boolean found = false;
            while (j < first.length()) {
                if (second.charAt(i) == first.charAt(j)) {
                    found = true;
                    break;
                }
                j++;
            }
            if(!found)
                return false;
        }

        return true;
    }
}
