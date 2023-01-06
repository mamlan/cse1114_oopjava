package src.cse114;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public boolean isEven(){
        return value%2==0;
    }
    public boolean isOdd(){
        return value%2!=0;
    }
    public boolean isPrime(){
        int i=value-1;
        while(i>1){
            if(value%i==0)
                return false;
            i--;
        }
        return true;
    }
    public boolean equals(int num){
        return num==value;
    }
    public boolean equals(MyInteger integer){
        return integer.value == value;
    }

    public static void main(String[] args) {
        MyInteger myInt = new MyInteger(21);
        MyInteger ma = new MyInteger((17));
        System.out.println(myInt.getValue());
        System.out.println(myInt.isPrime());
        System.out.println(myInt.isEven());
        System.out.println(myInt.isOdd());
        System.out.println(myInt.equals(17));
        System.out.println(myInt.equals(ma));
    }
}
