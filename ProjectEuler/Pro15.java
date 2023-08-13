public class Pro15 {
    /*       C(2k,k) = n!/k! * (n-k)!
    2k = total number of moves
    k = number of moves in a specific direction
     */


    static double factorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }

        return (double) n * factorial(n - 1);
    }

    static double pathsEQ(int size)
    {
        double numerator = factorial(size * 2);
        double denominator = factorial(size) * factorial(size * 2 - size);
        return numerator / denominator;
    }
    public static void main(String[] args)
    {
        double result = pathsEQ(20);
        System.out.printf("%.0f%n", result);
    }
}
