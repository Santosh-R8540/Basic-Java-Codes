import java.util.*;
public class InvertedPattern {

    public static void main(String args[]) {
        int n= 4;
        for(int Line=1 ; Line<=n ; Line++) {
            for(int star=1; star<=n-Line+1; star++) {
                System.out.print("*");

            }

            System.out.println();

        } 


       
    }

        

    
}
