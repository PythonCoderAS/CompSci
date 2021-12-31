import java.util.Scanner;

public class CToF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Specify the temperature in degrees Celsius: ");
        double temperature = scanner.nextDouble();
        double fahrenheit = ((double) 9 / 5) * temperature + 32;
        System.out.println(temperature + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
    }
}
