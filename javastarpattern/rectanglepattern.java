// package javastarpattern;

import java.util.*;

public class rectanglepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a column : ");
        int column = sc.nextInt();
        System.out.print("enter a rows : ");
        int row = sc.nextInt();
        for(int i = 0; i < column; i++){
        for(int j = 0; j < row; j++){
            System.out.print("*");
        }
        System.out.println("*");
        
    }
    sc.close();
    }
    
}
