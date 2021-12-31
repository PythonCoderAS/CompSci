import java.util.Scanner;

public class MyMath {
    /**
     * Returns the sum of all integers from 1 to n, if n >= 1,
     * and 0 otherwise.
     */

    public static int sumUpTo(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum += i;

        return sum;
    }


    /**
     * Returns 1 * 2 * ... * n, if n >= 1; otherwise returns 1
     */

    public static long factorial(int n) {
        long f = 1;

        for (int k = 2; k <= n; k++)
            f *= k;

        return f;
    }

    /**
     * Returns true if n is a prime; otherwise returns false
     */
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        int m = 2;

        while (m * m <= n) {
            if (n % m == 0)
                return false;
            m++;
        }

        return true;
    }

    /**
     * Tests Goldbach conjecture for even numbers
     * up to bigNum
     */
    public static boolean testGoldbach(int bigNum) {
        for (int n = 6; n <= bigNum; n += 2)  // obviously true for n = 4
        {
            boolean found2primes = false;

            for (int p = 3; p <= n / 2; p += 2) {
                if (isPrime(p) && isPrime(n - p))
                    found2primes = true;
            }

            if (!found2primes) {
                System.out.println(n + " is not a sum of two primes!");
                return false;
            }
        }

        return true;
    }


    /**
     * Find the first FOUR perfect numbers!
     * Add your method here!
     * Use the methods provided above to avoid redundency!!
     */
    //public static long findPerfectNumber(...){...}
    public static boolean sumOfFactors(long number) {
        long factorsum = 0;
        for (long i = 1; i < number; i++) {
            if (number % i == 0) {
                factorsum += i;
            }
        }
        return factorsum == number;
    }

    public static void findPerfectNumber() {
        int numbersFound = 0;
        long i = 1;
        while (numbersFound < 4) {
            i++;
            if (sumOfFactors(i)) {
                numbersFound++;
                System.out.println("Perfect number #" + numbersFound + ": " + i);
            }
        }
    }

    public static void findMersennePrimes() {
        int found = 0;
        int i = 1;
        long n = 0;
        while (found < 6) {
            i++;
            n = (long) (Math.pow(2, i) - 1);
            if (isPrime((int) n)) {
                found++;
                System.out.println("Mersenne Prime #" + found + ": " + n);
            }
        }
    }


    /*********************************************************************/

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter an integer from 4 to 20: ");
            n = kb.nextInt();
        } while (n < 4 || n > 20);

        System.out.println();
        System.out.println("1 + ... + " + n + " = " + sumUpTo(n));
        System.out.println(n + "! = " + factorial(n));
        System.out.println("Primes: ");
        for (int k = 1; k <= n; k++)
            if (isPrime(k))
                System.out.print(k + " ");
        System.out.println();
        System.out.println("Goldbach conjecture up to " + n + ": " + testGoldbach(n));


        /**
         *add statement(s) here to print out the first FOUR perfect numbers
         */
        findPerfectNumber();
        findMersennePrimes();

        kb.close();
    }
}
