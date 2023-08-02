import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class form extends JOptionPane {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<String>();
        JFrame frame = new JFrame();
        JButton button_1 = new JButton("Sign up");
        JButton button_2 = new JButton("Sign in");
        button_1.setBounds(80, 70, 100, 30);
        button_2.setBounds(200, 70, 100, 30);

        frame.add(button_1);
        frame.add(button_2);

        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame signup = new JFrame();
                JButton sign_up_Button = new JButton("Sign up");
                sign_up_Button.setBounds(210, 120, 100, 30);
                signup.setSize(400, 200);
                JLabel l1 = new JLabel("Name");
                l1.setBounds(60, 10, 80, 40);
                JLabel l2 = new JLabel("Username");
l2.setBounds(60, 40, 80, 40);
                JLabel l3 = new JLabel("Password");
                l3.setBounds(60, 70, 80, 40);
JTextField t1 = new JTextField();
                t1.setBounds(150, 20, 130, 20);
                JTextField t2 = new JTextField();
                t2.setBounds(150, 50, 130, 20);
                JPasswordField t3 = new JPasswordField();
                t3.setBounds(150, 80, 130, 20);

                signup.add(l1);
                signup.add(t1);
                signup.add(l2);
                signup.add(t2);
                signup.add(l3);
                signup.add(t3);
                signup.add(sign_up_Button);

                sign_up_Button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        boolean check = false;
                        char[] pass = t3.getPassword();
                        String passString = new String(pass);
for (int i = 0; i < data.size(); i++) {
                            if (data.get(i).equals(t1.getText().toString())
                                    || data.get(i).equals(t2.getText().toString())
                                    || data.get(i).equals(passString)) {
JOptionPane.showMessageDialog(null,
                                        t1.getText().toString() + " already exists in system");
                                check = true;
                                break;
                            }
                        }
                        if (check == false) {
                            data.add(t1.getText().toString());
                            data.add(t2.getText().toString());
                            data.add(passString);
                            data.add("\t");

                            JOptionPane.showMessageDialog(null,
                                    t1.getText().toString() + " have successfully registered");
                            System.out.println(data);

                        }
                    }
                });
                signup.setLayout(null);
                signup.setVisible(true);
            }
        });

        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame signin = new JFrame();
                JButton sign_in_Button = new JButton("Sign in");
                sign_in_Button.setBounds(210, 120, 100, 30);
                signin.setSize(400, 200);
                JLabel l1 = new JLabel("Username");
                l1.setBounds(60, 40, 80, 40);
                JLabel l2 = new JLabel("Password");
                l2.setBounds(60, 70, 80, 40);

                JTextField t1 = new JTextField();
                t1.setBounds(150, 50, 130, 20);
                JPasswordField t2 = new JPasswordField();
                t2.setBounds(150, 80, 130, 20);

                signin.add(l1);
                signin.add(t1);
                signin.add(l2);
                signin.add(t2);
                signin.add(sign_in_Button);

                sign_in_Button.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        boolean check = false;
                        char[] pass = t2.getPassword();
                        String passString = new String(pass);
for (int i = 0; i < data.size(); i++) {
                            if (data.get(i).equals(t1.getText().toString()) || data.get(i).equals(passString)) {
                                JOptionPane.showMessageDialog(null, "Welcome " + t1.getText().toString());
                                check = true;
                                break;
                            }
                        }
                        if (check == false) {
                            JOptionPane.showMessageDialog(null, "Wrong username / password");

                        }
                    }
                });

                signin.setLayout(null);
                signin.setVisible(true);

            }
});

        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
