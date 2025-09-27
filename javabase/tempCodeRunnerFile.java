import java.util.*;
public class stringandsubstring {
    public static void main(String[] args) {
        String sentence = "guts beserker the black swordsmen";
        String name = sentence.substring(18, 24, sentence.length());
        System.out.println(name);
    }
}
