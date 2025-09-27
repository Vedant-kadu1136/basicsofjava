import java.util.*;
public class updatebit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the operation : ");
        int operation = sc.nextInt();
        //operation = 1 : set operation = 0 : clear
        int n = 5; // 0101
        int position = 1;
        int bitmask = 1<<position;

        if(operation == 1){
            // set operation
            int newNumber = bitmask | n;
            System.out.println(newNumber);
        }else{
            //clear
            int newBitmask = ~(bitmask);
            int newNumber = newBitmask & n;
            System.out.println(newNumber);
        }
            

    }
}
