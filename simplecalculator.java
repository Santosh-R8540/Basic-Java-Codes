import java.util.*;
public class simplecalculator {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");

        int a = sc.nextInt();
        System.err.println("Enter b");

        int b = sc.nextInt();
        System.out.println("Enter operator");
        
        char operator = sc.next().charAt(0);


        


        switch(operator) {
            case '+' : System.out.println(a+b);


            case '-' : System.out.println(a-b);

            case '*' : System.out.println(a*b);

            case '%' : System.out.println(a%b);

            case '/' : System.out.println(a/b);
            
        }

    }
    
}
