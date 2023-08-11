public class Pro14 {

    static int[] memo; // Memoization array

    public static int alg(long n)
    {
        if (n <= 1)
        {
            return 1;
        }

        if (n < memo.length && memo[(int) n] != 0)
        {
            return memo[(int) n];
        }

        long next;
        if (n % 2 == 0)
        {
            next = n / 2;
        }
        else
        {
            next = 3 * n + 1;
        }

        int steps = 1 + alg(next);

        if (n < memo.length)
        {
            memo[(int) n] = steps;
        }

        return steps;
    }

    public static int loopy()
    {
        int maxCount = 0;
        int startingNumber = 0;

        for (int i = 2; i < 1000000; i++) { // Start from 2 to 999999
            int count = alg(i);

            if (count > maxCount)
            {
                maxCount = count;
                startingNumber = i;
            }
        }

        System.out.println("Longest sequence length: " + maxCount);
        return startingNumber;
    }

    public static void main(String[] args)
    {
        memo = new int[1000000]; // Initialize the memoization array
        System.out.println("Starting number: " + loopy());
    }
}
