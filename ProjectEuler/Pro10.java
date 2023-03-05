import java.util.Arrays;

public class Pro10 {

    public static void main(String[] args) {
        int limit = 2000000;
        boolean[] isPrime = new boolean[limit+1];
        long sum = 0;

        // Initialize all elements in isPrime to true
        Arrays.fill(isPrime, true);

        // Set 0 and 1 to not prime
        isPrime[0] = false;
        isPrime[1] = false;

        // Use Sieve of Eratosthenes algorithm to mark non-prime numbers
        for (int i = 2; i <= Math.sqrt(limit); i++) {
            if (isPrime[i]) {
                for (int j = i*i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Add up prime numbers
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

}
