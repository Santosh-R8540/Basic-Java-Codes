import java.util.*;
public class IncomTax {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the tax :");
        int income = sc.nextInt();
        
        int tax;
        

        if(income < 500000) {
            tax = 0;
        }
         else if(income >= 500000 && income < 1000000) {
            
                tax = (int) (income * 0.3);
            }
            else {
                tax = (int) (income * 0.2);

            }
            System.out.println("Your tax is : " + tax);
            sc.close();
        }
    }
    
