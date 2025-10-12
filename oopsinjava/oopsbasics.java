// package oopsinjava;

import java.util.Scanner;

class Person {
    String Name;
    int age;
    
    void input(String n, int a) {
        Name = n;
        age = a;
    }
    
    void output() {
        System.out.println("Name = " + Name);
        System.out.println("Age = " + age);
    }
}


    public class oopsbasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Person p = new Person();
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        p.input(name, age);
        p.output();
    }
}


