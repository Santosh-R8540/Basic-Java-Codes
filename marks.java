import java.util.*;
public class marks {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the marks of a student :");
        int marks = sc.nextInt();
        
    
        
        if(marks >= 33) {
            System.out.println("The Student will be pass");
            
        }
        if(marks <= 33) {
            System.out.println("The Student will be defenaitely fail");
            
        }
        
        
    }
    
    
}
