import java.awt.Color;

import javax.swing.*;
class Example{
    public static void main(String args[]) {
        JFrame F = new JFrame("Example");
        F.getContentPane().setBackground(Color.BLUE);

        JTextField J = new JTextField("Hello World");
        JTextField J1 = new JTextField("What Is Your Name");
        J.setBounds(150,150,200,30);
        J1.setBounds(150,200,200,30);

        JCheckBoxMenuItem c = new JCheckBoxMenuItem("Nakul");
        JCheckBox c1 = new JCheckBox("Shiv");
        c.setBounds(150,250,200,30);
        c1.setBounds(150,300,200,30);

        JPasswordField P = new JPasswordField();
        P.setBounds(150,350,200,30);

        JMenu M = new JMenu("Menu");
        JMenu M0 = new JMenu("Menu 1");
        JMenu M1 = new JMenu("Item 2");
        JMenu i1 = new JMenu("SUb 1");
        JMenuBar mb = new JMenuBar();
        
        mb.setBounds(0,0,900,40);
        //M.setBounds(150,400,200,30);
        
        M.add(M0);
        M.add(M1);
        M0.add(i1);
        mb.add(M);
        String[] s1 = {"datasset" , "Sets" , "Ferrari"};
        JList L = new JList(s1);
        L.setBounds(72, 450, 300, 300);


        
        F.add(J);
        F.add(J1);
        F.add(c);
        F.add(c1);
        F.add(P);
        F.add(mb);
        F.add(L);
 
        F.setSize(1000,1000); 
        F.setLayout(null);
        F.setVisible(true);
        
    }

    
}