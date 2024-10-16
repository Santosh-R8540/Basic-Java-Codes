import java.util.*;
public class product {

    static  void swap(int a, int b) {

        int temp = a;
        a = b;
        b =  temp;

       

    }

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;

    }
    public static void main(String[] args) {

        int a = 9;
        int b = 7;
       int prod = multiply(a,b);
       System.out.println("a * b =" + prod);

        
       

    }
}
