import java.util.*;
public class multiplacationtable {
    public static void main(String[] args) {
        System.out.print("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        for(int i = 1; i < 11; i++){
            
            System.out.println(n + " X " + i + " = " + (i*n));

        }
        
        sc.close();

    }
}


