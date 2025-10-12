
import javax.swing.*;

public class optionpaneswing {
      public static void main(String[] args) {
        JFrame frame = new JFrame();
    //    JOptionPane.showMessageDialog(frame, "you are learining java","Alert",JOptionPane.WARNING_MESSAGE);
    String name = JOptionPane.showInputDialog(frame,"enter your name ");
    System.out.println(name);
}
}