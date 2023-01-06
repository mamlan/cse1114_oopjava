package src.cse114;

import java.util.Scanner;

public class SortRow {
    public static void main(String[] args) {
    Scanner std = new Scanner(System.in);
    double[][] m = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j]= std.nextDouble();
            }
        }
        sortRows(m);
        System.out.println("The row-sorted is: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] sortRows(double[][] m) {
    for(int i=0;i<m.length; i++){
        double[] holder= bubbleSort(m[i]);
        for (int j = 0; j < m[i].length; j++) {
            m[i][j]=holder[j];
        }
    }
    return m;
    }
    public static double[] bubbleSort(double[] d){
        for(int i = 0; i < d.length; i++){
            for(int j=1;j<d.length-i-1; j++){
                if(d[j]>d[j+1]){
                    double temp=d[j];
                    d[j]=d[j+1];
                    d[j+1]=temp;
                }
            }
        }
        return d;
    }
}
