import java.util.Scanner;

public class reversedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();
        String newString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            if (i == input.length() - 1) {
                newString += input.substring(i);
            } else {
                newString += input.substring(i, i + 1);
            }
        }
        System.out.println("Reversed String: " + newString);
    }
}
