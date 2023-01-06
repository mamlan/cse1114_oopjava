package src.cse114;
import java.util.Scanner;
public class Format {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the data following the format MM/DD/YYYY");
        String date= input.nextLine();
        String month ="";
        if(date.substring(0,2).equals("01")){
            month+="January";
        }
        if(date.substring(0,2).equals("02")){
            month+="February";
        }
        if(date.substring(0,2).equals("03")){
            month+="March";
        }
        if(date.substring(0,2).equals("04")){
            month+="April";
        }
        if(date.substring(0,2).equals("05")){
            month+="May";
        }
        if(date.substring(0,2).equals("06")){
            month+="June";
        }
        if(date.substring(0,2).equals("07")){
            month+="July";
        }
        if(date.substring(0,2).equals("08")){
            month+="August";
        }
        if(date.substring(0,2).equals("09")){
            month+="September";
        }
        if(date.substring(0,2).equals("10")){
            month+="October";
        }
        if(date.substring(0,2).equals("11")){
            month+="November";
        }
        if(date.substring(0,2).equals("12")){
            month+="December";
        }
        String day= date.substring(3,5);
        String year=date.substring(6,10);
        System.out.println(month+" "+day + ", " +year);
    }
}
