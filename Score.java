package src.cse114;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        System.out.println("Enter the total number of students: ");
        int[] students = new int[std.nextInt()];
        int best=0;
        for(int i=0;i< students.length;i++){
            System.out.println("Enter the grade for Student "+i);
            students[i]=std.nextInt();
            if(students[i]>best)
                best=students[i];
        }
        for (int i = 0; i < students.length;i++) {
            if(students[i]>=best-10)
                System.out.println("Student "+i+" is "+students[i]+" and grade is A");
            if(students[i]>=best-20&& students[i]<best-10)
                System.out.println("Student "+i+" is "+students[i]+" and grade is B");
            if(students[i]>=best-30&& students[i]<best-20)
                System.out.println("Student "+i+" is "+students[i]+" and grade is C");
            if(students[i]>=best-40&& students[i]<best-30)
                System.out.println("Student "+i+" is "+students[i]+" and grade is D");
        }
    }
}
