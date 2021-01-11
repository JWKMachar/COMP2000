package Classes;

import javax.swing.*;

public class Decline {
    private JButton declinedButton;
    private JPanel panel1;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Decline");
        frame.setContentPane(new Decline().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
