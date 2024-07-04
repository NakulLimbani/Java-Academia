import javax.swing.*;
class TextFieldExample
{
    public static void main(String args[])
    {
        JFrame f = new JFrame("Text Field Example");
        JRadioButton b1;

        JTextField t1,t2,t3;
        JTextArea T1;
        t1 = new JTextField("Welcome To Java.");
        t1.setBounds(150,100,200,30);
        t2 = new JTextField("Swing Tutorial.");
        t2.setBounds(150,150,200,30);
        t3 = new JTextField("How Are You?");
        t3.setBounds(150,200,200,30);
        b1 = new JRadioButton("Nakul Limbani");
        b1.setBounds(150,250,200,30);
        T1 = new JTextArea();
        T1.setBounds(150,300,200,30);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.add(T1);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}