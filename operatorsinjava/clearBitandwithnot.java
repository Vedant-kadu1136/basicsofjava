public class clearBitandwithnot {
    public static void main(String[] args) {
         int n = 5;
        int position = 2;
        int bitmask = 1<<position;
        int notBitmask = ~(bitmask);
        
        int newNumber = notBitmask & n;
        System.out.println(newNumber);
    }
}
