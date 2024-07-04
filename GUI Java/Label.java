import javax.swing.*;
public class Label
{
public static void main(String args[])
{
JFrame frame = new JFrame("My Swing JLabel");
frame.setSize(3000,3000);
JPanel panel = new JPanel();
JLabel heyImageLabel = new JLabel("Nakul");
ImageIcon heyimageIcon = new ImageIcon
("C:/Users/Nakul Limbani/OneDrive/Desktop/Wallpapers/115562.jpg");
heyImageLabel.setIcon(heyimageIcon);
panel.add(heyImageLabel);
frame.add(panel);
frame.setVisible(true);
}
}