import java.util.*;
public class javasubstractionfunction {
    public static int substractionFunction(int a, int b) {
        int subs = a - b;
        return subs;

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number 1 : ");
        int a = sc.nextInt();
        System.out.print("enter a number 2 : ");
        int b = sc.nextInt();
int subs = substractionFunction(a, b);
System.out.println("the substraction is "+ subs);
sc.close();



    }
}
