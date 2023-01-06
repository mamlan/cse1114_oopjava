package src.cse114;

public class Emirp {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; count < 100; i++) {

            if (isPrimeFrontAndBack(i) && !isPalindrome(i)) {
                System.out.printf("%10d", i);
                count++;
                if (count % 10 == 0 && i != 0) System.out.println();

            }
        }
    }
    public static boolean isPalindrome(int number){
        int reverse=0;
        int temp=number;
        while (temp != 0) {

            reverse *= 10;
            reverse += temp % 10;
            temp /= 10;
        }
        return reverse==number;
    }
    public static boolean isPrimeFrontAndBack(int number){
        if(number%2==0||number%3==0||number%5==0)
            return false;
        int reverse=0;
        while (number != 0) {

            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return (reverse%2==0||reverse%3==0||reverse%5==0);
    }
}
