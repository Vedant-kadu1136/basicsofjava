// package javaswing;
import javax.swing.*;

public class swingbasics {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        //set width and height
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        // set labels 
        JLabel l1 = new JLabel("click the button");
        l1.setBounds(120, 65, 100, 30);
        frame.add(l1);

        // set buttons
        JButton b1 = new JButton("click me");
        b1.setBounds(120, 100, 100, 50);
        frame.add(b1);
    }
}
