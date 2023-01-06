package src.cse114;

import java.util.ArrayList;
import java.util.Scanner;

public class ToArrayList {
    public static void main(String[] args) {
    Scanner std = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = std.nextLine();
        ArrayList<Character> list = toCharacterArray(s);
        for (Character c : list) {
            System.out.print(c+" ");
        }

    }
    public static ArrayList<Character> toCharacterArray(String s){
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        return list;
    }
}
