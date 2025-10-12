import javax.swing.*;

public class comboboxradiobutton {
     public static void main(String[] args) {
        JFrame frame = new JFrame("Main frame");
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        JLabel l1 = new JLabel("which is your favorite language");
        l1.setBounds(50,30,300,30);
        frame.add(l1);

        //checkbox 

        JCheckBox chkbox1 = new JCheckBox("c++");
        chkbox1.setBounds(50,60,60,30);
        frame.add(chkbox1);

         JCheckBox chkbox2 = new JCheckBox("Java");
        chkbox2.setBounds(50,90,60,30);
        frame.add(chkbox2);

           // radiobuttton

        JRadioButton rb1 = new JRadioButton("python");
        rb1.setBounds(50,120,80,30);
        frame.add(rb1);

         JRadioButton rb2 = new JRadioButton("javascript");
        rb2.setBounds(50,150,150,30);
        frame.add(rb2);

           //combobox 

        String data[] = {"c++","python","java","javascript"};
        JComboBox<String> combobox1 = new JComboBox<String>(data);
        combobox1.setBounds(50,180,100,30);
        frame.add(combobox1);

}

}


