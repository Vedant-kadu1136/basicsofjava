import java.util.*;
import javax.swing.*;

public class javatextfieldandpass {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    JTextField t1 = new JTextField("user name");
    t1.setBounds(100, 100, 100, 30);
    JPasswordField p1 = new JPasswordField("password");
    p1.setBounds(100, 150, 100, 30);
    JTextArea ta1 = new JTextArea("Enter about yourself");
    ta1.setBounds(100, 200, 300, 30);

    frame.add(ta1);
    frame.add(t1);
    frame.add(p1);


    }
}
