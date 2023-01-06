package src.cse114;

import java.util.Scanner;

public class EliminateDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");
        int[] list = new int[10];
        for(int i = 0; i < 10; i++)
            list[i]= input.nextInt();

       int[] arr= eliminateDupilcate(list);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static int[] eliminateDupilcate(int[] list) {
        boolean quit=false;
        int[] temp= new int[1];
        int holder=0;
        for (int k : list) {
            for (int i : temp) {
                if (i == k)
                    quit = true;
            }
            if (quit != true) {
                if (holder >= temp.length) {
                    temp = arrayBacked(temp);
                }
                temp[holder] = k;
                holder++;
            }
            quit = false;
        }
        return temp;
    }
    public static int[] arrayBacked(int[] list){
        int[] newList = new int[list.length+1];
        for (int i = 0; i < list.length; i++) {
            newList[i]=list[i];
        }
        return newList;
    }
}
