// public class loopsBasics {
//     public static void main (String args[]) {
//         int counter = 0;
//         while(counter < 10) {
//             System.out.println("Santosh");
//             counter++;

//         }
//             System.out.println("printed Santosh 100x");

//     }
    
// }

import java.util.*;

public class loopsBasics {
public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int counter = 1;
    int num = sc.nextInt();
    
    while(counter <= num){
        System.out.print(counter+" " );
         counter=counter+12;
        }
        sc.close();
    }
}