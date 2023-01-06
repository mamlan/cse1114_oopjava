package src.cse114;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class PlateNumber {
    public static void main(String[] args) {
        char letter1 = (char) ((int)(Math.random()*26+65));
        char letter2 = (char) ((int)(Math.random()*26+65));
        char letter3 = (char) ((int)(Math.random()*26+65));

        int numbers =  (int)(Math.random()*10000);
        //Zeros padding using format method
        String sNumbers = String.format("%04d" ,numbers );

        System.out.println("The plate number is " + letter1 + letter2 +letter3 + sNumbers);
    }
}
