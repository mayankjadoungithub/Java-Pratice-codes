import javax.swing.*;
public class JButtonEx{
public static void main(String [] a){
JFrame f = new JFrame("Button Example");
JButton b = new JButton("Click Here");
b.setBound(50,100,95,30);
f.add(b);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
}