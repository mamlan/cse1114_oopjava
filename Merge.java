package src.cse114;

import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list1 size and contents: ");
        int size1 = sc.nextInt();
        int[] list1 = new int[size1];
        for (int i = 0; i < size1; i++)
            list1[i] = sc.nextInt();

        System.out.println("Enter list1 size and contents: ");
        int size2 = sc.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i < size2; i++)
            list2[i] = sc.nextInt();

        System.out.print("List1 is ");
        for (int i = 0; i < list1.length; i++)
            System.out.print(list1[i] + " ");
        System.out.println();

        System.out.print("List2 is ");
        for (int i = 0; i < list2.length; i++)
            System.out.print(list2[i] + " ");
        int[] combined = merge(list1, list2);
        System.out.println();

        System.out.print("The merged list is: ");
        for (int i = 0; i < combined.length; i++) {
            System.out.print(combined[i] + " ");
        }
    }
    public static int[] merge(int[] list1, int[] list2) {
        int[] finalArr = new int[list1.length + list2.length];
        for(int i = 0; i < list1.length; i++){
            finalArr[i]=list1[i];
        }
        for(int i = 0; i < list2.length; i++)
            finalArr[list1.length+i]=list2[i];

        for(int i = 0; i < finalArr.length; i++){
            for (int j = 0; j < finalArr.length-1; j++) {
                if(finalArr[j]>finalArr[i]){
                    int temp = finalArr[j];
                    finalArr[j] = finalArr[i];
                    finalArr[i] = temp;
                }
            }
        }
        return finalArr;
    }
}
