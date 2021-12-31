import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = kboard.nextLine();
        System.out.print("Enter your favorite food: ");
        String food = kboard.nextLine();
        System.out.println("Hi, " + firstName + "! I like " + food + " too!");
    }
}
