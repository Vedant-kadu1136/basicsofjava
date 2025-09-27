import java.util.Scanner;

public class javastrings {
    public static void main(String[] args) {
        // concatination
        String firstname = "Roronoa";
        String lastname  = "Zoro";
        Scanner sc = new Scanner(System.in);
        String fullname = firstname +" " + lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());// tells the length of your name
        System.out.println(lastname);
        String sentence = "my name is Roronoa Zoro";
        System.out.println(sentence);
        System.out.print("enter your name : ");
        String name = sc.nextLine();
        System.out.println("your name is : " + name);

        //charAt

        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));

        }

        
    }
}
