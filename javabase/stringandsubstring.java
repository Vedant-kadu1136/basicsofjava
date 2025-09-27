import java.util.*;
public class stringandsubstring {
    public static void main(String[] args) {
        String sentence = "guts beserker the black swordsmen";
        String part1 = sentence.substring(0,18);
        String part2 = sentence.substring(24);
        String result = part1 + part2;
        System.out.println(result);

        // strings are immutable meaning we cant change thing inside strings for that we have to create new strings
    }
}
