package src.cse114;

public class Sum {
    public static void main(String[] args) {
        sum(20);
    }
    public static void sum(int x){
        double value = 0;
        System.out.println("i       m(i)");
        for (int i = 1; i <=x;i++) {
            value+=(double)i/(i+1);
            System.out.println(i+"      "+value);
        }
    }
}
