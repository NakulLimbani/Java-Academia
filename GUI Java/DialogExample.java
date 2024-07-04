import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DialogExample {
    

    DialogExample() {
        JDialog d;
        JFrame f = new JFrame();
        d = new JDialog(f, "Dialog Example", true);
        d.setLayout(new FlowLayout());
        JButton b = new JButton("OK");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                d.setVisible(false);
            }
        });
        d.add(b);
        d.setSize(300, 150);
        d.setVisible(true);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new DialogExample();
    }
}
