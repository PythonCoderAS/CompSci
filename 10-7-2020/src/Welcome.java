import java.util.Scanner;

public class Welcome {
    public static void main(String[] args){
        Scanner kboard = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = kboard.nextLine();
        System.out.println("Hello, " + firstName + "! Welcome to Java!");
    }
}
