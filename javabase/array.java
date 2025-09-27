import java.util.*;
public class array {
    public static void main(String[] args) {
        System.out.println("learning array  ");
    //   //  int marks[] = new int[3];
    //    int marks[] = {1,2,3,4,5,6,67};
    //     marks[0] = 34;
    //     marks[1] = 44;
    //     marks[2] = 94;
    //     // System.out.println(marks[0]);
    //     // System.out.println(marks[1]);
    //     // System.out.println(marks[2]);
    //     for(int i = 0; i<7; i++){
    //         System.out.println(marks[i]);
    //     }
    
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("enter a number : ");
        int x = sc.nextInt();
    
        for(int i = 0; i<size; i++){
            System.out.println(numbers[i]);
            if(numbers[i] == x){
                System.out.println("x found at index : " + i);

            }
        }
        //numbers.length == size mtlb agar hame size naam ka variable define nahi krna hai to ham uski jagah 
        // seedha numbers.length (numbers ki jagah jo bhi naam diya ho uske sath . length krke likhna hai)
        // jaiseki naam hai guts to guts.length thikkk  !!!!
        sc.close();


    }
}
