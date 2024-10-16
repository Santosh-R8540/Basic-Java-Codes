import java.util.*;
public class Datatypesoverloding {

    //fun to call int sum
    public static int sum(int a, int b) {
        return a+b;
    }

    //fun to calculate flote sum
    public static  float sum(float a, float b) {
        return a+b;
}
    public static void main(String args[]) {
        System.out.println(sum(8, 4));
        System.out.println(sum(8.4f, 9.7f));
        

    }
}