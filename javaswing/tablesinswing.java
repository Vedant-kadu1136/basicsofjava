import javax.swing.JFrame;
import javax.swing.JTable;

public class tablesinswing {
     public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        String columns[] = {"ID", "Name", "salary"};
        String data [][] = {{"101", "asdf", "12344"},
                            {"012", "ghjk", "56787"},
                            {"013", "dsfg", "67853"}};
            
        JTable tb1 = new JTable(data,columns);
        tb1.setBounds(30,70,300,400);
        frame.add(tb1);
}
}