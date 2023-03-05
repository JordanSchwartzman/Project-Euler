public class Pro12 {
    public static void main(String[] args) {
        int i = 1;
        int n = 1;
        int divisors = 0;
        while (divisors <= 500) {
            divisors = 0;
            i++;
            n += i;
            for (int j = 1; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    divisors += 2;
                }
            }
            if (Math.sqrt(n) * Math.sqrt(n) == n) {
                divisors--;
            }
        }
        System.out.println(n);
    }
}
