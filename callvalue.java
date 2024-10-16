import java.util.*;
public class callvalue {

    static  void swap(int a, int b) {

        int temp = a;
        a = b;
        b =  temp;

        System.out.println("a = " +a);
        System.out.println("b = " +b);



    }
    public static void main(String[] args) {

        int a = 9;
        int b = 7;

        
        swap(a, b);

        

    }
}
