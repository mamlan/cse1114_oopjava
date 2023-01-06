package src.cse114;

import java.util.Arrays;
import java.util.Scanner;

public class Cities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cities= new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the first three city:");
            cities[i] = scanner.nextLine();
        }
        Arrays.sort(cities);
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1)+". " +cities[i]);
        }
        }
    }


