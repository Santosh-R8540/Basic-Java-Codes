
import java.util.*;
public class soln2 {
    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter thr pencil");
        float pencil = sc.nextFloat();
        System.out.print("enter thr pen");
         float pen = sc.nextFloat();
         System.out.print("enter thr eraser");
         float eraser = sc.nextFloat();
         
         float total = pencil + pen + eraser;
         
          System.out.println("The Bill is :" +total);
          
          float newTotal = total + (0.18f * total);
          System.out.println("The Bill is :" +newTotal); 
          
          sc.close();
    }
}