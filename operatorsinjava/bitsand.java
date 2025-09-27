public class bitsand {
    public static void main(String[] args) {
        int n = 5;
        int position = 3;
        int bitmask = 1<<position;
        // << mtlb leftshift mtlb jab ham 1 ko leftshift krege with respect to position(integer which is defined) to 1 ban jayega 1000 joki ek binary number hai aur use ham compare krege with int position joki 5 hai to vo bhi binary me convert hoga mtlb 0101 aur fir use compare krege... aur isi ka ulta right shift ke liye 
        
        if((bitmask & n) == 0){
            System.out.println("the bit was zero");
        }else{
            System.out.println("the bit was one");
        }
    }
}
