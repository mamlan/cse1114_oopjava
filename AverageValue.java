package src.cse114;

public class AverageValue {
    public static void main(String[] args) {
        double sum = 0;
        double[] array = new double[10];
        for(int i = 0; i < array.length-1; i++){
            array[i]=(double) (Math.random()*100);
            sum =+ array[i];
        }
        double average = (sum / 2);
        System.out.println("The average of the 10 random integers generated are: " + average);
    }
}
