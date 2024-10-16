
//wrong code

// import java.util.*;

// public class Rangeprime {
//     public static void primesInRange(int n) {
//         for(int i=2; i<=n; i++) {
//             if(isPrime(i)) {    //true
//                 System.out.print(i+" ");
             
//             }
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         primesInRange(20);
        
//     }
    
// }




//wirte method
import java.util.*;

public class Rangeprime {
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(num); i++) { // Check up to the square root of num
            if (num % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, it's prime
    }

    // Method to print all prime numbers in the range from 2 to n
    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        primesInRange(50); // Change the number here to print primes in a different range
    }
}