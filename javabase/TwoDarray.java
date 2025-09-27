import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int row = sc.nextInt();
        System.out.println("enter column");
        int column = sc.nextInt();

        int[][] numbers = new int[row][column];
        // input
        for (int i = 0; i < row; i++) {
            // column
            for (int j = 0; j < column; j++) {
                numbers[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < row; i++) {
            // column
            for (int j = 0; j < column; j++) {
                System.out.print(numbers[i][j] + " ");

            }
            System.out.println();
            
        }
        sc.close();
    } 

}
