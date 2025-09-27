import java.util.*;
public class javaforloops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value : ");
        int n = sc.nextInt();
        for(int  i = 0; i < n; i++){
            System.out.print(i + " ");
            
        }
        sc.close();
    }
}
