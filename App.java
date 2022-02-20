import java.util.Scanner;

public class App {
    
    public static void main(String[] args){
        if (args[0].equals("Giwrgos")){
            System.out.println("Hello Master");
            System.exit(0);
        }else{
            System.out.println("Hello "+ args[0]);
        }
        Scanner inputScanner =new Scanner(System.in);
        
        System.out.println("Enter your name");
        String inputString = inputScanner.nextLine();
        System.out.println("Hello "+ inputString);

        inputScanner.close();

        }
}
