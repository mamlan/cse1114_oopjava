package src.cse114;

import java.util.Scanner;

public class MultiplyMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] a= new double[3][3];
        double[][] b=new double[3][3];

        System.out.println("Enter mattrix 1: ");
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }
        System.out.println("Enter matrix 2: ");
        for(int i = 0; i < b.length; i++){
            for (int j = 0; j < b[i].length;j++ ) {
                b[i][j]=input.nextDouble();
            }
        }
        double[][] c= multiplyMatrix(a, b);
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static double[][] multiplyMatrix(double[][]a, double[][] b){
        double [][] c = new double[3][3];
        for(int i = 0; i < c.length; i++){
            for (int j = 0; j < c[i].length; j++) {
                c[i][j]=(a[i][0]*b[0][j])+(a[i][1]*b[1][j])+(a[i][2]*b[2][j]);
            }
        }
        return c;
    }
}
