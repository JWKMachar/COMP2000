package Classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Decline {
    private JButton declinedButton;
    private JPanel panel1;

    public Decline() {
        declinedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cash.main(null);
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Decline");
        frame.setContentPane(new Decline().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
