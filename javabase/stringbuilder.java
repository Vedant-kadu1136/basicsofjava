public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("beserker");
        System.out.println(sb);
        //char at index 0
        System.out.println(sb.charAt(0));
        
        //set char at index 0
        sb.setCharAt(0, 'B');
        System.out.println(sb);
        sb.insert(0,'R');
        System.out.println(sb);
        
        // delete the extra 'R'
        sb.delete(0,1);
        System.out.println(sb);
        
        //append using
        sb.append("r");
        sb.append(" ");
        sb.append("G");
        sb.append("u");
        sb.append("t");
        sb.append("s");
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
        
    }
}
