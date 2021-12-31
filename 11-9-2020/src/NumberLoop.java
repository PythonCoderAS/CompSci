public class NumberLoop {
    public static void main(String[] args) {
        int numbersInCurrentLine = 0;
        int i = 100;
        int limit = 1000;
        while (i <= limit) {
            if (i % 5 == 0 && i % 6 == 0) {
                if (numbersInCurrentLine == 10) {
                    System.out.println();
                    numbersInCurrentLine = 0;
                }
                System.out.print(i + " ");
                numbersInCurrentLine++;
            }
            i++;
        }
    }
}
