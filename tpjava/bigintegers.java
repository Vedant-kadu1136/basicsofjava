import java.math.BigInteger;

public class bigintegers {
public static void printNumb(BigInteger n){
    while(n.compareTo(BigInteger.ZERO)>0){
    System.out.println(n);
    n = (n.subtract(BigInteger.ONE));
    }
}

    public static void main(String[] args) {
     System.out.println("learning recursion");
     BigInteger n = new BigInteger("100000");
    printNumb(n);
    } 

}


