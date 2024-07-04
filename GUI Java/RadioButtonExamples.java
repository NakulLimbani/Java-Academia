import javax.swing.*;
import java.awt.event.*;
class RadioButtonExamples extends JFrame implements ActionListener
{
JCheckBox rb1,rb2;
JButton b;
RadioButtonExamples()
{
rb1=new JCheckBox("Male",true);
rb1.setBounds(100,50,100,30);
rb2=new JCheckBox("Female");
rb2.setBounds(100,100,100,30);
b=new JButton("click");
b.setBounds(100,150,80,30);
b.addActionListener(this);
add(rb1);add(rb2);add(b);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(rb1.isSelected()){
JOptionPane.showMessageDialog(this,"You are Male.");
}
if(rb2.isSelected()){
JOptionPane.showMessageDialog(this,"You are Female.");
} }
public static void main(String args[]){
new RadioButtonExamples();
}}