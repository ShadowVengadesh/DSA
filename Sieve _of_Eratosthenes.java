//Sieve of Eratosthenes algorithm for generate n prime numbers
//the file can't be run directly because of the inappropriate file name
import java.util.Arrays;

public class PrimeSieve {

    public static void main(String[] args) {
        int n = 100;  // Find all primes ≤ 100
        boolean[] isPrime = sieve(n);

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);  // Assume all are prime
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                // Mark multiples of i as non-prime
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }
}
