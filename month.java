 import java.util.*;
public class month {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the month  number:");
        int mon= sc.nextInt();
         String monstr = switch (mon) {
            case 1->"January";
            case 2->"Febuary";
            case 3->"March";
            case 4->"April";
            case 5->"May";
            case 6->"June";
            case 7->"July";
            case 8->"August";
            case 9->"september";
            case 10->"October";
            case 11->"November";
            case 12->"December";
            default ->"Invalid month number";

         };
             System.out.println("Month is: " + monstr);
    }
}
