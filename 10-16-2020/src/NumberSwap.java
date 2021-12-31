import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 1000: ");
        int n = scanner.nextInt();
        // 123 -> 100 + (3 * 10) + 2 -> 132
        int new_number = getRemainingNumber(n) + getOnesDigit(n) * 10 + getTensDigit(n);
        System.out.println("Swapped number: "+new_number);
    }
    public static int getTensDigit(int n){
        // 123 -> 2
        return (n % 100) / 10;
    }

    public static int getOnesDigit(int n){
        // 123 -> 3
        return n % 10;
    }

    public static int getRemainingNumber(int n){
        // 123 - (2*10) - 3 = 100
        return n - (getTensDigit(n) * 10) - getOnesDigit(n);
    }
}
