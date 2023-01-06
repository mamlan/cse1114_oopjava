package src.cse114;
import java.util.Scanner;

public class Deviation {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        double[] array=new double[10];
        System.out.println("Enter 10 digits: ");
        for(int i=0;i<array.length; i++){
            double a= std.nextDouble();
            array[i]=a;
        }
        System.out.println(mean(array));
        System.out.println(deviation(array));
    }
    public static double mean(double[] x){
        double mean=0;
        for (double v : x) {
            mean += v;
        }
        return (mean/(double)x.length);
    }
    public static double deviation(double[] x){
        double mean= mean(x);

        double sd= 0;
        for (double v : x) {
            sd += Math.pow(v - mean,2);
        }
        return Math.sqrt(sd/(x.length-1));
    }

}
