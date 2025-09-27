import java.util.Scanner;
public class tofindparticularindexinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows");
        int row = sc.nextInt();
        System.out.print("enter column");
        int column = sc.nextInt();

        int[][] numbers = new int[row][column];
        // input
        for (int i = 0; i < row; i++) {
            // column
            for (int j = 0; j < column; j++) {
                numbers[i][j] = sc.nextInt();

            }
        }
        System.out.print("enter the number you want to find the index of : ");
        int x = sc.nextInt();


        for (int i = 0; i < row; i++) {
            // column
            for (int j = 0; j < column; j++) {
            if(numbers[i][j] == x){
             System.out.println("index found at location (" + i + " , " + j + ")");
            }
         }
            System.out.println();
            
        }
        sc.close();
    } 

}


