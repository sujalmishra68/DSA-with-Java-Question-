import java.util.*;
public class numDay {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number");
        int day=sc.nextInt();
          //oldSwitch(day);
           newSwitch(day);
             sc.close();
    }
         public static void newSwitch(int day){
           String daystr = switch (day) {
              case 1 ->"Monday";
              case 2 ->"Tuesday";
              case 3 ->"Wednesday";
              case 4 ->"Thursday";
              case 5 ->"friday";
              case 6 ->"Saturday";
              case 7 ->"Sunday";
              default -> "error";
           
           };
           System.out.println(daystr);
         }

        public static void oldSwitch(int day){
            switch (day){
          case 1: 
          System.out.println("monday");
          break;
          case 2: 
          System.out.println("Tuesday");
          break;
          case 3: 
          System.out.println("wednesday");
          break;
          case 4: 
          System.out.println("Thursday");
          break;
          case 5: 
          System.out.println("friday");
          break;
          case 6: 
          System.out.println("Saturday");
          break;
          case 7: 
          System.out.println("Sunday");
          break;
          default:
            System.out.println("invalid input");
         }
        

    }
}
