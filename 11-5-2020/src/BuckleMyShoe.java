import java.util.Scanner;

public class BuckleMyShoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int number = scanner.nextInt();
        switch (number){
            case 1:
            case 2:
                System.out.println("Buckle your shoe.");
                break;
            case 3:
            case 4:
                System.out.println("Shut the door.");
                break;
            case 5:
            case 6:
                System.out.println("Pick up the sticks.");
                break;
            case 7:
            case 8:
                System.out.println("Lay them straight.");
                break;
            case 9:
            case 10:
                System.out.println("There's a big fat hen.");
                break;
            default:
                System.out.println("Number has to be between 1 and 10.");
                break;
        }
    }
}
