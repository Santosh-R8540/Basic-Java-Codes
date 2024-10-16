import java.util.*;
public class reverse {
    public static void main (String args[]) {
        int num = 6847591;

        while(num > 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num = num / 10;


        }
        System.out.println();

    }
    
}
