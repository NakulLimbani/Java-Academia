import java.awt.*;
import javax.swing.*;
public class BoxLayoutExample1 extends Frame
{
public BoxLayoutExample1 ()
{
Button buttons[] = new Button [10];
for (int i = 0;i<=9; i++) 
{
buttons[i] = new Button("Button " + (i+1));
add(buttons[i]);
}
setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
setSize(400,400);
setVisible(true);
}
public static void main(String args[])
{
 new BoxLayoutExample1();
}
}