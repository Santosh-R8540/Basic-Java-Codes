import java.util.*;

public class Numbino {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int bincoeff(int n, int r) {
        if (r > n || r < 0) {
            return 0; // Binomial coefficient is not defined for these values
        }
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        return fact_n / (fact_r * fact_nmr);
    }

    public static void main(String[] args) {
        System.out.println(bincoeff(5, 2)); // Output should be 10
    }
}