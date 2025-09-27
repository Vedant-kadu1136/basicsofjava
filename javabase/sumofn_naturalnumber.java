import java.util.*;
public class sumofn_naturalnumber {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum = sum + i;

        }
        
        System.out.println("The output is " + sum);
        sc.close();

    }
}
