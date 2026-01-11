import java.util.Scanner;

public class CommandFind {
    public static void main(String[] args) {
        
    
Scanner sc= new Scanner(System.in);
while(true){
    System.out.println("Enter the command");
    String command= sc.nextLine();
    if(command.equalsIgnoreCase("exit")){
        break;
    }
    
}

System.out.println("you have successfully exited.");
}
}
