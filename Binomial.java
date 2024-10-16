import java.util.*;
public class Binomial {

    public static  int product(int a , int b) {

        int product = a * b;
        return product;

    }
    

    public static int bincoeff(int n, int r) {
       int fact_n = factorial(n);
       int fact_r = factorial(r);
       int fact_nmr = factorial(n-r);



       int bincoeff = fact_n / (fact_r * fact_nmr);
       return Bincoeff;
        }
        
        

    }
    public static void main(String[] args) {

         System.out.println(bincoeff(5, 2)));

        
       

    }
}
