public class LargestPrimeFactor {
    /**
     *  Returns true if n is a prime; otherwise returns false
     */
    public static boolean isPrime(long n)
    {
        if (n <= 1)
            return false;

        long m = 2;

        while (m * m <= n)
        {
            if (n % m == 0)
                return false;
            m++;
        }

        return true;
    }

    public static long largestPrime(long n){
        long largest = 0;
        long target = n / 2;
        for (long i=1; i < target; i++){
            if (n % i == 0 && isPrime(i) && i > largest) {
                System.out.println("New largest prime: " + i);
                largest = i;
                target = n / i;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        long n = Long.parseLong("600851475143");
        System.out.println("Largest prime of 600851475143: " + largestPrime(n));
    }
}
