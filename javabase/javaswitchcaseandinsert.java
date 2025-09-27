import java.util.*;
public class javaswitchcaseandinsert {
    public static void main(String[] args) {
        System.out.println("enter a number please : ");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button) {
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("namaste");
            break;
            case 3 : System.out.println("hell yeahh");
            break;
            default : System.out.println("something went wrong");  
        }

        sc.close();
    }
}


