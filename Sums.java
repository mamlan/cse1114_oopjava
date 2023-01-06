package src.cse114;

import java.util.Scanner;

public class Sums {
    public static void main(String[] args) {
    Scanner std = new Scanner(System.in);
    double[][] m=new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                m[i][j]=std.nextDouble();
            }
        }
        System.out.println("Sum of major diagonal is "+ sumMajorDiagonal(m));
    }
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0, j = 0; i < 4 && j < 4; i++, j++) {
            sum += m[i][j];
        }
        return sum;
    }

}
