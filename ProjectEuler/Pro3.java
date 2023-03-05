public class Pro3 {
    public static void main(String[] args) {
        double val = 600851475143d;
        for (double i = 3; i*i <= val; i += 2) {
            if (val % i == 0) {
                val /= i;
                i = 3;
            }
        }
        System.out.println(val);
    }
}