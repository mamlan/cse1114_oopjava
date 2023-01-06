package src.cse114;


import java.util.Random;

public class RandomLetter {
    public static void main(String[] args) {
        Random random=new Random();
        char letter = (char)(Math.random()*26 +'A');
        System.out.println(letter);
    }
}