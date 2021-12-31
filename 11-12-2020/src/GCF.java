import java.util.Scanner;

public class GCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int a = scanner.nextInt();
        System.out.print("Enter another positive number: ");
        int b = scanner.nextInt();
        System.out.println("GCF of " + a + " and " + b + " : " + findGCF(a, b));
    }

    public static int findGCF(int a, int b) {
        if (a == b) {
            return a;
        } else {
            if (a > b) {
                int newa = a - b;
                return findGCF(newa, b);
            } else {
                int newb = b - a;
                return findGCF(a, newb);
            }
        }
    }
}
