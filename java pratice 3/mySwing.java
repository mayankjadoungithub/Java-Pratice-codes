import javax.swing.*;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.*;

class mySwing extends JOptionPane {

    public static void main(String[] args) {

        JFrame f = new JFrame();
JLabel lb1 = new JLabel("Name");
        JTextField t1 = new JTextField("Enter name");
        JLabel lb2 = new JLabel("E-mail ID");
        JTextField t2 = new JTextField("Enter E-mail");
        JLabel lb3 = new JLabel("Create Password");
        JTextField t3 = new JTextField("Type Password here");
        JLabel lb4 = new JLabel("Confirm Password");
        JTextField t4 = new JTextField("Confirm Password here");
        JLabel lb5 = new JLabel("Country");
        JTextField t5 = new JTextField("Type country name");
        JLabel lb6 = new JLabel("State");
        JTextField t6 = new JTextField("Type state name");
        JLabel lb7 = new JLabel("Phone No.");
        JTextField t7 = new JTextField("Type phone no.");
JButton b1 = new JButton("Submit");
        JButton b2 = new JButton("Clear");

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        JOptionPane.showMessageDialog(null, "Data Saved Successfully");

        f.add(lb1);
        f.add(t1);
        f.add(lb2);
f.add(t2);

        f.add(lb3);
        f.add(t3);

        f.add(lb4);
        f.add(t4);
        f.add(lb5);
        f.add(t5);
        f.add(lb6);
        f.add(t6);
        f.add(lb7);
        f.add(t7);
        f.add(b1);
        f.add(b2);

        f.setSize(400, 200);
        f.setLayout(new GridLayout(8, 2));
        f.setVisible(true);

    }
}

