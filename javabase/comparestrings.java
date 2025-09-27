public class comparestrings {
    public static void main(String[] args) {
        String name1 = "guts";
        String name2 = "guts";
        // String name2 = "beserker";
        // s1 > s2 : +ve value
        // s1 == s2 : 0
        // s1 < s2 : -ve value
        if(name1.compareTo(name2) == 0) {
            System.out.println("strings are equal");
            }else{
                System.out.println("strings are not equal");
            }
        }
    }

