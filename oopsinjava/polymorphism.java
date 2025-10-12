// package oopsinjava;


    // //run time polymorohism
// class A {
//      void show(){
//         System.out.println("class A");
//      }
// }

// class B extends A {
//     void show (){
//         System.out.println("class B");
//     }
// }
// public class javapolymorphysm {
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.show();
//     }
// }




//-----------------------------------------------------------------------------------------------------------

//compile time polymorphism
class A {
    int age;
    String name;
     void show(int a){
     age = a;
        System.out.println("Age = " + age);
     }
}

class B extends A {
    void show (int a , String n){
        age = a;
        name = n;
        System.out.println("the age is " + age);
        System.out.println("the name is " + name);
    }
}
    public class polymorphism {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(2342324,"guts");
    }
}


