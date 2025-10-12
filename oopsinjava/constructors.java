// package oopsinjava;

// Define a class using only constructors
class Person {
    String name;
    int age;
    
    // Default constructor
    Person() {
        name = "Unknown";
        age = 0;
        System.out.println("Default constructor called");
    }
    
    // Parameterized constructor
    Person(String personName, int personAge) {
        name = personName;
        age = personAge;
        System.out.println("Parameterized constructor called");
    }
    
    // Another parameterized constructor with different parameters
    Person(String personName) {
        name = personName;
        age = 18; // default age
        System.out.println("Single-parameter constructor called");
    }
    
    // Constructor to copy another Person
    Person(Person p) {
        name = p.name;
        age = p.age;
        System.out.println("Copy constructor called");
    }
}

public class constructors {
    public static void main(String[] args) {
        
    

// Using default constructor
Person p1 = new Person();

// Using parameterized constructor
Person p2 = new Person("Alice", 25);

// Using single-parameter constructor
Person p3 = new Person("Bob");

// Using copy constructor
Person p4 = new Person(p2);

// Output details
        System.out.println("\nPerson 1: " + p1.name + ", " + p1.age);
        System.out.println("Person 2: " + p2.name + ", " + p2.age);
        System.out.println("Person 3: " + p3.name + ", " + p3.age);
        System.out.println("Person 4: " + p4.name + ", " + p4.age);
    }
}


