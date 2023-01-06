package src.cse114;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        System.out.println("Enter 10 digits: ");
        int[] array= new int[10];
        for(int i = 0; i < array.length; i++) {
            int a = std.nextInt();
            array[i]=a;
        }
          int[] b=reverse(array);
          for(int j=0;j<array.length; j++){
              System.out.print(array[j]+", ");
          }
        System.out.println();
          for(int k=0;k<b.length;k++){
              System.out.print(b[k]+", ");
        }
    }
    public static int[] reverse(int[] array){
        int[] answer = new int[10];
        int j=0;
        for(int i =array.length - 1; i >= 0;i--){
            answer[j]=array[i];
            j++;
        }
        return answer;
    }
}
