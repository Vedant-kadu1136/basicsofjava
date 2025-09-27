import java.util.*;

public class factorialfunction {

    public static int printFactorial(int n) {
        int factorial = 1;
// but the factorial of 19 (19!) is:
// 121645100408832000
// This is too large for an int, which can only store values between:
// -2,147,483,648 to 2,147,483,647
// just change the return type and variables from int to long, which supports values up to:
// ±9,223,372,036,854,775,807
// And yes — 19! fits inside a long.
// If you go beyond 20!, even long won’t be enough. For those cases, use:
// import java.math.BigInteger;

        if (n == 1 || n == 0) {
            return 1;
        } else {
            for (int i = n; i >= 1; i--) {
                factorial = factorial * i;
            }
            return factorial;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();

 int factorial = printFactorial(n);
 System.out.println("the factorial of " + n +  " is " + factorial);
 sc.close();
    }
}
