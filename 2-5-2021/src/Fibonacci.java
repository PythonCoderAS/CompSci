import java.util.Scanner;

public class Fibonacci {
    public static long fibonacci(int n){
        if (n == 0 || n == 1){
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which month would you like the rabbit count for?: ");
        System.out.println("There will be " + fibonacci(scanner.nextInt()) + " rabbits.");
    }
}
